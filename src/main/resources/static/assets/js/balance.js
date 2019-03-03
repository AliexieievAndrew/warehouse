$(function () {
    var $balanceTable = $('#balanceTable');
    if($balanceTable.length) {
        var jsonUrl = window.contextRoot + '/detail/balance';
        console.log('hello');
        $balanceTable.DataTable({
            dom: 'lBfrtip',
            lengthMenu: [[10,50,-1], ["10","50","All"]],
            buttons: [
                'copy', 'csv', 'excel', 'pdf', 'print'
            ],
            ajax: {
                url: jsonUrl,
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
                    data: 'balance'
                }
            ]
        });
    }
});