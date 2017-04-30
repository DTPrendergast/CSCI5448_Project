package controller;

import model.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class ModelObserver implements Observer
{
	private WarehouseController warehouseController;
		
	public ModelObserver(WarehouseController warehouseController)
	{
		this.warehouseController = warehouseController;		
	}
	public WarehouseController getWarehouseController()
	{
		return this.warehouseController;
	}
	public void setWarehouseController(WarehouseController warehouseController)
	{
		this.warehouseController = warehouseController;
	}
	public void addObserver()
	{
		ArrayList<Pallet> pallets = warehouseController.getWarehouse().getPallets();
		for (Pallet pallet : pallets)
		{
			pallet.addObserver(this);
			pallet.indicateChange();			
		}		
		ArrayList<Forklift> forklifts = warehouseController.getWarehouse().getForklifts();
		for (Forklift forklift : forklifts)
		{
			forklift.addObserver(this);
			forklift.indicateChange();			
		}		
		ArrayList<RetBot> retbots = warehouseController.getWarehouse().getRetBots();
		for (RetBot retbot : retbots)
		{
			retbot.addObserver(this);
			retbot.indicateChange();			
		}		
	}
	@Override
	public void update(Observable obs, Object obj)
	{			
		String changedObj = (String)obj;		
		
		if (changedObj.equals("Robot"))
		{
			
			Robot robot = (Robot)obs; 	
			String type = robot.getID().split("-")[0];
			int index = Integer.parseInt(robot.getID().split("-")[1]);
			
			ArrayList<JLabel> robotLEDs = new ArrayList<JLabel>();
			
			if (type.equals("FL"))
			{
				robotLEDs = this.warehouseController.getOperatorUI().getForkliftLEDs();
			}
			else if (type.equals("RB"))
			{
				robotLEDs = this.warehouseController.getOperatorUI().getRetBotLEDs();
			}			
			
			if (robot.getFunctional()==true)
			{				
				robotLEDs.get((2*index)-2).setForeground(new Color(50, 205, 50));
			}
			else if (robot.getFunctional()==false)
			{
				robotLEDs.get((2*index)-2).setForeground(new Color(255, 99, 71));
			}				
				
			if (robot.getBusy()==true) 
			{
				robotLEDs.get((2*index)-1).setForeground(new Color(255, 99, 71));						
			}
			else if (robot.getBusy()==false)
			{
				robotLEDs.get((2*index)-1).setForeground(new Color(50, 205, 50));						
			}						
		}
		else if (changedObj.equals("Pallet"))
		{
			Pallet pallet = (Pallet)obs;
			ArrayList<JLabel> palletLabels = this.warehouseController.getOperatorUI().getPalletLabels();
			
			if (!(pallet.getprevLocation().equals("n/a")))
			{
				int prevLocIndex = this.warehouseController.getOperatorUI().getPalletLabelIndex(pallet.getprevLocation());
				palletLabels.get(prevLocIndex).setText("");
			}
			
			if (!(pallet.getLocation().equals("n/a")))
			{
				int currLocIndex = this.warehouseController.getOperatorUI().getPalletLabelIndex(pallet.getLocation());				
				palletLabels.get(currLocIndex).setText(pallet.getComposedOf().getProdID() + "         " + pallet.getQty());
			}			
			
		}		
	}
}
