package com.examples.srini;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) {
		try {
			//Load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Loaded driver");
			//Create connection using DriverManager
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/training", "postgres", "postgres");
			System.out.println("established connection");
			
			//create a statement to run the queries
			Statement stmt = conn.createStatement();
			System.out.println("created statement");
			
			//run the SQL query
			ResultSet rs = stmt.executeQuery("select * from customer");
			System.out.println("ran the SQL query");
			
			while(rs.next()){
				
				int i = rs.getInt("customer_id");
				String city = rs.getString("city");
				String name = rs.getString("name");
				String state = rs.getString("state");
				Date createdDate = rs.getDate("createdDate");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
