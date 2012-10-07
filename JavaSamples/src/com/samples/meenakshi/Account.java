package com.samples.meenakshi;

public class Account {
	private double balance;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	@Override
	public String toString() {
		return "Acc#:"+getId()+" Name:"+getName();
	}

	
}

/*
 * 1. Create Account 
 * 2. Display Balance 
 * 3. Withdraw 
 * 4. Exit
 * 
 * 1 => Enter Id 
 * 		Enter Name 
 * 		Enter balance Account is created 
 * 2 => 
 * 		Enter account
 * 		Number The account balance is - 
 * 3 => Enter Account ID Enter amount to
 * withdraw Withdraw is successful/Insufficient balance
 */