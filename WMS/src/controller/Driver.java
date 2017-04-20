package controller;

import test.*;
import java.util.*;

public class Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("**********  Warehouse Management System **********");
		System.out.println("Select Mode (1=Sim, 2=Real Operations): ");
		int mode = sc.nextInt();
		
//		System.out.println("Select User Role (1=Warehouse Operator, 2=Inventory Manager): ");
//		int role = sc.nextInt();
		
		WarehouseController warehouseController = new WarehouseController();
		warehouseController.init();		
		warehouseController.getOperatorUI().setVisible(true);
		
		// Initialize the warehouse
		WarehouseLoader.loadWarehouse(warehouseController.getWarehouse());
				
		// Run simulators for orders and arriving trucks

	}
}
