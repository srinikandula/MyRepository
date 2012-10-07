package com.samples.ashwini;

import java.io.IOException;


public class RunBank {
public static void main(String args[]) throws IOException,  {
		
		Account[] accounts = new Account[10];
		
		System.out.println("1. Create Account");
		System.out.println("2. Account Balance");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Transfer");
		System.out.println("6. Exit");
	
		Bank b = new Bank();
		String input = b.readUserInput("Enter your choice");
		int accountCount = 0;
		
		int i = Integer.parseInt(input);
		while(i != 7){
			switch(i){
				case 1:
					b.createAccount(accounts,accountCount);
					accountCount++;
					break;
				case 2:					
					b.findAccountBalance(accounts,accountCount);
					break;
				case 3:
					/*  Arun
					 * Read account number(user input)
					 * Read amount to deposit(user input)
					 * find the account with given number in the accounts array
					 * add the amount to balance
					 */
					break;
	
				case 4:
					/*  Meenakshi
					 * Read account number(user input)
					 * Read amount to deposit(user input)
					 * find the account with given number in the accounts array
					 * substract the amount to balance
					 */
					break;
				case 5:
					/*  Ashwini
					 * Read account source account number(user input)
					 * Read account destination account number(user input)
					 * Read amount to transfer(user input)
					 * find the accounts with given number in the accounts array
					 * do the transfer 
					 */
					b.transfer(accounts,accountCount);
			
					break;	
				case 6:
					System.out.println("Exiting the menu");
					System.exit(0);
				default:
					System.out.println("Invalid option entered");
			}			
			input = b.readUserInput("Enter your choice");
			i = Integer.parseInt(input);
		}
	}}
