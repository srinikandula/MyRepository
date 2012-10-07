<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Customers(this uses JSTL) </title>
    </head>
    <body >
        <h1>All Customers (this uses JSTL)</h1>
        <table width="600px" border="1" bgcolor="#FFF380"> 
            <tr>
                <th width="100px">Customer_ID</th>
                <th width="100px">City</th>
                <th width="100px">State</th>
                <th width="100px">Name</th>
            </tr>
            <tr>         
           
            <c:forEach items="${customers}" var="xyz" >
            <tr>
                <td><b><c:out value="${xyz.id}"/></b></td>
                <td><b><c:out value="${xyz.name}"/></b></td>
                <td><b><c:out value="${xyz.city}"/></b></td>
                <td><b><c:out value="${xyz.state}"/></b></td>                
            </tr>
            </c:forEach>               
            
        </table>
        <a href="addCustomer.jsp">Add</a>
        <a href="index.jsp">Customers in MI</a>
    </body>
</html>
