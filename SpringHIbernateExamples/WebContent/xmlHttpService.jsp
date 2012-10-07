<%@page import="quickstart.ShippingCalculator,
                quickstart.ShippingOption,
                java.util.List" %>

<?xml version="1.0" encoding="utf-8"?>
<options>
<%
    ShippingCalculator calc = new ShippingCalculator();
    List    options;
    int     zipcode;
    double  pounds;

    zipcode = Integer.parseInt(request.getParameter("zipcode"));
    pounds = Double.parseDouble(request.getParameter("pounds"));

    options = calc.getShippingOptions(zipcode, pounds);

    for (int i = 0; i < options.size(); i++) {
        ShippingOption option = (ShippingOption) options.get(i);
%>
    <option>
        <service><%= option.getService() %></service>
        <price><%= option.getPrice() %></price>
    </option>
<%
    }
%>
</options>