


<%@page import="roseindia.dao.SpringHibernateDAO"%>
<%@page import="roseindia.services.ServiceFinder"%>
<%@page import="java.util.List"%>
<%@page import="roseindia.dao.hibernate.Product"%>
<%@page import="com.thoughtworks.xstream.XStream"%>
<%@page import="com.thoughtworks.xstream.io.xml.DomDriver"%>
<?xml version="1.0" encoding="utf-8"?>

<%
SpringHibernateDAO allcooljobsDAO = (SpringHibernateDAO) ServiceFinder.getContext(request)
	.getBean("SpringHibernateDao");
response.setContentType("text/xml");
List<Product> products = allcooljobsDAO.getAllProducts();

XStream xstream = new XStream(new DomDriver());
xstream.alias("product", Product.class);
String xml = xstream.toXML(products);
out.print(xml);
System.out.println(xml);
%>
