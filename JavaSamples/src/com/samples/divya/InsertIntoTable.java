package com.samples.divya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class InsertIntoTable {

	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;

public void insert(Employee employee) {
				try {
					String queryString = "INSERT INTO Employee(Id, FirstName, LastName, Address, Street, City, State) VALUES(?,?,?,?,?,?,?)";
					//Connection = getConnection();
					ptmt = conn.prepareStatement(queryString);
					ptmt.setInt(1, employee.getId());
					ptmt.setString(2, employee.getFirstName());
					ptmt.setString(3, employee.getLastName());
					ptmt.setString(4, employee.getAddress());
					ptmt.setString(5, employee.getStreet());
					ptmt.setString(6, employee.getCity());
					ptmt.setString(7, employee.getState());
					
					ptmt.executeUpdate();
					System.out.println("Data inserted Successfully");
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


}
