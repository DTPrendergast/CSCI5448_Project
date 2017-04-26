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
		System.out.println("Select Operating Mode (1=Sim, 2=Real Operations): ");
		int mode = sc.nextInt();
		
		WarehouseController warehouseController = new WarehouseController();
		warehouseController.init();		
		warehouseController.getOperatorUI().setVisible(true);
				
		// Run simulators for orders and arriving trucks

	}
}
