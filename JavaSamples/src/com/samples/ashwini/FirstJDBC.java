package com.samples.ashwini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","saibaba054");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while(rs.next()){
				System.out.println(rs.getString(1) +"  "+rs.getString("name") );
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/*
=>
=>	1 Srini
	2 John
	3 Kevin


*/