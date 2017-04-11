package controller;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventoryController 
{
	private Connection conn = null;
	private static final String username = "root"; // This will have to reflect the u/n and pw 
	private static final String password = "1234"; // that we set up for our server
	
	public InventoryController() 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			System.out.println("No JDBC driver found");
			e.printStackTrace();
			return;
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/INVENTORY", username, password);
		} catch (SQLException e) {
			System.out.println("Connection failed.");
			e.printStackTrace();
			return;
		}
	}
	
	public boolean checkConnection() 
	{
		if (conn == null) {
			return false;
		}

		return true;
	}
	
	public boolean addNewItem(int prodID, String prodType, int quantity)  
	{
		try {
			java.sql.PreparedStatement stmt = null;
			String tableSql = "INSERT INTO INV (prodID, prodType, quantity)" + 
						" VALUES(?,?,?)";
			
			stmt = conn.prepareStatement(tableSql);
			stmt.setInt(1, prodID);
			stmt.setString(2, prodType);
			stmt.setInt(3, quantity);
			stmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean addToInventory(int prodID, int quantityToAdd)
	{
		java.sql.PreparedStatement stmt = null;
		int oldQuantity = getProductQuantity(prodID);
		
		String updateTable = "UPDATE inv SET quantity = ? " 
				+ "WHERE prodID = " + prodID;
		
		try {
			int newQuantity = oldQuantity + quantityToAdd; 
			stmt = conn.prepareStatement(updateTable);
			stmt.setInt(1, newQuantity);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean removeFromInventory(int prodID, int quantityToRemove)
	{
		java.sql.PreparedStatement stmt = null;
		int oldQuantity = getProductQuantity(prodID);
		
		String updateTable = "UPDATE inv SET quantity = ? " 
				+ "WHERE prodID = " + prodID;
		
		try {
			int newQuantity = oldQuantity - quantityToRemove; 
			
			if (newQuantity < 0) {
				System.out.println("ERROR: quantity cannot fall below 0");
				return false;
			}
			stmt = conn.prepareStatement(updateTable);
			stmt.setInt(1, newQuantity);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public int getProductQuantity(int prodID) 
	{
		java.sql.Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
		String sql = "SELECT quantity FROM INV WHERE prodID = " + prodID;
		
		try {
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public void closeConnection() 
	{
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("No connection to close");
			e.printStackTrace();
			return;
		}
	}
}
