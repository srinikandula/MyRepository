package com.examples.srini;

public class Teller {

	public static void withdraw(Account account, double amount) {
		double d = account.getBalance() - amount;
		account.setBalance(d);
	}

	public static void deposit(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
	}

	static void transfer(Account source, Account dest, double balance)throws InsufficientBalanceException {
		if (source.getBalance() < balance)
			throw new InsufficientBalanceException();

		withdraw(source, balance);
		deposit(dest, balance);
	}

}
