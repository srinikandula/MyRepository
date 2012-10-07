<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body >
    	<form action="createCustomerHJSTL">
        <h1>Enter Customer Information(uses hibernate)</h1>
        <table width="600px" border="1" bgcolor="#FFF380"> 
            <tr> <td width="100px">Id</th>  <td width="100px"><input type="text" name="id"> </td></tr>
            <tr> <td width="100px">Name</th>  <td width="100px"><input type="text" name="name"> </td></tr>
            <tr> <td width="100px">City</th>  <td width="100px"><input type="text" name="city"> </td></tr>
            <tr> <td width="100px">State</th>  <td width="100px"><input type="text" name="state"> </td></tr>
        </table>
        
        <input type="submit" value="Create">
        </form>
    </body>
</html>
