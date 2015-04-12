<%-- 
    Document   : NewPurchaseOrder
    Created on : 03 8, 15, 9:21:52 AM
    Author     : deathman28
--%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        String currentApp = "/CreateSalesOrder";
%>
<%@include file="security.jsp" %>
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
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <link href="assets/jquery-ui-1.11.4.custom/jquery-ui.min.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="assets/DataTables-1.10.6/media/css/jquery.dataTables.min.css">
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
          	<h3><i class="fa fa-angle-right"></i> New Purchase Order</h3>
          	
          	<!-- BASIC FORM ELELEMNTS -->
          	<div class="row mt">
                    <div class="col-lg-12">
                  <div class="form-panel">
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Order Information</h4>
                          <form action = "CreateSalesOrder" class="form-horizontal style-form" method="post"> <div class ="form-group" >
                                <label class="col-lg-2 col-sm-2 control-label">Customer TIN</label>
                                <div class = col-lg-2>
                                    <input name = "customertin" type="text" id="disabledInput" class="form-control" value="<c:out value="${Customer.customerTin}"/>" rows="1"  readonly>
                                 
                                </div>
                             </div>
                          <div class="form-group">
                              <label class="col-lg-2 col-sm-2 control-label">Deliver To</label>
                                <div class="col-lg-6">
                                    <select name ="address" class="form-control" required>
                                    
                                          <option value="<c:out value="${Customer.companyAddress}"/>"><c:out value="${Customer.companyAddress}"/></option>
                                    
                                  </select>
                                </div>
                          </div>
                           <div class="form-group">
				<label class="col-lg-2 col-sm-2 control-label">Terms</label>
                                    <div class="col-lg-10">
					<label class="radio-inline">
                                            <input required type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> Cash-On-Delivery
					</label>
					<label class="radio-inline">
                                            <input required type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> In Terms
					</label>
                                    </div>
                            </div>
                            <div class ="form-group" >
                                <label class="col-lg-2 col-sm-2 control-label">Delivery Date</label>
                                <div class = col-lg-2>
                                    <input  name ="orderdate" id = "datepicker" type = "input" class="form-control" rows="1"  required>
                                </div>
                             </div>
                            <div class ="form-group" >
                                <label class="col-lg-2 col-sm-2 control-label">Comments</label>
                                <div class = col-lg-6>
                                    <input   type = "input" class="form-control" rows="1">
                                </div>
                             </div>
                             <h4 class="mb"><i class="fa fa-angle-right"></i> Products to Order</h4>
						<table id = "what"class="table table-bordered table-striped table-condensed">
                                                        <hr>
                                                            <thead>
                                                                <tr>
                                                                    <th></th>
                                                                    <th></th>
                                                                    <th><i class="fa fa-barcode"></i> ProductCode</th>
                                                                    <th class="hidden-phone"><i class="fa fa-question-circle"></i> Product Name</th>
                                                                    <th class="hidden-phone"><i class="fa fa-question-circle"></i> Package Type</th>
                                                                    <th class="hidden-phone"><i class="fa fa-question-circle"></i> Net Weight</th>
                                                                    <th><i class="fa fa-bookmark"></i> Quantity In Stock</th>
                                                                    <th><i class=" fa fa-edit"></i> Unit Price</th>
                                                                </tr>
                                                            </thead>
                                                            
                                                            <tbody>
                                                                <c:forEach items="${products}" var="product" varStatus="status">
                                                                    <tr>
                                                                        <td><input type="checkbox" name="checkedRows" value="${product.productCode}" onclick="var input = document.getElementById('<c:out value="${status.count}" />'); if(this.checked){ input.disabled = false; input.focus();}else{input.disabled=true;}"></td>
                                                                        <td><input type="number" name="orderquantity" id = "<c:out value="${status.count}" />"disabled/></td>
                                                                        <td><c:out value="${product.productCode}"/></td> 
                                                                        <td><c:out value="${product.productName}"/></td> 
                                                                        <td><c:out value="${product.packageType}"/></td> 
                                                                        <td><c:out value="${product.netweight}"/></td> 
                                                                        <td><c:out value="${product.quantity}"/></td>
                                                                        <td><c:out value="${product.MSRP}"/></td>    
                                                                    </tr>
                                                                </c:forEach>
                                                            </tbody>
                                        </table>
                                          <div class ="form-group" >
                                            <div class="col-lg-12">
                                                <input type = "submit" class="btn btn-theme center-block">
                                             </div>
                                        </div>
                            </form>
                            </div>	   
                    </div>
                    </div><!-- col-lg-12-->      
                    </div><!-- /row -->
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
  </section>
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>	   
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>
    <script src="assets/DataTables-1.10.6/media/js/jquery.dataTables.min.js"></script>
            
 <script>
  $(document).ready(function() {
    $('#what').dataTable( {
        "scrollY":        "300px",
        "scrollCollapse": true,
        "paging":         false,
        "bPaginate": false
    } );
} );

    </script>
	
	<!--custom tagsinput-->
	<script src="assets/js/jquery.tagsinput.js"></script>
	
	<!--custom checkbox & radio-->
	
	
	
	<script type="text/javascript" src="assets/js/bootstrap-inputmask/bootstrap-inputmask.min.js"></script>
	
  <script>
  $(document).ready(function() {
    $('#datepicker').datepicker({
		minDate: 0,						
        beforeShowDay: noSunday
      });

      function noSunday(date){
          var day = date.getDay();
                      return [(day > 0 && day < 6), ''];
      }; 
	
  });
  </script>	
	<script src="assets/js/form-component.js"></script>    
    


  

  <script>
      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

  </script>

  </body>
</html>
