package model;

import java.util.*;

public class Pallet
{
	private boolean isEmpty;
	private boolean onShelf;
	private Product composedOf;
	private int qty;
	private String location;
	
	public Pallet(Product composedOf, int qty, String location)
	{
		this.composedOf = composedOf;
		this.qty = qty;
		this.location = location;				
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
	}
	
	public int getQty()
	{
		return this.qty;
	}
	public void setQty(int qty)
	{
		this.qty = qty;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public void addProduct()
	{
		this.qty++;
	}
	public void removeProduct()
	{
		this.qty--;
	}
}
