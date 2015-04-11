<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.HashMap"%>
<%
//    String login = (String) session.getAttribute("login");
//    if (login == null || !login.equals("true")){
//        response.sendRedirect("login.jsp");
//        return;
//    } 
    
    HashMap<String,String> rights = (HashMap<String,String>) session.getAttribute("login");
    if (rights == null || rights.get(currentApp) == null || !rights.get(currentApp).equals("TRUE")){
        response.sendRedirect("login.jsp");
        return;
    }
%>
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
        <c:if test="${login['role'] == 1}">
             <%@include file="ClientTemplate.jsp" %>
        </c:if>
       
        
</html>