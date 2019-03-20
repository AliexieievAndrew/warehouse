$(function () {
    var $balanceItemTable = $('#balanceItemTable');
    var item = window.item;
    if($balanceItemTable.length) {
        var url = window.contextRoot + '/detail/balance/' + item;

        $balanceItemTable.DataTable({
            dom: 'lBfrtip',
            lengthMenu: [[10,50,-1], ["10","50","All"]],
            buttons: [
                'copy', 'csv', 'excel', 'pdf', 'print'
            ],
            ajax: {
                url: url,
                dataSrc: ''
            },
            columns: [
                {
                    data: 'item',
                    mRender: function (data,type,row) {
                        return data.name;
                    }
                },
                {
                    data: 'debit'
                },
                {
                    data: 'credit'
                },
                {
                    data: 'price'
                },
                {
                    data: 'total'
                }
            ]
        });
    }
});