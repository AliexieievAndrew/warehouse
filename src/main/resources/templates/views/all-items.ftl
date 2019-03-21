<div class="row">
    <div class="col-lg-6">
        <div class="card">
            <div class="card-title">
                <h4>Select item and range</h4>
            </div>
            <div class="form-inline">
                <div class="form-group">
                    <input class=" m-b-10 form-control"  id="item" name="item" placeholder ="item" >
                </div>
            </div>
            <div class="form-inline">
                <div class="form-group">
                    <div id="date-from" class="input-group date m-b-10" data-provide="datepicker"
                         data-date-format="dd/mm/yyyy">
                        <input placeholder ="date from" type="text" class="form-control">
                        <div class="input-group-addon">
                            <i class="far fa-calendar-alt"></i>
                        </div>
                    </div>
                </div>
                <div class="col-md-2">

                </div>
                <div class="form-group">
                    <div id="date-to" class="input-group date m-b-10" data-provide="datepicker"
                         data-date-format="dd/mm/yyyy">
                        <input placeholder ="date to" type="text" class="form-control">
                        <div class="input-group-addon">
                            <i class="far fa-calendar-alt"></i>
                        </div>
                    </div>
                </div>
            </div>
            <button type="button" class="btn btn-success m-b-10" id="generateReport">
                <i class="fas fa-chart-line"></i>
                generate
            </button>
        </div>
        <!-- /# card -->
    </div>
    <!-- /# column -->
</div>
<!-- /# row -->

<div class="row">
    <div class="col-lg-7">
        <div class="card">
            <div class="card-title">
                <h4>Line Chart</h4>
            </div>
            <script>
                window.onload = function () {

                    var options = {
                        animationEnabled: true,
                        theme: "light2",
                        title: {
                            text: "Actual vs Projected Sales"
                        },
                        axisX: {
                            valueFormatString: "DD MMM"
                        },
                        axisY: {
                            title: "Number of Sales",
                            suffix: "K",
                            minimum: 30
                        },
                        toolTip: {
                            shared: true
                        },
                        legend: {
                            cursor: "pointer",
                            verticalAlign: "bottom",
                            horizontalAlign: "left",
                            dockInsidePlotArea: true,
                            itemclick: toogleDataSeries
                        },
                        data: [{
                            type: "line",
                            showInLegend: true,
                            name: "Projected Sales",
                            markerType: "square",
                            xValueFormatString: "DD MMM, YYYY",
                            color: "#F08080",
                            yValueFormatString: "#,##0K",
                            dataPoints: [
                                {x: new Date(2017, 10, 1), y: 63},
                                {x: new Date(2017, 10, 2), y: 69},
                                {x: new Date(2017, 10, 3), y: 65},
                                {x: new Date(2017, 10, 4), y: 70},
                                {x: new Date(2017, 10, 5), y: 71},
                                {x: new Date(2017, 10, 6), y: 65},
                                {x: new Date(2017, 10, 7), y: 73},
                                {x: new Date(2017, 10, 8), y: 96},
                                {x: new Date(2017, 10, 9), y: 84},
                                {x: new Date(2017, 10, 10), y: 85},
                                {x: new Date(2017, 10, 11), y: 86},
                                {x: new Date(2017, 10, 12), y: 94},
                                {x: new Date(2017, 10, 13), y: 97},
                                {x: new Date(2017, 10, 14), y: 86},
                                {x: new Date(2017, 10, 15), y: 89}
                            ]
                        },
                            {
                                type: "line",
                                showInLegend: true,
                                name: "Actual Sales",
                                lineDashType: "dash",
                                yValueFormatString: "#,##0K",
                                dataPoints: [
                                    {x: new Date(2017, 10, 1), y: 60},
                                    {x: new Date(2017, 10, 2), y: 57},
                                    {x: new Date(2017, 10, 3), y: 51},
                                    {x: new Date(2017, 10, 4), y: 56},
                                    {x: new Date(2017, 10, 5), y: 54},
                                    {x: new Date(2017, 10, 6), y: 55},
                                    {x: new Date(2017, 10, 7), y: 54},
                                    {x: new Date(2017, 10, 8), y: 69},
                                    {x: new Date(2017, 10, 9), y: 65},
                                    {x: new Date(2017, 10, 10), y: 66},
                                    {x: new Date(2017, 10, 11), y: 63},
                                    {x: new Date(2017, 10, 12), y: 67},
                                    {x: new Date(2017, 10, 13), y: 66},
                                    {x: new Date(2017, 10, 14), y: 56},
                                    {x: new Date(2017, 10, 15), y: 64}
                                ]
                            }]
                    };
                    $("#chartContainer").CanvasJSChart(options);

                    function toogleDataSeries(e) {
                        if (typeof (e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
                            e.dataSeries.visible = false;
                        } else {
                            e.dataSeries.visible = true;
                        }
                        e.chart.render();
                    }

                }
            </script>

            <div id="chartContainer" style="height: 370px; width: 100%;"></div>
        </div>
        <!-- /# card -->
    </div>
    <!-- /# column -->
</div>
<!-- /# row -->