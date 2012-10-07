<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product</title>
<script type="text/javascript" src="scripts/jquery.js"></script>
<script>
	function deleteProduct(pid){
		$("#productId").val(pid);	
		$("#actionType").val(3);
		$("#submit").click();
	}
	
</script>
</head>
<body>
	<html:form action="productAction.do">
		Name : <html:text property="product.name" name="ProductForm"></html:text>
		Description : <html:text property="product.description"></html:text>
		<html:hidden property="actionType" value="1" styleId="actionType"/>
		<html:hidden property="product.id" value="1" styleId="productId"/>
		<html:submit property="submit" value="Submit" styleId="submit"/>
		<table>
			<logic:iterate name="ProductForm" property="products" id="product">
			<tr><td><bean:write property="id" name="product"/></td>
			<td><bean:write property="name" name="product"/></td>
			<td><bean:write property="description" name="product"/></td>
			<td><a href='javascript:deleteProduct(<bean:write property="id" name="product"/>)'>Delete</a></td>
			</tr>
	   		</logic:iterate>
		</table>
	</html:form>
	<a href="productListXml">XML</a>
</body>
</html>