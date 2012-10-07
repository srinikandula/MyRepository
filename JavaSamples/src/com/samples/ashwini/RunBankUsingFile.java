package com.samples.ashwini;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RunBankUsingFile {
public static void main(String args[]) throws IOException {
		
		System.out.println("1. Create Account");
		System.out.println("2. Account Balance");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Transfer");
		System.out.println("6. Exit");
		
		FileWriter fw = new FileWriter("accounts.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		FileReader fr = new FileReader("accounts.txt");
		BufferedReader br = new BufferedReader(fr);
		
		BankFileStore b = new BankFileStore();
		String input = b.readUserInput("Enter your choice");
		
		int i = Integer.parseInt(input);
		
		while(i != 5){
			switch(i){
				case 1:
					b.createAccount(bw, br);
					break;
				case 2:					
					b.findAccountBalance(br);
					break;
					/*case 3:
					  Arun
					 * Read account number(user input)
					 * Read amount to deposit(user input)
					 * find the account with given number in the accounts array
					 * add the amount to balance
					 
					b.deposit(accounts, accountCount);
					break;
	
				case 4:
					  Meenakshi
					 * Read account number(user input)
					 * Read amount to deposit(user input)
					 * find the account with given number in the accounts array
					 * substract the amount to balance
					 
					b.withdraw(accounts, accountCount);
					break;
				case 5:
					  Ashwini
					 * Read account source account number(user input)
					 * Read account destination account number(user input)
					 * Read amount to transfer(user input)
					 * find the accounts with given number in the accounts array
					 * do the transfer 
					 
					break;	*/
					b.transfer(bw,br);
					break;
				case 6:
					System.out.println("Exiting the menu");
					bw.close();
					System.exit(0);
				default:
					System.out.println("Invalid option entered");
			}			
			input = b.readUserInput("Enter your choice");
			i = Integer.parseInt(input);
		}
	}}
