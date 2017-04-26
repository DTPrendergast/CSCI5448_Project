package controller;

import model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class ButtonHandler implements ActionListener
{	
	private WarehouseController warehouseController;
	private Pallet selectedPallet;	
	
	public ButtonHandler(WarehouseController warehouseController)
	{
		this.warehouseController = warehouseController;
		this.selectedPallet = null;
	}	
	public WarehouseController getWarehouseController()
	{
		return this.warehouseController;
	}
	public void setWarehouseController(WarehouseController warehouseController)
	{
		this.warehouseController = warehouseController;
	}
	public Pallet getSelectedPallet()
	{
		return this.selectedPallet;
	}
	public void setSelectedPallet(Pallet pallet)
	{
		this.selectedPallet = pallet;
	}
		
	public void attachListeners()
	{
		ArrayList<JButton> selectPalletButtons = this.warehouseController.getOperatorUI().getSelectPalletButtons();
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
				
		ArrayList<JButton> destButtons = this.warehouseController.getOperatorUI().getDestButtons();
		for (JButton btn : destButtons)
		{
			btn.addActionListener(this);
			btn.setActionCommand("Destination " + btn.getText());
		}
		
		ArrayList<JRadioButton> radioButtons = this.warehouseController.getOperatorUI().getRadioButtons();		
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
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{		
		String[] command = e.getActionCommand().split(" ");
		
		if (command[0].equals("Pallet"))
		{
			this.selectedPallet = this.warehouseController.getWarehouse().findPallet(command[1]);
			System.out.println("pallet is .." + this.selectedPallet.getComposedOf());
		}
		
		else if (command[0].equals("Destination") & !(this.selectedPallet==null))
		{
			this.warehouseController.handleMovePallet(this.selectedPallet, command[1]);
			this.selectedPallet = null;
		}
		else if (command[0].equals("Enable"))
		{
			// TODO
			System.out.println("Functionality not implemented.");
		}		
	}

}
