package com.samples.ashwini;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;






class BankObjectStore {
		
	public  void createAccount() throws IOException {
		String accNum = readUserInput("Enter Account number");
		FileOutputStream fos = new FileOutputStream(accNum+".txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		String name = readUserInput("Enter name");
		String bal = readUserInput("Enter balance");
		
		CheckingAccount account = new CheckingAccount();
		account.setId(Integer.parseInt(accNum));
		account.setName(name);
		account.setBalance(Double.parseDouble(bal));
		//write the account object in to a file
		oos.writeObject(account);

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

	public void findAccountBalance() throws IOException, ClassNotFoundException {
		/*
		 * Read account number(user input)
		 * find the account with given number in the accounts array
		 * print the balance
		 */
		String accNum = readUserInput("Enter account number");
		String fileName =  accNum+".txt";
		File f = new File(fileName);
		if(f.exists()){
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Account account = (Account)ois.readObject();
			System.out.println("Account balance is "+account.getBalance());
		}
		else{
			System.out.println("Account not found");
		}
		
	}

	
	
	
public void transfer() throws IOException, InsufficientBalanceException {
    
    String sourceAcctNum = readUserInput("Enter source account number");
    FileOutputStream fos = new FileOutputStream(sourceAcctNum+".txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    File f = new File(fileName);
	
    String destAccNum = readUserInput("Enter distination account number");
    FileOutputStream fos1 = new FileOutputStream(destAccNum+".txt");
    ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
    File f1 = new File(fileName);
    
  
    String amount = readUserInput("Enter amount to be transfered");
   Double  amount1 = Double.parseDouble(amount);
    System.out.println(" amount is"+amount);
    
   
  
String accNum = readUserInput("Enter account number");
String fileName =  accNum+".txt";
File f = new File(fileName);
if(f.exists()){
	FileInputStream fis = new FileInputStream(fileName);
	ObjectInputStream ois = new ObjectInputStream(fis);
	Account account = (Account)ois.readObject();
	System.out.println("Account balance is "+account.getBalance());
}
else{
	System.out.println("Account not found");
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

	
