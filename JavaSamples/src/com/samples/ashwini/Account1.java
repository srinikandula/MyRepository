package com.samples.ashwini;

public class Account1 {
	
	private String id;
	private String name;
	private String balance;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Acc#:"+getId()+" Name:"+getName()+"balance:"+getBalance();
	}
}

