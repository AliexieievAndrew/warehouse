$(function () {
    $(document).ready(function () {
        var url = window.contextRoot + '/item/all';
        var dataJson;

        // getting JSON from url (in main thread !)
        $.ajax({
            type: "GET",
            url: url,
            dataType: "json",
            async: false,
            success: function (data) {
                dataJson = data
            },

        });

        // creating table
        var table = $('#createOutcomeInvoice').DataTable({

            "columnDefs": [{
                "targets": -1,
                "data": null,
                "defaultContent": "<i class=\"far fa-trash-alt\"></i>"
            }],
            "searching": false,
            dom: 'lBfrtip',
            lengthMenu: [[-1], ["All"]],
            buttons: [],
        });

        // add new row with autocomplete function. Autocomplete using JSON
        $('#addRowOutcomeInvoice').on('click', function () {
            table.row.add([
                '<td><input class="input-flat"  id="item" name="item" placeholder ="..." ></td>',
                '<td><input class="input-flat" type="number" id="credit" name="credit" min="1" value="1"></td>',
            ]).draw(false);

            $(function () {
                $('input[name = "item"]').autocomplete({
                    source: $.map(dataJson,function (item) {
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
        });

        // Removing row
        $('#createOutcomeInvoice tbody').on('click', 'i', function () {
            table.row($(this).parents('tr')).remove().draw(false);
        });

        // Automatically add a first row of data
        $('#addRowOutcomeInvoice').click();


        // convert table to json
        $('#submitFormOutcomeInvoice').on('click', function() {
            var urlPost = window.contextRoot + '/documents/document/create/outcomeinvoice';
            var numTabs = table.rows().count();

            var tableTBodyData = $('tbody tr').map(function () {
               var obj = {};
               $(this).find('input, select').each(function () {
                   obj[this.name] = $(this).val();
               });
               return obj;
            }).get();

            $.ajax({
                url: urlPost,
                type: 'POST',
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(tableTBodyData)
            });
            alert('document added successfully');

            // clearing table and add first empty row
            $('#createOutcomeInvoice').dataTable().fnClearTable();
            $('#addRowOutcomeInvoice').click();
        });
    });
});