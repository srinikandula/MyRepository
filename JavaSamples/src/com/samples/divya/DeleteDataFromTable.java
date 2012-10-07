package com.samples.divya;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DeleteDataFromTable {
	
    Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	
	public void delete(int id) {

         try {
                 String queryString = "DELETE FROM Employee WHERE Id=?";
                 Connection conn = getConnection();
                 ptmt = conn.prepareStatement(queryString);
                 ptmt.setInt(01,id );
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

}
