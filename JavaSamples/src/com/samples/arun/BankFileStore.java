package com.samples.arun;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

import com.samples.arun.Account;


public class BankFileStore {


	public  void createAccount(Writer bf) throws IOException {
		String accNum = readUserInput("Enter Account number");
		String name = readUserInput("Enter name");
		String bal = readUserInput("Enter balance");
		String record = accNum+","+name+","+bal+"\n";
		bf.write(record);
		System.out.println("Account created successfully");
	}

	public String readUserInput(String message) throws IOException{
		System.out.println(message);
		//BufferedReader read = new BufferedReader(new  InputStreamReader(System.in));
		
		InputStreamReader is = new  InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(is);
		
		String input = read.readLine();
		return input;
	}

	public void findAccountBalance(BufferedReader r) throws IOException {
		/*
		 * Read account number(user input)
		 * find the account with given number in the accounts array
		 * print the balance
		 */
		String accNum = readUserInput("Enter account number");
		int accNumber = Integer.parseInt(accNum);
		boolean accountFound = false;
		
	    String s;
        while ((s = r.readLine()) != null) {
        	String[] tokens = s.split(",");
        	int number = Integer.parseInt(tokens[0]);
        	if(number == accNumber){
        		accountFound = true;
        		System.out.println("Account balace is "+tokens[2]);
        	}
        }
		//check if account is found
		if(accountFound == false){
			System.out.println("Account with #"+accNum+" is not found");
		}
		
	}
	
	
	
	public Account findAccount(Account[] accounts, int accountcount,int accId){
		for(int i=0; i<accountcount;i++){
			Account account= accounts[i];
			if(account.getId()==accId){ 
				return account;
			}				
		}
		return null;}
	
	
		public void Deposit(Account[] accounts, int accountcount) throws IOException{
			String accNum= readUserInput("Enter account number");
			int accNumber= Integer.parseInt(accNum);
			String bal= readUserInput("Enter amount to deposit");
			Double val= Double.parseDouble(bal);
			
			for(int i=0; i<accountcount;i++){
				Account account= accounts[i];
				if(account.getId()==accNumber){ 
					val=val+ account.getBalance();
					account.setBalance(val);
					
					System.out.println("Amount "+ val+ " deposited in "+accNum);
				}				
				}}

		public void deposit(BufferedReader br, BufferedWriter bw) throws IOException {
			// TODO Auto-generated method stub
			String accNum= readUserInput("Enter account number");
			int accNumber= Integer.parseInt(accNum);
			String bal= readUserInput("Enter amount to deposit");
			Double val= Double.parseDouble(bal);
			boolean accountFound=false;
			String s;
	        while ((s = br.readLine()) != null) {
	        	String[] tokens = s.split(",");
	        	int number = Integer.parseInt(tokens[0]);
	        	if(number == accNumber){
	        		accountFound = true;
	        		double balance = Double.parseDouble(tokens[2]);
	        		balance= balance+val;
	        		String value = tokens[0]+tokens[1]+balance; 	
	        		bw.write(value);
	        	}
	        }
			//check if account is found
			if(accountFound == false){
				System.out.println("Account with #"+accNum+" is not found");
			}
		}
		
}

