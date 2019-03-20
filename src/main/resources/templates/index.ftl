<!DOCTYPE html>
<html lang="en">

    <#assign context = springMacroRequestContext.getContextPath()/>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Warehouse: Admin panel</title>

        <#--<script>-->
            <#--window.contextRoot = '${context}';-->
        <#--</script>-->


        <#--<script src="/assets/js/lib/jquery.min.js"></script>-->
        <link rel="stylesheet" href="/assets/css/lib/chosen.min.css">
        <link  rel="stylesheet" href="/assets/css/lib/test.css" />
        <!-- ================= Favicon ================== -->
        <!-- Standard -->
        <link rel="shortcut icon" href="http://placehold.it/64.png/000/fff">
        <!-- Retina iPad Touch Icon-->
        <link rel="apple-touch-icon" sizes="144x144" href="http://placehold.it/144.png/000/fff">
        <!-- Retina iPhone Touch Icon-->
        <link rel="apple-touch-icon" sizes="114x114" href="http://placehold.it/114.png/000/fff">
        <!-- Standard iPad Touch Icon-->
        <link rel="apple-touch-icon" sizes="72x72" href="http://placehold.it/72.png/000/fff">
        <!-- Standard iPhone Touch Icon-->
        <link rel="apple-touch-icon" sizes="57x57" href="http://placehold.it/57.png/000/fff">

        <!-- Styles -->
        <link
                rel="stylesheet"
                href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
                integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
                crossorigin="anonymous"/>

        <link rel="stylesheet" href="/assets/css/lib/chosen.min.css">

        <#--<link href="/assets/css/lib/test.css" rel="stylesheet" />-->
        <link href="/assets/css/lib/weather-icons.css" rel="stylesheet" />
        <link href="/assets/css/lib/owl.carousel.min.css" rel="stylesheet" />
        <link href="/assets/css/lib/owl.theme.default.min.css" rel="stylesheet" />
        <link href="/assets/css/lib/font-awesome.min.css" rel="stylesheet">
        <link href="/assets/css/lib/themify-icons.css" rel="stylesheet">
        <link href="/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
        <link href="/assets/css/lib/bootstrap.min.css" rel="stylesheet">

        <link href="/assets/css/lib/helper.css" rel="stylesheet">
        <link href="/assets/css/style.css" rel="stylesheet">


        <!-- Styles -->
        <link href="/assets/css/lib/font-awesome.min.css" rel="stylesheet">
        <link href="/assets/css/lib/themify-icons.css" rel="stylesheet">

        <link href="/assets/css/lib/data-table/dataTables.bootstrap.min.css" rel="stylesheet" />
        <link href="/assets/css/lib/data-table/buttons.bootstrap.min.css" rel="stylesheet" />
        <link href="/assets/css/lib/data-table/buttons.dataTables.min.css" rel="stylesheet" />

        <#--autocomplete-->
        <link href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" rel="Stylesheet"></link>

        <#--<link rel="stylesheet" href="/assets/css/lib/chosen.min.css">-->

    </head>

    <body>

        <div class="sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures ">
            <div class="nano">
                <div class="nano-content">
                    <div class="logo"><a href="/"><span>Warehouse</span></a></div>
                    <ul>
                        <li class="label">Main</li>
                        <li class="active"><a class="sidebar-sub-toggle"><i class="ti-home"></i> New Document <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li><a href="/create-document/create-income-invoice">new Income invoice</a></li>
                                <li><a href="/create-document/create-outcome-invoice">new Outcome invoice</a></li>
                            </ul>
                        </li>

                        <li class="label">Apps</li>
                        <li><a class="sidebar-sub-toggle"><i class="ti-bar-chart-alt"></i>  Charts  <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li><a href="/#">Test</a></li>
                            </ul>
                        </li>

                        <li><a class="sidebar-sub-toggle"><i class="ti-layout-grid4-alt"></i> Balance <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li><a href="/balance/all"> balance all</a></li>
                            </ul>
                        </li>
                        <li class="label">Extra</li>
                        <li><a class="sidebar-sub-toggle"><i class="ti-files"></i> Invoices <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li><a href="/invoices/incomeInvoices"> Income Invoices </a></li>
                            </ul>
                            <ul>
                                <li><a href="/invoices/outcomeInvoices"> Outcome Invoices </a></li>
                            </ul>
                        </li>
                        <li><a href="/#"><i class="ti-file"></i> Documentation </a></li>


                        <li class="label footer fixed-bottom"> 2019 Aliexieiev Andrew </a></li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- /# sidebar -->

        <div class="header">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="float-left">
                            <div class="hamburger sidebar-toggle">
                                <span class="line"></span>
                                <span class="line"></span>
                                <span class="line"></span>
                            </div>
                        </div>
                        <div class="float-right">
                            <ul>
                                <li class="header-icon dib"><span class="user-avatar">John <i class="ti-angle-down f-s-10"></i></span>
                                    <div class="drop-down dropdown-profile">
                                        <div class="dropdown-content-body">
                                            <ul>
                                                <li><a href="#"><i class="ti-user"></i> <span>Profile</span></a></li>

                                                <li><a href="#"><i class="ti-email"></i> <span>Inbox</span></a></li>
                                                <li><a href="#"><i class="ti-settings"></i> <span>Setting</span></a></li>

                                                <li><a href="#"><i class="ti-lock"></i> <span>Lock Screen</span></a></li>
                                                <li><a href="#"><i class="ti-power-off"></i> <span>Logout</span></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="content-wrap">
            <div class="main">
                <div class="container-fluid">

                    <!-- /# row -->
                    <section id="main-content">

                        <#if page?has_content>
                            <#--here will be main content-->
                                <#include "*/views/${page}.ftl"/>
                        </#if>

                    </section>
                </div>
            </div>
        </div>


        <#--testing-->
        <script>
            window.contextRoot = '${context}';
        </script>
        <script src="/assets/js/lib/jquery.min.js"></script>


        <script src="/assets/js/lib/chosen/chosen.jquery.min.js"></script>

        <!-- jquery vendor -->
        <#--<script src="/assets/js/lib/jquery.min.js"></script>-->
        <script src="/assets/js/lib/jquery.nanoscroller.min.js"></script>

        <script src="/assets/js/invoices.js"></script>
        <script src="/assets/js/invoice.js"></script>
        <script src="/assets/js/balance.js"></script>
        <script src="/assets/js/createIncomeInvoice.js"></script>
        <script src="/assets/js/createOutcomeInvoice.js"></script>



        <!-- nano scroller -->
        <script src="/assets/js/lib/menubar/sidebar.js"></script>
        <script src="/assets/js/lib/preloader/pace.min.js"></script>
        <!-- sidebar -->
        <script src="/assets/js/lib/bootstrap.min.js"></script>

        <!-- bootstrap -->

        <script src="/assets/js/lib/circle-progress/circle-progress.min.js"></script>
        <script src="/assets/js/lib/circle-progress/circle-progress-init.js"></script>

        <script src="/assets/js/lib/morris-chart/raphael-min.js"></script>
        <script src="/assets/js/lib/morris-chart/morris.js"></script>
        <script src="/assets/js/lib/morris-chart/morris-init.js"></script>

        <!--  flot-chart js -->
        <script src="/assets/js/lib/flot-chart/jquery.flot.js"></script>
        <script src="/assets/js/lib/flot-chart/jquery.flot.resize.js"></script>
        <script src="/assets/js/lib/flot-chart/flot-chart-init.js"></script>
        <!-- // flot-chart js -->



        <script src="/assets/js/lib/owl-carousel/owl.carousel.min.js"></script>
        <script src="/assets/js/lib/owl-carousel/owl.carousel-init.js"></script>
        <script src="/assets/js/scripts.js"></script>
        <!-- scripit init-->

        <script src="/assets/js/lib/data-table/datatables.min.js"></script>
        <script src="/assets/js/lib/data-table/dataTables.bootstrap.min.js"></script>
        <script src="/assets/js/lib/data-table/dataTables.buttons.min.js"></script>
        <script src="/assets/js/lib/data-table/buttons.bootstrap.min.js"></script>
        <script src="/assets/js/lib/data-table/jszip.min.js"></script>
        <script src="/assets/js/lib/data-table/pdfmake.min.js"></script>
        <script src="/assets/js/lib/data-table/vfs_fonts.js"></script>
        <script src="/assets/js/lib/data-table/buttons.html5.min.js"></script>
        <script src="/assets/js/lib/data-table/buttons.print.min.js"></script>
        <script src="/assets/js/lib/data-table/buttons.colVis.min.js"></script>
        <script src="/assets/js/lib/data-table/datatables-init.js"></script>

        <#-- autocomplete function-->
        <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js" ></script>

    </body>
</html>
