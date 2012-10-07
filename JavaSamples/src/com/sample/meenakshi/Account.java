package com.sample.meenakshi;

public class Account {

	private double balance;
	private char name;
	private long acctNum;

	public long acctNum() {
		return acctNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public char getname() {
		return name;
	}

	public void setId(char name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account#:"+acctNum+"  Name:"+getname();
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