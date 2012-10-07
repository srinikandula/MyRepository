package com.samples.ashwini;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank{
	



	public  void createAccount(Account[] accounts,int accountCount) throws IOException {
		Account a = new Account(); // 1 ,Srini 1000
		String accNum = readUserInput("Enter Account number");
		a.setId(Integer.parseInt(accNum));
		
		String name = readUserInput("Enter name");
		a.setName(name);
		
		String bal = readUserInput("Enter balance");
		a.setBalance(Double.parseDouble(bal));
		accounts[accountCount] = a;
		System.out.println("Account created: "+a);
		/*
		 * 101 103 102
		 *  
		 * accounts[0] = 101
		 * accounts[1] = 103
		 * accounts[2] = 102
		 * 
		 */
	}

	public String readUserInput(String message) throws IOException{
		System.out.println(message);
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String input = read.readLine();
		return input;
	}

	public void findAccountBalance(Account[] accounts,int accountCount) throws IOException {
		/*
		 * Read account number(user input)
		 * find the account with given number in the accounts array
		 * print the balance
		 */

		
		String accNum = readUserInput("Enter account number");
		int accNumber = Integer.parseInt(accNum);
	     boolean accountFound = false;
		//searching in the accounts array
		for(int i = 0;i<accountCount;i++){
			Account account = accounts[i];
			if(account.getId() == accNumber){
				accountFound = true;
				
			
				System.out.println("Account balance for "+accNum+" is "+account.getBalance());
			}
		}
		//check if account is found
		if(accountFound == false){
			System.out.println("Account with #"+accNum+" is not found");
		}
		
	}
         
     
         
	
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
				}
				
		}


			
		/**
		 * Method to tranfer amount from one account to another
		 * 
		 * @param accounts
		 * @param accountsCount
		 * @throws IOException
		 * @throws InsufficientBalanceException 
		 */
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
                 }  
		}
}
}
