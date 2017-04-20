package test;

import model.*;

public abstract class WarehouseLoader
{	
	public static void loadWarehouse(Warehouse warehouse)
	{
		// Define the robots to be created
		int numForklifts = 3;
		int numRetBots = 3;
		
		// Create the forklifts
		for (int i=0; i<numForklifts; i++)
		{
			Forklift robot = (Forklift)RobotFactory.createRobot("Forklift");
			warehouse.addForklift(robot);
		}
		
		// Create the retbots
		for (int i=0; i<numRetBots; i++)
		{
			RetBot robot = (RetBot)RobotFactory.createRobot("RetBot");
			warehouse.addRetBot(robot);
		}
		
		// Define the products and pallets to be created
		String prodID1 = "MIC-13";
		String prodType1 = "Microwave";
		int weight1 = 27;		
		int palletQty1 = 12;
		String palletLoc1 = "A3";
		
		String prodID2 = "COF=06";
		String prodType2 = "Coffe Maker";
		int weight2 = 6;
		int palletQty2 = 23;
		String palletLoc2 = "D1";
		
		String prodID3 = "BLE-21";
		String prodType3 = "Blender";
		int weight3 = 8;
		int palletQty3 = 24;
		String palletLoc3 = "LD2";		
		
		// Create the pallets and add them to the warehouse
		warehouse.getProductFactory().addProduct(prodID1, prodType1, weight1);
		Pallet pallet1 = new Pallet(warehouse.getProductFactory().lookupProduct(prodID1), palletQty1, palletLoc1);
		
		warehouse.getProductFactory().addProduct(prodID2, prodType2, weight2);
		Pallet pallet2 = new Pallet(warehouse.getProductFactory().lookupProduct(prodID2), palletQty2, palletLoc2);
		
		warehouse.getProductFactory().addProduct(prodID3, prodType3, weight3);
		Pallet pallet3 = new Pallet(warehouse.getProductFactory().lookupProduct(prodID3), palletQty3, palletLoc3);
		
		warehouse.addPallet(pallet1);
		warehouse.addPallet(pallet2);
		warehouse.addPallet(pallet3);
		
	}
	
	public static void incomingPallets(Warehouse warehouse) {
        String[] productNames = {"AirJordan","Bicycle","Carpet","Dishwasher","Earplugs","Freezer",
        		"GarbageCan","HockeyStick","InkCartridge","Jersey","Knife","Laptop",
        		"Monitor","New","Opp","Pit","Quilt","Refrigerator","Steamer","Toaster"};
        
        //right now it sets up the info for 100 pallets.
        for (int i = 0; i < 100; i++) {
                int weight = (int) (Math.random() * 100);
                int quantity = (int) (Math.random() * 100);
                int nameIndex = (int) (Math.random() * productNames.length);
                Integer nameNum = (int) (Math.random() * 98) + 1;
                
                String type = productNames[nameIndex];
                String ID = type.substring(0, 3).toUpperCase();
                if (nameNum < 10) {
                        ID = ID.concat("-0");
                } else {
                        ID = ID.concat("-");
                }
                ID = ID.concat(nameNum.toString());
                //System.out.println(ID);
                System.out.println("ID: " + ID + "  Type: " + type + "  Weight: " + weight + "  Quantity: " + quantity);
        }
	}	
}
