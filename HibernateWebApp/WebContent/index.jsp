<%-- 
    Document   : index
    Created on : 14.June.2011, 20:29:36
    Author     : tunatore
--%>

<%@page import="com.samples.hibernateexample.HibernateManager"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.samples.hibernateexample.Customer"%>
<%@page import="com.samples.hibernateexample.HibernateExample"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers in State --> MI</title>
    </head>
    <body >
        <h1>Customers in MI</h1>
        <table width="600px" border="1" bgcolor="#FFF380"> 
            <tr>
                <th width="100px">Customer_ID</th>
                <th width="100px">City</th>
                <th width="100px">State</th>
                <th width="100px">Name</th>
            </tr>
            <tr>                
            <%
                Customer[] customerArr = HibernateExample.getCustomersInState("MI");
                for(int i=0; i < customerArr.length; i++){
            %> 
            <tr>
                <td><b><%=customerArr[i].getId()%></b></td>
                <td><b><%=customerArr[i].getName()%></b></td>
                <td><b><%=customerArr[i].getCity()%></b></td>
                <td><b><%=customerArr[i].getState()%></b></td>                
            </tr>
            <%
                }
                HibernateManager.getSessionFactory().getCurrentSession().disconnect();
            %>               
            </tr>
        </table>
        <a href="addCustomer.jsp">Add</a>
        <a href="allCustomers.jsp">All Customers</a>
    </body>
</html>
