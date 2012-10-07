package com.samples.divya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UpdateTable {

	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;

	public void update(Employee employee) {

	try {
		String queryString = "UPDATE Employee SET FirstName=? WHERE Id=?";
		//		Connection  = getConnection();
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
}
