package controller;

import test.*;
import java.util.*;

import model.Warehouse;

public class Driver
{
	private static Scanner sc;
	private static Scanner invSc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("********** Warehouse Management System **********");
		System.out.print("Select Operating Mode (1=Sim, 2=Real Operations, 3=Inventory Management): ");
		int mode = sc.nextInt();
		
		if (mode == 1) 
		{
			WarehouseController warehouseController = new WarehouseController();
			warehouseController.init();		
			warehouseController.getOperatorUI().setVisible(true);
		}
		else if (mode == 2)
		{
			System.out.println("Not implemented");
		}
		else if (mode == 3)
		{
			InventoryController conn = new InventoryController();
			int invMode;
			do {
				System.out.print("Select function (1=add new product, 2=add quantity,"
									+ "3=remove quantity, 4=display contents): ");
				invSc = new Scanner(System.in);
				invMode = invSc.nextInt(); 
				Scanner scan;
				int quant;
				String prodID, item;
				
				switch (invMode) 
				{
				case 1:
					System.out.print("Enter an item: ");
					scan = new Scanner(System.in);
					item = scan.next();
					System.out.print("Enter a product ID: ");
					prodID= scan.next();
					System.out.print("Enter a quantity: ");
					quant = scan.nextInt();
					
					conn.addNewItem("inventory", prodID, item, quant);
					break;
				case 2:
					scan = new Scanner(System.in);
					System.out.print("Enter a product ID: ");
					prodID = scan.next();
					System.out.print("Enter a quantity to add: ");
					quant = scan.nextInt();
					
					conn.addToInventory("inventory", prodID, quant);
					break;
				case 3:
					scan = new Scanner(System.in);
					System.out.print("Enter a product ID: ");
					prodID = scan.next();
					System.out.print("Enter a quantity to remove: ");
					quant = scan.nextInt();
					
					conn.removeFromInventory("inventory", prodID, quant);
					break;
				case 4:
					conn.printDatabase("inventory");
					break;
				default:
					break;
				}
			} while (invMode != 5);
		}
		else {
			System.out.println("Invalid input. Exiting.");
		}
				
		// Run simulators for orders and arriving trucks

	}
}
