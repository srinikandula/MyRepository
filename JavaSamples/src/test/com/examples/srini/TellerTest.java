package test.com.examples.srini;

import com.examples.srini.Account;
import com.examples.srini.Teller;

import junit.framework.TestCase;


public class TellerTest extends TestCase {
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("calling setup");
	}
	
	public void testWithDraw(){
		System.out.println("calling testWithDraw");
		Account account = new Account();
		account.setBalance(1000);
		Teller teller = new Teller();
		teller.withdraw(account, 1000.0);
		assertEquals(account.getBalance(), 0.0);
	}
	public void testDeposit(){
		System.out.println("calling testDeposit");
		Account account = new Account();
		account.setBalance(1000);
		Teller teller = new Teller();
		teller.deposit(account, 1000.0);
		assertEquals("The deposit is not working good",account.getBalance(), 20.0);
	}
	public void testError() throws Exception{
		System.out.println("calling testError");
		if(true)
			throw new Exception();
	}
	public void noUnitTest(){
		System.out.println("calling noUnitTest");
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("calling teardown");
	}
	
	
}
