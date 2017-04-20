package controller;


public class JDBCtest {

	public static void main(String[] args) {

		InventoryController conn = new InventoryController();

		if (conn.checkConnection()) 
			System.out.println("Connection established");
		
		if (conn.createTable("inventory"))
			System.out.println("Inventory created");
		else
			System.out.println("Inventory already exists");
		
		if (conn.addNewItem("inventory", 1234, "Microwave", 4))
			System.out.println("Item added to database");
		else
			System.out.println("New item not added");
		
		int q = conn.getProductQuantity("inventory", 1234);
		System.out.println("There are " + q + " microwaves.");
		
		if (conn.addToInventory("inventory", 1234, 5)) 
			System.out.println("Items added to inventory");
		else
			System.out.println("Items not added to inventory");
		
		if (conn.removeFromInventory("inventory", 1234, 2)) 
			System.out.println("Removed from inventory");
		else
			System.out.println("Not removed from inventory");
		
		q = conn.getProductQuantity("inventory", 1234);
		System.out.println("There are " + q + " microwaves.");
		
		conn.closeConnection();
	}

}
