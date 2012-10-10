package com.examples.srini;

import java.io.Serializable;

public class Account implements Serializable,Comparable<Account> {
	private double balance;
	private int id;
	private String name;
	private static String branchId;
	
	public static String getBranchId() {
		return branchId;
	}
	public static void setBranchId(String branchId) {
		Account.branchId = branchId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		int i;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Acc#:"+getId()+" Name:"+getName();
	}
	@Override
	public int hashCode() {
		return getId();
	}
	@Override
	public int compareTo(Account target) {
		/*if(this.getId() == target.getId())
			return 0;
		if(this.getId() < target.getId())
			return -1;
		else
			return 1;*/
		if(this.getBalance() == target.getBalance())
			return 0;
		if(this.getBalance() < target.getBalance())
			return -1;
		else
			return 1;
				
	}
}
