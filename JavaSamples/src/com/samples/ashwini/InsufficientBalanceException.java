package com.samples.ashwini;
public class InsufficientBalanceException extends Exception {
	public static void main(String[] args) {
		
		
		InsufficientBalanceException e = new InsufficientBalanceException();
		int i = 10;
		System.out.println(e);
	}
	
	@Override
	public String toString() {
		return "Insufficient Balance";
	}
}

