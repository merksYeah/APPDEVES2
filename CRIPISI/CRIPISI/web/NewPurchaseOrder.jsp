<%-- 
    Document   : NewPurchaseOrder
    Created on : 03 8, 15, 9:21:52 AM
    Author     : deathman28
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>CRIPSI</title>
<link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/js/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/js/bootstrap-datepicker/css/datepicker.css" />
    <link rel="stylesheet" type="text/css" href="assets/js/bootstrap-daterangepicker/daterangepicker.css" />
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
      <header class="header black-bg">
              <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
              </div>
            <!--logo start-->
            <a href="index.html" class="logo"><b>CRIPSI</b></a>
            <!--logo end-->
            <div class="nav notify-row" id="top_menu">
                <!--  notification start -->
                <ul class="nav top-menu">
                    <!-- settings start -->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                            <i class="fa fa-tasks"></i>
                            <span class="badge bg-theme">4</span>
                        </a>
                        <ul class="dropdown-menu extended tasks-bar">
                            <div class="notify-arrow notify-arrow-green"></div>
                            <li>
                                <p class="green">You have 4 pending tasks</p>
                            </li>
                            <li>
                                <a href="index.html#">
                                    <div class="task-info">
                                        <div class="desc">DashGum Admin Panel</div>
                                        <div class="percent">40%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="index.html#">
                                    <div class="task-info">
                                        <div class="desc">Database Update</div>
                                        <div class="percent">60%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="index.html#">
                                    <div class="task-info">
                                        <div class="desc">Product Development</div>
                                        <div class="percent">80%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="index.html#">
                                    <div class="task-info">
                                        <div class="desc">Payments Sent</div>
                                        <div class="percent">70%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                                            <span class="sr-only">70% Complete (Important)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="external">
                                <a href="#">See All Tasks</a>
                            </li>
                        </ul>
                    </li>
                    <!-- settings end -->
                    <!-- inbox dropdown start-->
                    <li id="header_inbox_bar" class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                            <i class="fa fa-envelope-o"></i>
                            <span class="badge bg-theme">5</span>
                        </a>
                        <ul class="dropdown-menu extended inbox">
                            <div class="notify-arrow notify-arrow-green"></div>
                            <li>
                                <p class="green">You have 5 new messages</p>
                            </li>
                            <li>
                                <a href="index.html#">
                                    <span class="photo"><img alt="avatar" src="assets/img/ui-zac.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Zac Snider</span>
                                    <span class="time">Just now</span>
                                    </span>
                                    <span class="message">
                                        Hi mate, how is everything?
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="index.html#">
                                    <span class="photo"><img alt="avatar" src="assets/img/ui-divya.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Divya Manian</span>
                                    <span class="time">40 mins.</span>
                                    </span>
                                    <span class="message">
                                     Hi, I need your help with this.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="index.html#">
                                    <span class="photo"><img alt="avatar" src="assets/img/ui-danro.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Dan Rogers</span>
                                    <span class="time">2 hrs.</span>
                                    </span>
                                    <span class="message">
                                        Love your new Dashboard.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="index.html#">
                                    <span class="photo"><img alt="avatar" src="assets/img/ui-sherman.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Dj Sherman</span>
                                    <span class="time">4 hrs.</span>
                                    </span>
                                    <span class="message">
                                        Please, answer asap.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="index.html#">See all messages</a>
                            </li>
                        </ul>
                    </li>
                    <!-- inbox dropdown end -->
                </ul>
                <!--  notification end -->
            </div>
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="login2.html">Logout</a></li>
            	</ul>
            </div>
        </header>
      <!--header end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
              
              	  <p class="centered"><a href="profile.html"><img src="assets/img/ui-woah.png" class="img-circle" width="60"></a></p>
              	  <h5 class="centered">Miguel Mercado</h5>
				   <h5 class="centered">Client</h5>
              	  	
             <li class="sub-menu">
                      <a href="javascript:;" class = "active">
                          <i class="fa fa-user"></i>
                          <span>Client Screens</span>
                      </a>
                      <ul class="sub">
					  <li>
                      <a href="ClientHomepage.html">
                          <i class="fa fa-home"></i>
                          <span>Homepage</span>
                      </a>
                  </li>
                          <li>
							  <a  href="NewPurchaseOrder.html">
								<i class="fa fa-file-o"></i>
								<span>New Purchase Order</span>
							  </a>
						  </li>
                           <li>
						  <a  href="MyPurchaseOrderList.html">
						  <i class="fa fa-file-o"></i>
							<span>My Purchase Order List</span>
						</a>
						</li>
						<li>
                      <a href="MyDeliverySchedule.html">
                          <i class="fa fa-calendar"></i>
                          <span>My Delivery Schedule</span>
                      </a>
                  </li>
                      </ul>
                  </li>
				    <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-user"></i>
                          <span>Plant Manager Screens</span>
                      </a>
                      <ul class="sub">
					 
				  <li>
                      <a  href="plant manager homepage.html">
                          <i class="fa fa-home"></i>
                          <span>Homepage</span>
                      </a>
                  </li>	
					<li>
							  <a  href="sales order filters.html">
								<i class="fa fa-file-o"></i>
								<span>Sales Order</span>
							  </a>
						  </li>
						   <li>
							  <a  href="req slip.html">
								<i class="fa fa-file-o"></i>
								<span>New Requisition Slip</span>
							  </a>
						  </li>
						  
					 <li>
                      <a href="inventory list.html" >
                         <i class="glyphicon glyphicon-list-alt"></i>
                          <span>Inventory List</span>
                      </a>
                  </li>	
				     
				   <li class="mt3">
                      <a href="delivery schedule.html">
                          <i class="glyphicon glyphicon-calendar"></i>
                          <span>Delivery Schedule</span>
                      </a>
                  </li>	
				  <li>
							  <a href="generate report.html">
								<i class="fa fa-file-o"></i>
								<span>Monthly Inventory</span>
							  </a>
						  </li>
               
                      </ul>
                  </li> 
				   <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-user"></i>
                          <span>Sales Agent Screens</span>
                      </a>
                      <ul class="sub">
					   <li>
                      <a href="SalesAgentHomepage.html">
                          <i class="fa fa-home"></i>
                          <span>Homepage</span>
                      </a>
                  </li>
                          <li>
							  <a  href="Sales Order Form.html">
								<i class="fa fa-file-o"></i>
								<span>New Sales Order</span>
							  </a>
						  </li>
                           <li>
						  <a  href="MyPurchaseOrderList.html">
						  <i class="fa fa-file-o"></i>
							<span>My Purchase Order List</span>
						</a>
						</li>
						 <li>
                      <a href="MyDeliverySchedule.html">
                          <i class="fa fa-calendar"></i>
                          <span>My Delivery Schedule</span>
                      </a>
                  </li>
				   <li>
                      <a href="ClientList.html">
                          <i class="fa fa-user"></i>
                          <span>Client List</span>
                      </a>
                  </li>

                      </ul>
                  </li>
				  
                 

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> New Purchase Order</h3>
          	
          	<!-- BASIC FORM ELELEMNTS -->
          	<div class="row mt">
          		<div class="col-lg-12">
                  <div class="form-panel">
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Order Information</h4>
                      <form class="form-horizontal style-form" method="get">
						  <div class="form-group">
                              <label class="col-lg-2 col-sm-2 control-label">Deliver To</label>
                              <div class="col-lg-10">
                                  <p class="form-control-static">28 Jasmin St Gloria III Warehouse</p>
                              </div>
                          </div>
						  <div class="form-group">
						 <label class="col-lg-2 col-sm-2 control-label">Terms</label>
								<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> Cash-On-Delivery
								</label>
								<label class="radio-inline">
								  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> In Terms
								</label>
							</div>
							<div class ="form-group">
								<label class="col-lg-2 col-sm-2 control-label">Comments</label>
								<textarea class="form-control" rows="2"></textarea>
								</div>
                         
                      </form>
					  
					
					   
                  </div>
          		</div><!-- col-lg-12-->      
	<section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> SET DELIVERY DATE</h3>
              <!-- page start-->
              <div class="row mt">
                  <aside class="col-lg-3 mt">
                      <h4><i class="fa fa-angle-right"></i> Draggable Events</h4>
                      <div id="external-events">
                          <div class="external-event label label-theme">DELIVERY TO WISCONSIN COMPANY</div>
                          <p class="drop-after">
                              <input type="checkbox" id="drop-remove">
                              Remove After Drop
                          </p>
                      </div>
                  </aside>
                  <aside class="col-lg-9 mt">
                      <section class="panel">
                          <div class="panel-body">
                              <div id="calendar" class="has-toolbar"></div>
                          </div>
                      </section>
                  </aside>
              </div>
              <!-- page end-->
		</section><! --/wrapper -->				
          	</div><!-- /row -->
			
							 <div class = "row">
								<div class = "col-lg-12 col-sm-12 ">
								  <span class = "pull-right">
									<button data-toggle="modal" href="NewPurchaseOrder.html#myModal" class="btn btn-theme" type="button">Proceed</button>
								</span>
								</div>
							</div>
          	
            <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">Proceed to product information</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>Is the information entered below correct?</p>
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
		                          <a class="btn btn-theme btn-link" type="button" href = "ProductSelect.html">Proceed</a>
		                      </div>
		                  </div>
		              </div>
		          </div>
          	
          	
          	
          	
          	
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
  </section>
 <script src="assets/js/jquery.js"></script>
    <script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>
	<script src="assets/js/fullcalendar/fullcalendar.min.js"></script>    
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

    <!--script for this page-->
	<script src="assets/js/calendar-conf-events.js"></script>    
  
  
	<!--custom switch-->
	<script src="assets/js/bootstrap-switch.js"></script>
	
	<!--custom tagsinput-->
	<script src="assets/js/jquery.tagsinput.js"></script>
	
	<!--custom checkbox & radio-->
	
	<script type="text/javascript" src="assets/js/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap-daterangepicker/date.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap-daterangepicker/daterangepicker.js"></script>
	
	<script type="text/javascript" src="assets/js/bootstrap-inputmask/bootstrap-inputmask.min.js"></script>
	
	
	<script src="assets/js/form-component.js"></script>    
    
    
  <script>
      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

  </script>

  </body>
</html>

