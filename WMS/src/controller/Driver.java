package controller;

import test.*;
import java.util.*;

import model.Warehouse;

public class Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("********** Warehouse Management System **********");
		System.out.println("Select Mode (1=Sim, 2=Real Operations): ");
		int mode = sc.nextInt();
		
		System.out.println("Select User Role (1=Warehouse Operator, 2=Inventory Manager): ");
		int role = sc.nextInt();
		
		WarehouseController warehouseController = new WarehouseController();
		warehouseController.init();		
		warehouseController.getOperatorUI().setVisible(true);
		
		// Initialize the warehouse
		//WarehouseLoader.loadWarehouse(warehouseController.getWarehouse());
		Warehouse warehouse = new Warehouse();
		warehouse.initWarehouse();
		System.out.println("Pallet 1 location is: " + warehouse.getPallets().get(0).getLocation());
		
		// Run simulators for orders and arriving trucks

	}
}
