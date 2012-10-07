package com.examples.srini;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TellerJDBC {
	public void deposit(Statement stmt,Account account,double amount) throws SQLException{
		account.setBalance(account.getBalance()+amount);
		stmt.executeUpdate("update account set balance ="+account.getBalance()+
				" where id "+account.getId());
	}
	public Account findAccount(Statement stmt,int accNum) throws SQLException{
		ResultSet rs = stmt.executeQuery("select * from account where id="+accNum);
		Account account = null;
		if(rs.next()){
			account = new Account();
			account.setId(rs.getInt("id"));
			account.setBalance(rs.getDouble("balance"));
		}
		return account;
	}
}
