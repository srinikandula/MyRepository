package com.examples.srini;

public class LoanApproverClient {
	public static void main(String[] args) {
		//LoanApprover approver = new LoanApprover();
		Account a = new Account();
		Registry boaRegistry = new Registry()
		boaRegistry.setIP("");
		LoanApprover approver = BOARegistry.getService("BOAApprover");
		approver.isApproved(account)
		
	}
}
