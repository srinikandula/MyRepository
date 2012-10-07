package com.samples.ashwini;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;


class BankFileStore1{
		
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
		return null;
	}

public void transfer(Account[] accounts,int accountsCount) throws IOException, InsufficientBalanceException {
    
    String sourceAcctNum = readUserInput("Enter source account number");
    int sourceAccountNum = Integer.parseInt(sourceAcctNum);
    System.out.println("source account numberentered is"+sourceAccountNum);
    String destAccNum = readUserInput("Enter distination account number");
    int  destAccountNum = Integer.parseInt(destAccNum);
    System.out.println(" destination account number is"+destAccountNum);
    String amount = readUserInput("Enter amount to be transfered");
   Double  amount1 = Double.parseDouble(amount);
    System.out.println(" amount is"+amount);
    
    Account sourceAccount = null;
    Account destinationAccount = null;
	//searching in the accounts array
	for(int i = 0;i<accountsCount;i++){
		Account account = accounts[i];
		if(account.getId() == sourceAccountNum){
			sourceAccount = account;
		}else if(account.getId() == destAccountNum){
			destinationAccount = account;
		}

	}
	//check if account is found
	if(sourceAccount == null){
		System.out.println("Account with #"+sourceAccountNum+" is not found");
	}
	
	if(destinationAccount == null){
		System.out.println("Account with #"+destAccNum+" is not found");
	}

	 if(sourceAccount!=null && destinationAccount!=null){
	
		//Check for sufficient balance in source account
               if (sourceAccount.getBalance() < amount1)
                 throw new InsufficientBalanceException();
         
         else{
       
             System.out.println("transfer amount");

         
		//Subtract amount from source account
			sourceAccount.setBalance(sourceAccount.getBalance()-amount1);

			
			//Add amount into destination account
			destinationAccount.setBalance(amount1+ destinationAccount.getBalance());
		System.out.println("Source Account balance is : "+sourceAccount.getBalance());
	
		System.out.println("Destination Account balance is : "+destinationAccount.getBalance());
         }       }  
}


public void transfer(BufferedReader br, BufferedWriter bw) throws IOException {

	String sourceAcctNum = readUserInput("Enter source account number");
    int sourceAccountNum = Integer.parseInt(sourceAcctNum);
    System.out.println("source account numberentered is"+sourceAccountNum);
    String destAccNum = readUserInput("Enter distination account number");
    int  destAccountNum = Integer.parseInt(destAccNum);
    System.out.println(" destination account number is"+destAccountNum);
    String amount = readUserInput("Enter amount to be transfered");
   Double  amount1 = Double.parseDouble(amount);
    System.out.println(" amount is"+amount);
    boolean accountFound=false;
	String s;
    while ((s = br.readLine()) != null) {
    	String[] tokens = s.split(",");
    	int number = Integer.parseInt(tokens[0]);
    	if(number == sourceAccountNum){
    		accountFound = true;
    		
    		double balance = Double.parseDouble(tokens[2]);
    	}
    		else{


