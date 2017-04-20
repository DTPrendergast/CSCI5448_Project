package model;

public class RetBot extends Robot
{
	public RetBot()
	{
		this.busy = false;
		this.carryingObj = false;
		this.location = "garage";
		this.functional = true;
	}
	public void retrieveProduct(Pallet pallet, int qty)
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
		this.setCarryingObj(true);
		for (int i=0; i<qty; i++)
		{
			pallet.removeProduct();
		}
		
		// Add delay for robot to take product(s) to the shipping center
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
		this.setLocation("Shipping Center");
		this.setCarryingObj(false);
		this.setBusy(false);
						
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
