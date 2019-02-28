<script>
    window.documentType = '${documentType}';
</script>

<div class="content-wrap">
    <div class="main">
        <div class="container-fluid">
            <!-- /# row -->
            <section id="main-content">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-title">
                                <#if documentType == 1>
                                    <h4>All income invoices</h4>
                                <#elseif documentType == 2>
                                    <h4>All outcome invoices</h4>
                                </#if>
                            </div>
                            <div class="bootstrap-data-table-panel">
                                <div class="table-responsive col-lg-8" >
                                    <table id="invoicesTable" class="display table table-bordered table-hover" style="width: 100%">
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
            </section>
        </div>
    </div>
</div>

