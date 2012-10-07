package com.samples.ashwini;

public class Account {
	private double balance;
	private int id;
	private Account source, destination;
	private int amount;
	
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
	
	public String toString() {
		return "Acc#:"+getId()+" Name:"+getName();
	}

	    public Account() {
	        this.balance = 0;
	    }

	    public void transfer(int amount) {
	        this.balance += amount;
	    }

	    public String displayBalance() {
	        return "Account (balance: " + balance + ")";
	    }
	

	
	
	
	public void setTransfer(Account source, Account destination, int amount) {
        this.source = source;
        this.destination = destination;
        this.amount=amount;
    }

    public void performTransfer() {
        source.transfer(-amount);
        destination.transfer(amount);
    }

//    public String toString() {
//        return "TransferManager (openTransfers: " + openTransfers.size() + "; issuedTransfers: " + issuedTransfers + "; performedTransfers: " + performedTransfers + ")";
//    }

	
}


