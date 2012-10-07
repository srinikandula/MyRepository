package com.samples.divya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.srini.DatabaseUtil;
import com.training.srini.IOUtil;

public class CustomerDAO {
	public void insertCustomer() throws ClassNotFoundException, SQLException{
		PreparedStatement pstmt = compileInsertQuery();
		insertCustomer(pstmt);
	}
	public PreparedStatement compileInsertQuery() throws ClassNotFoundException, SQLException{
		Connection conn = DatabaseUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(
				"insert into customer( customer_id,city,name,state)" +
				" values(?,?,?,?)");
		return pstmt;
	}
	
	public void insertCustomer(PreparedStatement pstmt) throws ClassNotFoundException, SQLException {
		Connection conn = DatabaseUtil.getConnection();
		Statement stmt = conn.createStatement();
		String id = IOUtil.readUserInput("Enter ID");
		String city = IOUtil.readUserInput("Enter city");
		String name = IOUtil.readUserInput("Enter name");
		String state = IOUtil.readUserInput("Enter state");
			
		/*stmt.executeQuery("insert in to customer( customer_id,city,name,state)" +
				" values("+id+",'"+city+"','"+name+"','"+state+"')");
		*/
		
		pstmt.setInt(1, Integer.parseInt(id));
		pstmt.setString(2, city);
		pstmt.setString(3, name);
		pstmt.setString(4, state);
		pstmt.execute();
	}
	
	public boolean findCustomer(int id) throws ClassNotFoundException, SQLException{
		Connection conn = DatabaseUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from customer where id="+id);
		if(rs.next())
			return true;
		else
			return false;
	}
	public void updateCustomer(int id,String name,String city,String state) throws ClassNotFoundException, SQLException{
		Connection conn = DatabaseUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("update customer set name =? and city =? and state =? where id =?");
		
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		pstmt.setString(3, state);
		pstmt.setInt(4, id);
		
	}

public void displayCustomerRecords(int id) throws SQLException, ClassNotFoundException{
	Connection conn =DatabaseUtil.getConnection();
	
	String  SQL = "SELECT id, name, city,state FROM CUSTOMER WHERE id =?";
	PreparedStatement  pstmt=conn.prepareStatement(SQL);
		   
		pstmt.setInt(1, id);
		
		
System.out.println("Displaying customer records"+id);

pstmt.close();

conn.close();		
}		
}				
			
	
		

 
