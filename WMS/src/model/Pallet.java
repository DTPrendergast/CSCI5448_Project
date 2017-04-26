package model;

import java.util.Observable;

public class Pallet extends Observable
{
	private boolean isEmpty;
	private boolean onShelf;
	private Product composedOf;
	private int qty;
	private String location;
	private String prevLocation;
	
	public Pallet(Product composedOf, int qty, String location)
	{
		this.composedOf = composedOf;
		this.qty = qty;
		this.location = location;	
		this.prevLocation = "n/a";
	}	
	public boolean getIsEmpty()
	{
		if (this.qty==0)
		{
			return true;
		}
		return false;
	}	
	public boolean getOnShelf()
	{
		if (this.location.equals("QA") || this.location.equals("LD1") || this.location.equals("LD2") || this.location.equals("LD3"))
		{
			return false;
		}
		return true;
	}	
	public Product getComposedOf()
	{
		return this.composedOf;
	}
	public void setComposedOf(Product composedOf)
	{
		this.composedOf = composedOf;
		this.indicateChange();
	}	
	public int getQty()
	{
		return this.qty;
	}
	public void setQty(int qty)
	{
		this.qty = qty;
		this.indicateChange();
	}	
	public String getLocation()
	{
		return this.location;
	}
	public void setLocation(String location)
	{
		this.prevLocation = this.location;
		this.location = location;
		this.indicateChange();
	}	
	public String getprevLocation()
	{
		return this.prevLocation;
	}
	public void setprevLocation(String location)
	{
		this.prevLocation = location;		
	}
	public void addProduct()
	{
		this.qty++;
		this.indicateChange();
	}
	public void removeProduct()
	{
		this.qty--;
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
		
		this.notifyObservers("Pallet");
		
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
