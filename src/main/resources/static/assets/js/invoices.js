$(function () {
    var $incomeInvoicesTable = $('#invoicesTable');

    if ($incomeInvoicesTable.length) {
        var jsonUrl;

        if (window.documentType == 1){
            jsonUrl = window.contextRoot + '/documents/incomeInvoices';
        }
        if (window.documentType == 2){
            jsonUrl = window.contextRoot + '/documents/outcomeInvoices';
        }
        $incomeInvoicesTable.DataTable({
            "autoWidth": false,
            dom: 'lBfrtip',
            lengthMenu: [[10,50,100,-1], ["10","50","100","All"]],
            buttons: [
                'copy', 'csv', 'excel', 'pdf', 'print'
            ],
            ajax: {
                url: jsonUrl,
                dataSrc: ''
            },
            columns: [
                {
                    data: 'id'
                },
                {
                    data: 'documentType',
                    mRender: function (data,type,row) {
                        return data.name;
                    }
                },
                {
                    data: 'date'
                },
                {
                    data: 'id',
                    bSortable: false,
                    mRender: function (data,type,row) {
                        return '<a href="/invoices/invoice/' + data + '"><span class="fas fa-info-circle"></span></a>'
                    }
                }
            ]
        });
    }
});