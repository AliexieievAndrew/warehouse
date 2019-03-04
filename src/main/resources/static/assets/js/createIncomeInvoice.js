$(function () {
    $(document).ready(function () {
        var table = $('#createIncomeInvoice').DataTable({
            "columnDefs": [ {
                "targets": -1,
                "data": null,
                "defaultContent": "<i class=\"far fa-trash-alt\"></i>"
            } ],
            dom: 'lBfrtip',
            lengthMenu: [[-1], ["All"]]
            ,
            buttons: [
            ]
        });


        // add new row
        $('#addRow').on('click', function () {
            table.row.add([
                '<td><input type="text" id="category" name="category" value="testcategory"></td>',
                '<td><input type="text" id="subCategory" name="subCategory" value="testsubcategory"></td>',
                '<td><input type="text" id="name" name="name" value="testname"></td>',
                '<td><input type="text" id="price" name="price" value="testprice"></td>',
                '<td><input type="text" id="debit" name="debit" value="testdebit"></td>'
            ]).draw(false);
        });


        // Removing row
        $('#createIncomeInvoice tbody').on('click','i',function(){
            table.row($(this).parents('tr')).remove().draw(false);
        });


        // Automatically add a first row of data
        $('#addRow').click();
    });
});