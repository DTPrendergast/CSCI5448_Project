package model;

public abstract class Robot
{
	protected boolean busy;
	protected boolean carryingObj;
	protected String location;
	protected boolean functional;
	
	public boolean getBusy()
	{
		return this.busy;
	}
	public void setBusy(boolean busy)
	{
		this.busy = busy;
	}
	
	public boolean getCarryingObj()
	{
		return this.carryingObj;
	}
	public void setCarryingObj(boolean carryingObj)
	{
		this.carryingObj = carryingObj;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public boolean getFunctional()
	{
		return this.functional;
	}
	public void setFunctional(boolean functional)
	{
		this.functional = functional;
	}

}
