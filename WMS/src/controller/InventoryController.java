package controller;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class InventoryController 
{
	private Connection conn = null;
	private static final String username = "CSCI5448"; // This will have to reflect the u/n and pw 
	private static final String password = "1234"; // that we set up for our server

	private static final String ip = "172.31.98.152"; // Will have to change this to a static IP
	private static final boolean debug = true; // If this is true, any exception raised will show the 
												// explicit error. Otherwise, will client will have to error check

	
	public InventoryController() 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			System.out.println("No JDBC driver found");
			if (debug)
				e.printStackTrace();
			return;
		}

		try {
			if (debug) {
				conn = DriverManager.getConnection("jdbc:mysql://" + "127.0.0.1" 
						+ ":3306/INVENTORY", "root", password);

			} else {
				conn = DriverManager.getConnection("jdbc:mysql://" + ip 
						+ ":3306/INVENTORY", username, password);
			}
		} catch (SQLException e) {
			System.out.println("Connection failed.");
			if (debug)
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
	
	public boolean createTable(String name) {
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			if (debug)
				e.printStackTrace();
			return false;
		}
		
		String sql = "CREATE TABLE " + name + "(prodID VARCHAR(255), " +
					"prodType VARCHAR(255), " +
					"quantity INTEGER, " + 
					"PRIMARY KEY (prodID))";
		
		try {
			stmt.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			if (debug)
				e.printStackTrace();
			return false;
		}	
	}
	
	public boolean addNewItem(String table, int prodID, String prodType, int quantity)  
	{
		try {
			PreparedStatement stmt = null;
			String tableSql = "INSERT INTO " + table + "(prodID, prodType, quantity)" + 
						" VALUES(?,?,?)";
			
			stmt = conn.prepareStatement(tableSql);
			stmt.setInt(1, prodID);
			stmt.setString(2, prodType);
			stmt.setInt(3, quantity);
			stmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			if (debug)
				e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean addToInventory(String table, int prodID, int quantityToAdd)
	{
		PreparedStatement stmt = null;
		int oldQuantity = getProductQuantity(table, prodID);
		
		String updateTable = "UPDATE " + table +  " SET quantity = ? " 
				+ "WHERE prodID = " + prodID;
		
		try {
			int newQuantity = oldQuantity + quantityToAdd; 
			stmt = conn.prepareStatement(updateTable);
			stmt.setInt(1, newQuantity);
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			if (debug)
				e.printStackTrace();
			return false;
		}
	}
	
	public boolean removeFromInventory(String table, int prodID, int quantityToRemove)
	{
		PreparedStatement stmt = null;
		int oldQuantity = getProductQuantity(table, prodID);
		
		String updateTable = "UPDATE " + table + " SET quantity = ? " 
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
			if (debug)
				e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public int getProductQuantity(String table, int prodID) 
	{
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			if (debug)
				e.printStackTrace();
			return -1;
		}
		
		String sql = "SELECT quantity FROM " + table + " WHERE prodID = " + prodID;
		
		try {
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			if (debug)
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
			if (debug)
				e.printStackTrace();
			return;
		}
	}
}
