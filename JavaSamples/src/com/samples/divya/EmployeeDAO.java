package com.samples.divya;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.postgresql.core.ConnectionFactory;


public class EmployeeDAO {
	
	 Connection conn = null;
     PreparedStatement ptmt = null;
     ResultSet rs = null;
     
    private Connection getConnection() throws SQLException{
    	Connection conn;
    	
    	conn=ConnectionFactory.getInstance().getConnection();
   
    }
    
    public void insert(Employee employee) {
		try {
			String queryString = "INSERT INTO Employee(Id, FirstName, LastName, Address, Street, City, State) VALUES(?,?,?,?,?,?,?)";
			Connection conn= getConnection();
			ptmt = conn.prepareStatement(queryString);
			ptmt.setInt(1, employee.getId());
			ptmt.setString(2, employee.getFirstName());
			ptmt.setString(3, employee.getLastName());
			ptmt.setString(4, employee.getAddress());
			ptmt.setString(5, employee.getStreet());
			ptmt.setString(6, employee.getCity());
			ptmt.setString(7, employee.getState());
			
			ptmt.executeUpdate();
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (conn  != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

public void update(Employee employee) {

	try {
		String queryString = "UPDATE Employee SET FirstName=? WHERE Id=?";
		Connection conn = getConnection();
		ptmt = conn.prepareStatement(queryString);
		ptmt.setString(1, employee.getFirstName());
		ptmt.setInt(2, employee.getId());
		ptmt.executeUpdate();
		System.out.println("Table Updated Successfully");
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			if (ptmt != null)
				ptmt.close();
			if (conn != null)
				conn.close();
		}

		catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
public void delete(int Id) {

	try {
		String queryString = "DELETE FROM Employee WHERE Id=?";
		Connection conn = getConnection();
		ptmt = conn.prepareStatement(queryString);
		ptmt.setInt(1, Id);
		ptmt.executeUpdate();
		System.out.println("Data deleted Successfully");
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			if (ptmt != null)
				ptmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
     
     public List<Employee> findEmployee(){
    	 		
	return null;
	}
}
