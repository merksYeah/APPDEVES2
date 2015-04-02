<%-- 
    Document   : sample
    Created on : 03 21, 15, 3:52:40 PM
    Author     : deathman28
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                      <a href="PreLoadInventory">
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
   
</html>
