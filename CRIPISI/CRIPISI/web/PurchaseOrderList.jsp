<%-- 
    Document   : PurchaseOrderList
    Created on : 04 10, 15, 10:15:56 AM
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

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

  </head>

  <body>

  <section id="container" >
      <%@include file="LoadTemplate.jsp" %>
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> My Purchase Order List</h3>
          	
          	<!-- BASIC FORM ELELEMNTS -->
          	<div class="row mt">
          		<div class="col-lg-12">
                  <div class="form-panel">
				  
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Purchase Orders</h4>
					    <div class="input-group custom-search-form col-md-2">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                        <div class="row mt">
                  <div class="col-md-12">
                      <div class="content-panel">
                          <table class="table table-bordered table-striped table-condensed">
	                  	  	  <h4><i class="fa fa-angle-right"></i> Products</h4>
	                  	  	  <hr>
                              <thead>
                              <tr>
                                  <th><i class="fa fa-barcode"></i> P.O.ID</th>
                                  <th class="hidden-phone"><i class="fa fa-truck"></i> Deliver To</th>
                                  <th><i class="fa fa-calendar"></i> Delivery Date</th>
                                  <th><i class=" fa fa-edit"></i> Mode of Payment</th>
								  <th><i class=" fa fa-edit"></i> Status</th>
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                                  <td><a data-toggle="modal" href="#ModalItems">DCM0012</label></td>
                                  <td class="hidden-phone">24 FC LAGUNA ST</td>
                                  <td>2015-05-03 </td>
                                  <td>Terms</td>
                                  <td>DELIVERED</td>
                              </tr>
							  <tr>
                                  <td><label>DCM0013</label></td>
                                  <td class="hidden-phone">28 SANTA MARIA ST</td>
                                  <td>2015-07-08 </td>
                                  <td>CASH</td>
                                  <td>ON HOLD</td>
                              </tr>
                            
                              </tbody>
                          </table>
						  
                      </div><!-- /content-panel -->
					 
                  </div><!-- /col-md-12 -->
				  
              </div><!-- /row -->
							
                 
					   
                  </div>
          		</div><!-- col-lg-12-->      	
          	</div><!-- /row -->
          	
            <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="ModalItems" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">Purchase Order Number: DCM0012  </h4>
		                      </div>
		                      <div class="modal-body">
		                         <table class="table table-bordered table-striped table-condensed">
	                  	  	  <h4><i class="fa fa-angle-right"></i> Products</h4>
	                  	  	  <hr>
                              <thead>
                              <tr>
                                  <th><i class="fa fa-barcode"></i> ProductID</th>
                                  <th class="hidden-phone"><i class="fa fa-question-circle"></i> Product Name</th>
                                  <th><i class="fa fa-bookmark"></i> Quantity</th>
                                  <th><i class=" fa fa-edit"></i> Unit Price</th>
								  <th><i class=" fa fa-edit"></i> Total Price</th>
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                                  <td><label>PAC</label></td>
                                  <td class="hidden-phone">Chloride</td>
                                  <td>5 </td>
                                  <td>32</td>
                                  <td>160</td>
                              </tr>
							  <tr>
                                  <td><label>PAC</label></td>
                                  <td class="hidden-phone">Chloride</td>
                                  <td>5 </td>
                                  <td>32</td>
                                  <td>160</td>
                              </tr>
                            
                            
                              </tbody>
                          </table>
		                      </div>
		                  </div>
		              </div>
		          </div>
				  
				   <div aria-hidden="false" aria-labelledby="ModalItemsLabel" role="dialog" tabindex="-1" id="ModalItems" class="modal fade">
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
		                          <a class="btn btn-theme btn-link" type="button" href = "login2.html">Proceed</a>
		                      </div>
		                  </div>
		              </div>
		          </div>
          	
          	
          	
          	
          	
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

    <!--script for this page-->
    <script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>

	<!--custom switch-->
	<script src="assets/js/bootstrap-switch.js"></script>
	
	<!--custom tagsinput-->
	<script src="assets/js/jquery.tagsinput.js"></script>
	
	<!--custom checkbox & radio-->
	
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

