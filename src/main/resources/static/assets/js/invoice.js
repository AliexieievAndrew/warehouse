$(function () {
    var $invoiceTable = $('#detailTable');
    if($invoiceTable.length) {
        console.log(window.documentId)
        var jsonUrl = window.contextRoot + '/documents/document/' + window.documentId;
        $invoiceTable.DataTable({

            // https://datatables.net/examples/advanced_init/footer_callback.html
            "footerCallback":  function (row, data, start, end, display) {
                var api = this.api(), data;
                // Remove the formatting to get integer data for summation
                var intVal = function ( i ) {
                    return typeof i === 'string' ?
                        i.replace(/[\$,]/g, '')*1 :
                        typeof i === 'number' ?
                            i : 0;
                };

                // Total over all pages
                total = api
                    .column( 4 )
                    .data()
                    .reduce( function (a, b) {
                        return intVal(a) + intVal(b);
                    }, 0 );
                // Total over this page
                pageTotal = api
                    .column( 6, { page: 'current'} )
                    .data()
                    .reduce( function (a, b) {
                        return intVal(a) + intVal(b);
                    }, 0 );
                // Update footer
                $( api.column( 6 ).footer() ).html(
                    '$'+pageTotal
                    // +' ( $'+ total +' total)'
                );


            },
            dom: 'lBfrtip',
            lengthMenu: [[-1], ["All"]],
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
                },
                {
                    data: 'total'
                }
            ]
        });
    }
});