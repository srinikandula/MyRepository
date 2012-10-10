package com.examples.srini;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bank {
		
	public static void main(String[] args) {
		Account a = new Account(); // 1 ,Srini 1000
		Account a1 = new Account(); // 1 ,Srini 1000
		
		Account.setBranchId("1001");
		
		a.setId(100);
		a1.setId(101);
		
		System.out.println(a.getId());
		System.out.println(a1.getId());
		System.out.println(a.getBranchId());
		System.out.println(a1.getBranchId());
		
	}
	public  void createAccount(Account[] accounts,int accountCount) throws IOException {
		Account a = new Account(); // 1 ,Srini 1000
		Account a1 = new Account(); // 1 ,Srini 1000
		
		Account.setBranchId("1001");
		
		a.setId(100);
		a1.setId(101);
		String  number = "100";
		Parrot p = new Parrot();
		Bird b = (Bird)p;		
		int i = Integer.parseInt(number);
		Integer object = new Integer(i);
		System.out.println(a.getId());
		System.out.println(a1.getId());
		System.out.println(a.getBranchId());
		System.out.println(a1.getBranchId());
		
		/*
		String name = readUserInput("Enter name");
		a.setName("Srini");
		
		String bal = readUserInput("Enter balance");
		a.setBalance(Double.parseDouble(bal));
		accounts[accountCount] = a;
		System.out.println("Account created: "+a);
		*/
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
		//BufferedReader read = new BufferedReader(new  InputStreamReader(System.in));
		
		InputStreamReader is = new  InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(is);
		
		String input = read.readLine();
		return input;
	}

	public void findAccountBalance(Account[] accounts,int accountsCount) throws IOException {
		/*
		 * Read account number(user input)
		 * find the account with given number in the accounts array
		 * print the balance
		 */
		String accNum = readUserInput("Enter account number");
		int accNumber = Integer.parseInt(accNum);
		boolean accountFound = false;
		//searching in the accounts array
		for(int i = 0;i<accountsCount;i++){
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
	
	public void deposit(Account[] accounts, int accountcount) throws IOException{
		String accNum= readUserInput("Enter account number");
		int accNumber= Integer.parseInt(accNum);
		String bal= readUserInput("Enter amount to deposit");
		Double val= Double.parseDouble(bal);
		boolean foundAccount = false;
		Account acc= findAccount(accounts, accountcount, accNumber);
		if(acc != null ){
			acc.setBalance(acc.getBalance()+val);
		}else{
			System.out.println("Accout not found");
		}
	/*	for(int i=0; i<accountcount;i++){
			Account account= accounts[i];
			if(account.getId()==accNumber){ 
				foundAccount = true;
				val=val+ account.getBalance();
				account.setBalance(val);				
				System.out.println("Amount "+ val+ " deposited in "+accNum);
			}				
		}
	*/	
				if(foundAccount == false)
		System.out.println("Account is not found");
	}
	public void withdraw(Account[] accounts, int accountCount) throws IOException {
		  String accNum = readUserInput("Enter account number");
		  String withdraw = readUserInput("How much you want to withdraw");
		  Account acc= findAccount(accounts, accountCount, Integer.parseInt(accNum));
			if(acc != null ){
				acc.setBalance(acc.getBalance()- Double.parseDouble(withdraw));
			}else{
				System.out.println("Accout not found");
			}
		  /*boolean foundAccount = false;
		  for(int i = 0;i<accountCount;i++){
		   Account account = accounts[i];
		   if(account.getId() == Integer.parseInt(accNum)){
		     double balance = account.getBalance();
		    account.setBalance (balance - Double.parseDouble(withdraw));
		    System.out.println("Account balance for "+accNum+" is "+account.getBalance());
		   }
		  }*/
		  
		 }
	public void withdraw(Account account,double balance){
		if(account.getBalance() > balance){
			account.setBalance(account.getBalance()-balance);
			//account.setBalance(finalBalance);
		}else
			throw new IllegalArgumentException("Insufficient funds in the account");
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
		
}

