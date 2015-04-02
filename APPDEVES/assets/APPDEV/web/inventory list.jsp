<%-- 
    Document   : inventory list
    Created on : 03 4, 15, 11:42:55 AM
    Author     : deathman28
--%>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="db.*"%>
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

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

  </head>

	<style>
		#add{margin-left:600px;}
	</style>
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
            
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="login.html">Logout</a></li>
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
              	  <h5 class="centered">Miguel Mercado<br> PLANT MANAGER</h5>
              	  <li class="sub-menu">
                      <a href="javascript:;">
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
                      <a href="javascript:;" class = "active">
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
          <section class="wrapper site-min-height">
          	<h3><i class="fa fa-angle-right"></i> Inventory List</h3>
          	<div class="row mt">
			<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
						  <input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
						<a class="btn btn-default" href="add product.html" role="button" id="add">Add Product</a>
							
			    </form>	
          		<div class="col-lg-11">
				<table class="table table-striped table-advance table-hover">
	                  	  	  <h4><i class="fa fa-angle-right"></i> Products</h4>
	                  	  	  <hr>
                              <thead>
                              <tr>
                                  <th><i class="fa fa-barcode"></i> Product ID</th>
                                  <th class="hidden-phone"><i class="fa fa-question-circle"></i> Product Name</th>
                                  <th><i class="fa fa-bookmark"></i> Package</th>
                                  <th><i class=" fa fa-edit"></i> Net Weight</th>
								  <th><i class=" fa fa-edit"></i> Quantity</th>
								  <th><i class=" fa fa-edit"></i> Edit</th>
                                  <th></th>
                              </tr>
                              </thead>
                              <tbody>
                              <c:forEach items="${users}" var="user">
                                  <tr>
                                      <td><c:out value="${user.name}"/></td>
                                      <td><c:out value="${user.password}"/></td>
                                  </tr>
                              </c:forEach>
                            
                            </tbody>
                          </table>         		
				</div>     
							
          	</div>			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
     
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script src="assets/js/jquery.ui.touch-punch.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

    <!--script for this page-->
    
  <script>
      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

  </script>

  </body>
</html>
