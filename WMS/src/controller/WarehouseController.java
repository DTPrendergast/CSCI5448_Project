package controller;

import model.*;
import view.*;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class WarehouseController implements ActionListener
{
	private Warehouse warehouse;
	private OperatorUI operatorUI;
	private Pallet selectedPallet;
			
	public WarehouseController()
	{
		this.warehouse = new Warehouse();
		this.operatorUI = new OperatorUI();
		this.selectedPallet = null;
	}
	public void init()
	{
		// Code to initialize state of the warehouse and establish listeners				
		ArrayList<JButton> selectPalletButtons = this.operatorUI.getSelectPalletButtons();
		for (int i=0; i<selectPalletButtons.size(); i++)
		{
			selectPalletButtons.get(i).addActionListener(this);			
			if (i==0)
			{
				selectPalletButtons.get(i).setActionCommand("Pallet QA");
			}
			else
			{
				selectPalletButtons.get(i).setActionCommand("Pallet LD" + i);
			}			
		}
				
		ArrayList<JButton> destButtons = this.operatorUI.getDestButtons();
		for (JButton btn : destButtons)
		{
			btn.addActionListener(this);
			btn.setActionCommand("Destination " + btn.getText());
		}
		
		ArrayList<JRadioButton> radioButtons = this.operatorUI.getRadioButtons();		
		int numBots = radioButtons.size()/2;
		for (int i=0; i<numBots; i++)
		{
			radioButtons.get(i).addActionListener(this);
			radioButtons.get(i).setActionCommand("Enable RetBot " + (i));
		}
		for (int i=0; i<numBots; i++)
		{
			radioButtons.get(i+numBots).addActionListener(this);
			radioButtons.get(i+numBots).setActionCommand("Enable Forklift " + (i));
		}
				
		// Code to add eventlister to the orderSim 
	}
	public Warehouse getWarehouse()
	{
		return this.warehouse;
	}
	public OperatorUI getOperatorUI()
	{
		return this.operatorUI;
	}
	public Pallet getSelectedPallet()
	{
		return this.selectedPallet;
	}
	public void setSelectedPallet(Pallet pallet)
	{
		this.selectedPallet = pallet;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{		
		String[] command = e.getActionCommand().split(" ");
		
		if (command[0].equals("Pallet"))
		{
			this.selectedPallet = this.warehouse.findPallet(command[1]);
			System.out.println("pallet is .." + this.selectedPallet.getComposedOf());
		}
		
		else if (command[0].equals("Destination") & !(this.selectedPallet==null))
		{
			this.handleMovePallet(this.selectedPallet, command[1]);
		}
		else if (command[0].equals("Enable"))
		{
			// TODO
			System.out.println("Functionality not implemented.");
		}		
	}	
	public void handleOrder(Product product, int qty)
	{
		// Select the appropriate RetBot
		RetBot retbot = this.warehouse.assignRetBot();
		
		// Find the pallet with the requested products
		Pallet pallet = this.warehouse.findPallet(product);

		// Command RetBot to "retrieve product" asynchronously
		EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						try
						{
							retbot.retrieveProduct(pallet, qty);
						} 
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				});
	}
	public void handleScanPallet(Product product, int qty, String location)
	{
		Pallet pallet = new Pallet(product, qty, location);
		this.warehouse.addPallet(pallet);
	}
	public void handleMovePallet(Pallet pallet, String locB)
	{
		// Select the appropriate Forklift
		Forklift forklift = this.warehouse.assignForklift();
		System.out.println("in handleMovePallet method");
		// Command Forklift to perform the "move pallet" task asynchronously
		new Thread(new Runnable() {
		    public void run() {
		    	forklift.movePallet(pallet, locB);
		    }
		}).start();	

		System.out.println("**** Continuing with 'handlMovePallet' method");
		try
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		this.selectedPallet = null;
		System.out.println("**** Continuing again ");
	}
	public int handleCancelMove(Forklift forklift)
	{
		// TODO
		return 1;		
	}
	public int handleDisableRobot(Robot robot)
	{
		// TODO
		return 1;
	}
	public void updateUI()
	{
		// TODO
	}
	
}
