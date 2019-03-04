<div class="row">
    <div class="col-lg-7">
        <div class="card">
            <div class="card-title">
                <div class="input-append date form_datetime" data-date="2013-02-21T15:25:00Z">
                    <input size="16" type="text" value="" readonly>
                    <span class="add-on"><i class="far fa-calendar-times"></i></span>
                    <span class="add-on"><i class="far fa-calendar-alt"></i></span>
                </div>

                <script type="text/javascript">
                    $(".form_datetime").datetimepicker({
                        format: "dd MM yyyy - hh:ii",
                        autoclose: true,
                        todayBtn: true,
                        startDate: "2013-02-14 10:00",
                        minuteStep: 10
                    });
                </script>
            </div>
            <div class="bootstrap-data-table-panel">
                <div class="table-responsive">
                    <table id="balancePeriodTable" class="display table table-striped table-bordered bootstrap-data-table-export" style="width: 100%;">
                        <thead>
                        <tr>
                            <th>item</th>
                            <th>total debit</th>
                            <th>total credit</th>
                            <th>balance</th>
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