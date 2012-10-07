package com.samples;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.hibernateexample.Customer;

public class CreateCustomerServletJ extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("insert into customer(customer_id,name,city,state) values(?,?,?,?)");
		/*PreparedStatement stmt = con.prepareStatement("select * from customer where state ='MI' order by id");
		 * Resu
		 */
		stmt.setInt(1, Integer.parseInt(id));
		stmt.setString(2, name);
		stmt.setString(3, city);
		stmt.setString(4, state);
		stmt.execute();
		
		System.out.println("saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("allCustomers.jsp");
	}
	
	private Connection getConnection() throws Exception{
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/training","postgres","postgres");
		return con;
	}
}
