package com.examples.srini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class HashSetTreeSettExample {
	public static void main(String[] args) {
		Account account[] = new Account[10];
		
		Account account1 = new Account();
		account1.setId(101);
		account1.setBalance(1000);
		
		Account account2 = new Account();
		account2.setId(105);
		account2.setBalance(3000);
		
		Account account3 = new Account();
		account3.setId(102);
		account3.setBalance(500);
		
		Account account4 = new Account();
		account4.setId(105);
		account4.setBalance(10000);
		
		
		account[0] = account1;
		account[1] = account2;
		account[2] = account3;
		
		
		
		Set<Account>  tree = new TreeSet<Account> ();
		Set<Account> hash = new HashSet<Account>();
		
		
		tree.add(account1); 
		tree.add(account2);
		tree.add(account3);
		tree.add(account4);

		
		hash.add(account1); 
		hash.add(account2);
		hash.add(account3);
		hash.add(account4);
		
	
		System.out.println("Tree.....");
		for(Account a:tree){
			System.out.println(a.getBalance());
		}
		
		System.out.println("Hash.....");
		for(Account a:hash){
			System.out.println(a.getBalance());
		}
	

	}
}
