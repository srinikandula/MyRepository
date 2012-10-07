package com.samples.meenakshi;

import java.sql.Connection;

public interface TellerInterface {
	//create an account 
	public Connection getConnection();
	public void createAccount(int id,String name);
	public void deposit(int id,double amount);
	public void withdraw(int id,double amount);
	public void transfer(int source,int dest,double amount);	
	
}
