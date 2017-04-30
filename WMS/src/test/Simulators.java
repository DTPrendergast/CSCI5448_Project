package test;

import java.util.ArrayList;

import controller.WarehouseController;
import model.*;

public abstract class Simulators {
public static void incomingPalletsSim(WarehouseController warehouseC) {
        
		new Thread(new Runnable() {
		    public void run() {

		
		
				String[] productNames = {"AirJordan","Bicycle","Carpet","Dishwasher","Earplugs","Freezer",
		        		"GarbageCan","HockeyStick","InkCartridge","Jersey","Knife","Laptop",
		        		"Monitor","Nikes","Origami","Puma","Quilt","Refrigerator","Steamer","Toaster",
		        		"Umbrella","Vans","Watch","Xzibit","Yardstick","Zucchini"};
		        
		        //right now it sets up the info for 100 pallets.
		        for (int i = 0; i < 10; i++) {
		                int weight = (int) (Math.random() * 100);
		                int quantity = (int) (Math.random() * 100);
		                int nameIndex = (int) (Math.random() * productNames.length);
		                Integer nameNum = (int) (Math.random() * 98) + 1;
		                
		                String type = productNames[nameIndex];
		                String ID = type.substring(0, 3).toUpperCase();
		                if (nameNum < 10) {
		                        ID = ID.concat("0");
		                } 
		                ID = ID.concat(nameNum.toString());
		                
		                Product incoming = new Product(ID,type,weight);
		                
		                //for (int j = 0; j < 3; j++) {
		                boolean open = true;
		                int ldNum = (int) (Math.random() * 2) + 1;
		                ArrayList<Pallet> currentPL = warehouseC.getWarehouse().getPallets();
		                for (int j = 0; j < currentPL.size(); j++) {
		                	if (currentPL.get(j).getLocation().equals("LD"+ldNum)) {
		                		open = false;
		                	}
		                }
		                if (open) {
		                	warehouseC.handleScanPallet(incoming, quantity, "LD"+ldNum);
		                	//System.out.println("ID: " + ID + "  Type: " + type + "  Weight: " + weight + "  Quantity: " + quantity);
		                }
		                //}
		                
		                int randomSleepTime = (int) (((Math.random() * 10) + 50) * 1000);
		                
		                try {
							Thread.sleep(randomSleepTime);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                
		        }
        
		    }	
		}).start();	
	}		
	public static void incomingOrdersSim(WarehouseController warehouseC) {
        
		new Thread(new Runnable() {
		    public void run() {

		    	
		    	
		    	for (int i = 0; i < 20; i++) {
		    		ArrayList<Pallet> currentPL = warehouseC.getWarehouse().getPallets();
		    		
		    		int randomProduct = (int) (Math.random() * currentPL.size());
		    		int orderQuantity =  currentPL.get(randomProduct).getQty() / 5;
		    		orderQuantity++;
		    		String currentLocation = currentPL.get(randomProduct).getLocation();
		    		
		    		if (currentPL.get(randomProduct).getOnShelf() == true && 
		    				orderQuantity <= currentPL.get(randomProduct).getQty()) {
		    			warehouseC.handleOrder(currentPL.get(randomProduct).getComposedOf(), orderQuantity);
			    		
		    			//System.out.println(currentPL.get(randomProduct).getComposedOf().getProdType() + " " + orderQuantity +" success");
		    			
		    		} else {
		    			//System.out.println(currentPL.get(randomProduct).getComposedOf().getProdType() + " " + orderQuantity);
		    			//System.out.println("product in loading doc or quantity to high");
		    		}
		    		
		    		try {
						Thread.sleep(20000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    		
		    	}
		    }	
		}).start();	
	}
}
