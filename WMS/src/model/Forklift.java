package model;

import java.util.concurrent.TimeUnit;

public class Forklift extends Robot
{
	public Forklift()
	{
		this.busy = false;
		this.carryingObj = false;
		this.location = "garage";
		this.functional = true;
	}
	public void movePallet(Pallet pallet, String location)
	{
		this.setBusy(true);		
		
		// Add delay for robot to move to pallet
		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		// Change location of robot and indicate carrying object
		this.setLocation(pallet.getLocation());
		System.out.println("Forklift picked up pallet at " + pallet.getLocation());
		
		this.setCarryingObj(true);		
		pallet.setLocation("n/a");
		
		
		// Add delay for robot to take pallet to destination
		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		// Change location of robot, indicate not carrying object,
		// and indicate not busy
		this.setLocation(location);
		this.setCarryingObj(false);
		this.setBusy(false);
		pallet.setLocation(location);
		System.out.println("Forklift delivered pallet to " + pallet.getLocation());
				
		// Add delay for robot to move back to garage
		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		// Change location of robot
		this.setLocation("garage");		
	}
}
