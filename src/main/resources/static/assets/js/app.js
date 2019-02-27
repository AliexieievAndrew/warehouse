$(function () {
    var $incomeInvoicesTable = $('#incomeInvoicesTable');
    console.log('HELLLOOOO');
    if ($incomeInvoicesTable.length) {
        var jsonUrl = window.contextRoot + '/documents/findAll';
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
                        return '<a href="/documents/' + data + '"> details -> </a>'
                    }
                }
            ]
        });
    }
});