package com.samples.arun;
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
		}else{
			System.out.println("Account not found");
		}
		
	}
	
	public void deposit() throws IOException, ClassNotFoundException {
		String accNum = readUserInput("Enter account number");
		String fileName =  accNum+".txt";
		String bal= readUserInput("Enter amount to deposit");
		Double val= Double.parseDouble(bal);
		File f = new File(fileName);
		if(f.exists()){
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			CheckingAccount account = (CheckingAccount)ois.readObject();
			System.out.println("Account balance is "+account.getBalance());
			val=val+account.getBalance();
			
			FileOutputStream fos = new FileOutputStream(accNum+".txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			account.setBalance(val);
			oos.writeObject(account);
			
			System.out.println("The new balance is:"+ account.getBalance());
		}else{
			System.out.println("Account not found");
		}
		
	}
	}
