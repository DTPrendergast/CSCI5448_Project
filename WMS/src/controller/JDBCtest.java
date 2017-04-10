package controller;

public class JDBCTest {

	public static void main(String[] args) {

		InventoryController conn = new InventoryController();

		if (conn.checkConnection()) 
			System.out.println("Connection established");
		
		if (conn.addToInventory(1234, "Microwave", 4))
			System.out.println("Item added to database");
		else
			System.out.println("Item not added");
		
		int q = conn.getProductQuantity(1234);
		System.out.println("There are " + q + " microwaves.");
		
		if (conn.removeFromInventory(1234, 2)) 
			System.out.println("Removed from inventory");
		else
			System.out.println("Not removed from inventory");
		
		q = conn.getProductQuantity(1234);
		System.out.println("There are " + q + " microwaves.");
		
		conn.closeConnection();
	}

}
