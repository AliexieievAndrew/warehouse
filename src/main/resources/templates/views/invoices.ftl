<script>
    window.documentType = '${documentType}';
</script>

<div class="row">
    <div class="col-lg-7">
        <div class="card">
            <div class="card-title">
                <#if documentType == 1>
                    <h4>All income invoices</h4>
                <#elseif documentType == 2>
                    <h4>All outcome invoices</h4>
                </#if>
            </div>
            <div class="bootstrap-data-table-panel">
                <div class="table-responsive">
                    <table id="invoicesTable" class="display table table-striped table-bordered bootstrap-data-table-export" style="width: 100%;">
                        <thead>
                        <tr>
                            <th>id</th>
                            <th>document type</th>
                            <th>created date</th>
                            <th></th>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
        <!-- /# card -->
    </div>
    <!-- /# column -->
</div>
<!-- /# row -->