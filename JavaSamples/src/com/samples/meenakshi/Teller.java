package com.samples.meenakshi;

class Teller {
	
	public void withdraw(Account account, double amount) {
		double d = account.getBalance() - amount;
		account.setBalance(d);
	}

	public void deposit(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
	}

	public void transfer(Account source, Account dest, double balance) {
		withdraw(source, balance);
		deposit(dest, balance);
		
	}
		
	public void main(String args[]) throws InsufficientBalanceException {	
		
	}
	

}
