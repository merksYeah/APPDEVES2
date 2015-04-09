<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
        <c:if test="${login['role'] == 1}">
             <%@include file="ClientTemplate.jsp" %>
        </c:if>
       
        
</html>