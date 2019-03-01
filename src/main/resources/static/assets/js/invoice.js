$(function () {
    var $invoiceTable = $('#detailTable');
    if($invoiceTable.length) {
        console.log(window.documentId)
        var jsonUrl = window.contextRoot + '/documents/document/' + window.documentId;
        $invoiceTable.DataTable({
            dom: 'lBfrtip',
            lengthMenu: [[-1, 10, 20, 50], ["All", 10, 20, 50]],
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
                    data: 'item',
                    mRender: function (data,type,row) {
                        return data.subCategory.category.name;
                    }
                },
                {
                    data: 'item',
                    mRender: function (data,type,row) {
                        return data.subCategory.name;
                    }
                },
                {
                    data: 'price'
                },
                {
                    data: 'debit'
                },
                {
                    data: 'credit'
                }
            ]
        });
    }
});