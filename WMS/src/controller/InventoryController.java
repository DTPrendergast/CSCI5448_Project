package controller;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import model.ConfigParser;

import java.sql.PreparedStatement;

public class InventoryController 
{
	private Connection conn = null;
	private static final String username = "root"; // This will have to reflect the u/n and pw 
	private static final String password = "1234"; // that we set up for our server
	private static final String ip = "127.0.0.1"; // Will have to change this to a static IP
	private static final boolean debug = false; // If this is true, any exception raised will show error
	private static final String configFilePath = "F:\Google Drive\Education\CU Boulder\CSCI5448 OO Design\CSCI5448_Project\WMS\src\config.properties";
	
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
						+ ":3306/", "root", password);

			} else {
				conn = DriverManager.getConnection("jdbc:mysql://" + ip 
						+ ":3306/", username, password);
			}
		} catch (SQLException e) {
			System.out.println("Connection failed.");
			if (debug)
				e.printStackTrace();
			return;
		}
		createDB();
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.execute("use inventory");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void init() 
	{
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("DROP TABLE inventory");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
		createTable("inventory");
		ConfigParser config = new ConfigParser();
		config.readConfig(configFilePath);
		
		for (int product = 0; product < config.getNumProds(); product++) 
		{
			String prodID = config.getProdID(product);
			String prodType = config.getProdType(product);
			int palletQty = config.getPalletQty(product);
			if (addNewItem("inventory", prodID, prodType, palletQty))
				continue;				
			
			addToInventory("inventory", prodID, palletQty);
									
		}
		
		config.closeInput();	
	}
	
	public void createDB()
	{
		try{
			Statement stmt = null;
			String dBSql = "create database inventory";
			stmt = conn.createStatement();
			stmt.executeUpdate(dBSql);
		} catch (SQLException e) {
			if (debug) {
				e.printStackTrace();
			}
		}
	}

	public void printDatabase(String name) 
	{
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			if (debug) {
				e.printStackTrace();
			}
			return;
		}
		
		String sql = "SELECT * FROM " + name;
				
		try {
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			int columns = meta.getColumnCount();
			
			while (rs.next()) {
				for (int i = 1; i <= columns; i++) 
					System.out.print(rs.getString(i) + " ");
				
				System.out.println();
			}
		} catch(SQLException e) {
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
	
	public boolean addNewItem(String table, String prodID, String prodType, int quantity)  
	{
		try {
			PreparedStatement stmt = null;
			String tableSql = "INSERT INTO " + table + "(prodID, prodType, quantity)" + 
						" VALUES(?,?,?)";
			
			stmt = conn.prepareStatement(tableSql);
			stmt.setString(1, prodID);
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
	
	public boolean addToInventory(String table, String prodID, int quantityToAdd)
	{
		PreparedStatement stmt = null;
		int oldQuantity = getProductQuantity(table, prodID);
		
		String updateTable = "UPDATE " + table +  " SET quantity = ? " 
				+ "WHERE prodID = '" + prodID + "'";
		
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
	
	public boolean removeFromInventory(String table, String prodID, int quantityToRemove)
	{
		PreparedStatement stmt = null;
		int oldQuantity = getProductQuantity(table, prodID);
		
		String updateTable = "UPDATE " + table + " SET quantity = ? " 
				+ "WHERE prodID = '" + prodID + "'";
		
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
	
	public int getProductQuantity(String table, String prodID) 
	{
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			if (debug)
				e.printStackTrace();
			return -1;
		}
			
		String sql = "SELECT quantity FROM " + table + " WHERE prodID = '" + prodID + "'";
				
		try {
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			return rs.getInt("quantity");
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
