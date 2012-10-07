package test.com.examples.srini;


import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.TestCase;

import com.examples.srini.Account;
import com.examples.srini.TellerJDBC;

public class TellerJDBCTest extends TestCase {
	Statement stmt;
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		stmt = mock(Statement.class);
		when(stmt.executeUpdate(anyString())).thenReturn(1);
	}
	public void testDeposit() throws SQLException{
		Account account = new Account();
		account.setBalance(1000);
		TellerJDBC teller = new TellerJDBC();
		teller.deposit(stmt, account, 1000.0);
		assertEquals(account.getBalance(), 2000.0);
	}
	
	
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		stmt.close();
	}
	
	
}
