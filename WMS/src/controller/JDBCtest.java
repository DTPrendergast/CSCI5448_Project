package controller;


public class JDBCtest {

	public static void main(String[] args) {

		InventoryController conn = new InventoryController();

		if (conn.checkConnection()) 
			System.out.println("Connection established");
		
		if (conn.addNewItem(1234, "Microwave", 4))
			System.out.println("Item added to database");
		else
			System.out.println("Item not added; item already exists");
		
		int q = conn.getProductQuantity(1234);
		System.out.println("There are " + q + " microwaves.");
		
		if (conn.addToInventory(1234, 5)) 
			System.out.println("Items added to inventory");
		else
			System.out.println("Items not added to inventory");
		
		if (conn.removeFromInventory(1234, 2)) 
			System.out.println("Removed from inventory");
		else
			System.out.println("Not removed from inventory");
		
		q = conn.getProductQuantity(1234);
		System.out.println("There are " + q + " microwaves.");
		
		conn.closeConnection();
	}

}
