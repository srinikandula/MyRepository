package com.examples.servlets.srini;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config)throws ServletException{
		
		System.out.println(" ******* Starting"+config.getServletName());
		Enumeration<String> enumr= config.getInitParameterNames();
		System.out.println("init Parameters ");
		while (enumr.hasMoreElements()) {
			String string =  enumr.nextElement();
			System.out.println(config.getInitParameter(string));
		}
		
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)throws ServletException, IOException {
		System.out.println("output from service");
	
		PrintWriter pw = arg1.getWriter();
		pw.write("Hello world");
	}
	
	@Override
	public void destroy() {
		System.out.println("output from destroy");
	}
}
