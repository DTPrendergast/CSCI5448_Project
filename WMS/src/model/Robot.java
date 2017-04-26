package model;

import java.util.Observable;

public abstract class Robot extends Observable
{
	protected String iD;
	protected boolean busy;
	protected boolean carryingObj;
	protected String location;
	protected boolean functional;
	
	public Robot()
	{
		this.iD = null;
		this.busy = false;
		this.carryingObj = false;
		this.location = "garage";
		this.functional = true;
		this.indicateChange();
	}
	public String getID()
	{
		return this.iD;
	}
	public void setID(String iD)
	{
		this.iD = iD;
		this.indicateChange();
	}
	public boolean getBusy()
	{
		return this.busy;
	}
	public void setBusy(boolean busy)
	{
		this.busy = busy;
		this.indicateChange();
	}	
	public boolean getCarryingObj()
	{
		return this.carryingObj;
	}
	public void setCarryingObj(boolean carryingObj)
	{
		this.carryingObj = carryingObj;
		this.indicateChange();
	}	
	public String getLocation()
	{
		return this.location;
	}
	public void setLocation(String location)
	{
		this.location = location;
		this.indicateChange();
	}	
	public boolean getFunctional()
	{
		return this.functional;
	}
	public void setFunctional(boolean functional)
	{
		this.functional = functional;
		this.indicateChange();
	}
	public void indicateChange()
	{
		this.setChanged();
		
		try
		{
			Thread.sleep(50);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		this.notifyObservers("Robot");
		
		try
		{
			Thread.sleep(50);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		this.clearChanged();
	}

}
