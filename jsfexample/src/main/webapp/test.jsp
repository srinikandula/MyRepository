<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>
	<html>
		<head><title>JSF Simple Login Example</title></head>
		
		<body>
			<h:form>
            <h:inputText id="name" value="#{jsfBean.name}" required="true"/>
            <h:selectOneMenu id="items" value="#{jsfBean.selectedItem}" required="true">
                <f:selectItems value="#{jsfBean.items}"/>
            </h:selectOneMenu>
            <h:commandButton id="submit" value="Submit" action="#{jsfBean.submit}" />
        </h:form>

		</body>
	</html>
</f:view>