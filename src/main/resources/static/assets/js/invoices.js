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
        console.log(jsonUrl);
        $incomeInvoicesTable.DataTable({
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
                        return '<a href="/invoices/invoice/' + data + '"> details -> </a>'
                    }
                }
            ]
        });
    }
});