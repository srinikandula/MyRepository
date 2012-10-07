package test.com.examples.srini;

import com.examples.srini.Account;
import com.examples.srini.Bank;

import junit.framework.TestCase;



public class TestBank extends TestCase{
	//negetive test
	public void testWithdrawWithInsufficientFunds(){
		try{
		Bank b = new Bank();
		Account acc = new Account();
		acc.setBalance(1000);
		b.withdraw(acc, 2000);
		fail("Withdraw should fail for insufficient funds");
		}catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	public void testWithdrawSuccess(){
		Bank b = new Bank();
		Account acc = new Account();
		acc.setBalance(3000);
		b.withdraw(acc, 2000);
		assertEquals(acc.getBalance(), 1000);
	}
}
