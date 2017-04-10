package model;

public class Product
{
	private String prodID;
	private String prodType;
	private int weight;
	
	public Product(String prodID, String prodType, int weight)
	{
		this.prodID = prodID;
		this.prodType = prodType;
		this.weight = weight;
	}
	
	public String getProdID()
	{
		return this.prodID;
	}
	public void setProdID(String prodID)
	{
		this.prodID = prodID;
	}
	
	public String getProdType()
	{
		return this.prodType;
	}
	public void setProdType(String prodType)
	{
		this.prodType = prodType;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
}
