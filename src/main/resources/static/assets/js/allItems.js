$(function () {
    var urlItem = window.contextRoot + '/item/all';
    var jsonItem;
    $.ajax({
        type: "GET",
        url: urlItem,
        dataType: "json",
        async: false,
        success: function (data) {
            jsonItem = data
        },

    });

    $(function () {
        $('input[name = "itemList"]').autocomplete({
            source: $.map(jsonItem,function (item) {
                return {
                    label: item.name,
                    value: item.name
                }
            }),
            autoFill: true,
            minLength: 1,
            focus: function (event, ui) {
                $(event).val(ui.item.label);
            },
            select: function (event, ui) {
                $(event).val(ui.item.label);
            },
            change: function (event, ui) {
                if (!ui.item) {
                    $(this).val('');
                }
            }
        });
    });

    $('#generateReport').on('click', function () {

        var dateFrom = $('#date_from').data('datepicker').getFormattedDate('yyyy-mm-dd') + ' 00:00';
        var dateTo = $('#date_to').data('datepicker').getFormattedDate('yyyy-mm-dd') + ' 23:59';

        var requestData = {item: $('#itemList').val(), dateFrom: dateFrom, dateTo: dateTo};


        var urlRange = window.contextRoot +
            '/detail/range-items?item=' + requestData.item +
            '&dateFrom=' + requestData.dateFrom +
            '&dateTo=' + requestData.dateTo;

        var jsonChartRangeItem;
        $.ajax({
            type: "GET",
            url: urlRange,
            dataType: "json",
            async: false,
            success: function (data) {
                jsonChartRangeItem = data
            }

        });
        console.log(jsonChartRangeItem);
    });

});