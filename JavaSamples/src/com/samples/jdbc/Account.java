package com.samples.jdbc;

import java.io.*;
import java.sql.*;

import org.postgresql.*;


public class Account implements TellerInterface {
	
	public static void main(String args[]) throws SQLException, NumberFormatException, IOException{
		Account account= new Account();
		
		BufferedReader read = new BufferedReader
			     (new InputStreamReader(System.in));
		System.out.println("1. Create Account 1");
		System.out.println("2. Create Account 2");
		System.out.println("3. Transfer");
		System.out.println("Enter your Choice");
		 
		int i= Integer.parseInt(read.readLine());
		
		while(i!=4){
			
	
		switch(i){
			case 1:
				account.createAccount(1, "arun", 5000);
				System.out.println("Account 1 created");
				break;
			case 2:
				account.createAccount(2, "sam", 6000);
				System.out.println("Account 2 created");
				break;
			case 3:
				account.transfer(1,2,1000);
				break;
		}
		}	
		
		
	
	}

	public Connection getConnection() throws SQLException{
		
		DriverManager.registerDriver(new org.postgresql.Driver());
		Connection conn  = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/training","postgres","123456");
		return conn;
	}

	public void createAccount(int id, String name,double balance) throws SQLException {
		Connection conn = getConnection();
	   PreparedStatement pstmt = conn.prepareStatement("insert into public.account (id,name,balance) values(?,?,?)");
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setDouble(3, balance);
		pstmt.execute();
		
	}
	public double findAccBalance(int id) throws SQLException {
		Connection conn = getConnection();
		PreparedStatement pstmt1= conn.prepareStatement("Select balance from public.account where id=?");
		pstmt1.setInt(1,id);// find the account with id 
		ResultSet rs= pstmt1.executeQuery(); // find acc balance
		rs.next();
		return rs.getDouble(1);
	}
	
	public void setAccountBalance(int id, double balance) throws SQLException{
		Connection conn = getConnection();
		PreparedStatement pstmt2=conn.prepareStatement("Update account set balance = ? where id=?");
	    pstmt2.setDouble(1,balance);
	    pstmt2.setInt(2,id);
	    pstmt2.executeUpdate();
	}
	
    public void deposit(int id, double amount) throws SQLException {
		
	    double val= findAccBalance(id);
	    val= val+amount;
	     setAccountBalance(id,val);
	}
    
	public void withdraw(int id, double amount) throws SQLException {
		double bal= findAccBalance(id);
	    bal= bal-amount;
	    setAccountBalance(id,bal);
	}

	public void transfer(int source, int dest, double amount) throws SQLException, NumberFormatException, IOException {
		Connection conn = getConnection();
		BufferedReader object = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Deposit");
		System.out.println("2. Transfer");
		int a= Integer.parseInt(object.readLine());
		switch(a)
		{
		case 1:
			deposit(1, amount);
			
		case 2:
			withdraw(2, amount);
		}
		
						
	}

		
	}

