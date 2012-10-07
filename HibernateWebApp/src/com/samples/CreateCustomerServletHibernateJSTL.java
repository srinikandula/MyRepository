package com.samples;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.samples.hibernateexample.Customer;
import com.samples.hibernateexample.HibernateExample;
import com.samples.hibernateexample.HibernateManager;
@WebServlet(urlPatterns = { "/createCustomerHJSTL" }, loadOnStartup = 5)
public class CreateCustomerServletHibernateJSTL extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
		Customer customer = new Customer();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		
		customer.setId(Integer.parseInt(id));
		customer.setName(name);
		customer.setCity(city);
		customer.setState(state);
		
		SessionFactory factory=  HibernateManager.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction  transaction = session.beginTransaction();//start transaction
		session.save(customer);  // inserting a record in to customer table
		transaction.commit(); //end transaction
		session.close();
		
		System.out.println("saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Customer> customers = HibernateExample.getCustomerList();
		request.setAttribute("customers", customers);
		ServletContext ctxt = request.getServletContext();
		RequestDispatcher disp = ctxt.getRequestDispatcher("/allCustomersJSTL.jsp");
		disp.forward(request, response);	
	}
}
