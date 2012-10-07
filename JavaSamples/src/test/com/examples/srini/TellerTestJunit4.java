package test.com.examples.srini;

import junit.framework.Assert;

import org.junit.Test;

import com.examples.srini.Account;
import com.examples.srini.Teller;


public class TellerTestJunit4  {
	
	@Test
	public void withDraw(){
		System.out.println("calling testWithDraw");
		Account account = new Account();
		account.setBalance(1000);
		Teller teller = new Teller();
		teller.withdraw(account, 1000.0);
		Assert.assertEquals(account.getBalance(), 0.0);
	}
	@Test
	public void deposit(){
		System.out.println("calling testDeposit");
		Account account = new Account();
		account.setBalance(1000);
		Teller teller = new Teller();
		teller.deposit(account, 1000.0);
		Assert.assertEquals("The deposit is not working good",account.getBalance(), 20.0);
	}
	public void testError() throws Exception{
		System.out.println("calling testError");
		if(true)
			throw new Exception();
	}
	public void noUnitTest(){
		System.out.println("calling noUnitTest");
	}
	
	
	
	
}
