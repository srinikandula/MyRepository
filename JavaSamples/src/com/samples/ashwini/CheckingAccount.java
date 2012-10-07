package com.samples.ashwini;

import java.io.Serializable;

public class CheckingAccount implements Serializable {
	private double balance;
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
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
