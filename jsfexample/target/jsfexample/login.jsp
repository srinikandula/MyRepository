<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t" %>
<f:view>
	<html>
		<head><title>JSF Simple Login Example</title></head>
		
		<body>
			<h:form>
				<table>
					<tr>
						<td><h:outputText value="Enter Login ID: " /></td>
						<td><h:inputText id="loginname" required="true" requiredMessage="login is required" value="#{SimpleLogin.loginname}"  binding="#{SimpleLogin.loginVal}"/>
						<font color="#FF0000"><h:message for="loginname" /></font>
						</td>
						
					</tr>
					<tr>
						<td><h:outputText value="Select grade" /></td>
						<td>
							<h:selectOneMenu id="grade" value="#{SimpleLogin.grade}" binding="#{SimpleLogin.grade}" title="select any one in this menu" required="true"
							requiredMessage="please select a grade">
							  <f:selectItem itemLabel="Select"/>
							  <f:selectItem itemLabel="One" itemValue="11" />
							  <f:selectItem itemLabel="Two" itemValue="22" />
							  <f:selectItem itemLabel="Three" itemValue="33" />
							  <f:selectItem itemLabel="Four" itemValue="44" />
							</h:selectOneMenu>
							<font color="#FF0000"><h:message for="grade" /></font>
						</td>
						
					</tr>
					
					<tr>
						<td><h:outputText value="Enter Password: " /></td>
						<td><h:inputSecret id="password" value="#{SimpleLogin.password}" required="true" requiredMessage="password is required"/>
						<font color="#FF0000"><h:message for="password" /></font></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><h:commandButton value="Login" action="#{SimpleLogin.CheckValidUser}" /></td>
					</tr>
				</table>
					<t:saveState value="#{SimpleLogin.loginname}"/>
					<t:saveState value="#{SimpleLogin.password}"/>						
			</h:form>
		</body>
	</html>
</f:view>