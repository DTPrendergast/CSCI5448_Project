package model;

import java.util.*;

public class Pallet
{
	private boolean isEmpty;
	private Product composedOf;
	private int qty;
	private String location;
//	private ArrayList<Product> products;
	
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
	
//	public ArrayList<Product> getProducts()
//	{
//		return this.products;
//	}
	public void addProduct(Product product)
	{
		this.qty++;
	}
	public void removeProduct(Product product)
	{
		this.qty--;
	}
}
