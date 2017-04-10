package controller;

import model.*;
import view.*;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class WarehouseController implements ActionListener
{
	private Warehouse warehouse;
	private OperatorUI operatorUI;
			
	public WarehouseController()
	{
		this.warehouse = new Warehouse();
		this.operatorUI = new OperatorUI();
	}
	public void init()
	{
		ArrayList<JButton> selectPalletButtons = this.operatorUI.getSelectPalletButtons();
		for (JButton btn : selectPalletButtons)
		{
			btn.addActionListener(this);
		}
		
		ArrayList<JButton> destButtons = this.operatorUI.getDestButtons();
		for (JButton btn : destButtons)
		{
			btn.addActionListener(this);
		}
		
		ArrayList<JRadioButton> radioButtons = this.operatorUI.getRadioButtons();
		for (JRadioButton rdbtn : radioButtons)
		{
			rdbtn.addActionListener(this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("Button Pressed");
		
	}
	
	public Warehouse getWarehouse()
	{
		return this.warehouse;
	}
	public OperatorUI getOperatorUI()
	{
		return this.operatorUI;
	}
	
	public void placeOrder(String prodID, int qty)
	{
		// TODO
	}
	public void handleScanPallet(String prodID, String prodType, int qty, String location)
	{
		// TODO
	}
	public void handleMovePallet(String locA, String locB)
	{
		// TODO
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
