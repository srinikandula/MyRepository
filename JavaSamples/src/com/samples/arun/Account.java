package com.samples.arun;

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
