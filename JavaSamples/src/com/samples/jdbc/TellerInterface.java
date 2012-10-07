package com.samples.jdbc;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public interface TellerInterface {
	//create an account 
	public Connection getConnection() throws SQLException;
	public void createAccount(int id,String name,double balance) throws SQLException;
	public void deposit(int id,double amount) throws SQLException;
	public void withdraw(int id,double amount) throws SQLException;
	public void transfer(int source,int dest,double amount) throws SQLException, NumberFormatException, IOException;	
	public double findAccBalance (int id) throws SQLException;
	
}
