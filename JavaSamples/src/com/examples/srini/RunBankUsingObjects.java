package com.examples.srini;

import java.io.IOException;

public class RunBankUsingObjects {
	public static void main(String args[]) throws IOException, ClassNotFoundException {

		System.out.println("1. Create Account");
		System.out.println("2. Account Balance");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Transfer");
		System.out.println("6. Exit");

		BankObjectStore b = new BankObjectStore();
		String input = b.readUserInput("Enter your choice");

		int i = Integer.parseInt(input);
		while (i != 5) {
			switch (i) {
			case 1:
				b.createAccount();
				break;
			case 2:
				b.findAccountBalance();
				break;
			/*
			 * ccase 3: Arun Read account number(user input) Read amount to
			 * deposit(user input) find the account with given number in the
			 * accounts array add the amount to balance
			 * 
			 * b.deposit(accounts, accountCount); break;
			 * 
			 * case 4: Meenakshi Read account number(user input) Read amount to
			 * deposit(user input) find the account with given number in the
			 * accounts array substract the amount to balance
			 * 
			 * b.withdraw(accounts, accountCount); break; case 5: Ashwini Read
			 * account source account number(user input) Read account
			 * destination account number(user input) Read amount to
			 * transfer(user input) find the accounts with given number in the
			 * accounts array do the transfer
			 * 
			 * break;
			 */
			case 6:
				System.out.println("Exiting the menu");
				System.exit(0);
			default:
				System.out.println("Invalid option entered");
			}
			input = b.readUserInput("Enter your choice");
			i = Integer.parseInt(input);
		}
	}
}
