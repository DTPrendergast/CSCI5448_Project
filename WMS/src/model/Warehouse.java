package model;

import java.util.*;

public class Warehouse {
	private ArrayList<Forklift> forklifts;
	private ArrayList<RetBot> retbots;
	private ArrayList<Pallet> pallets;
	private ProductFactory productFactory;
		
	public Warehouse()
	{
		this.forklifts = new ArrayList<Forklift>();
		this.retbots = new ArrayList<RetBot>();
		this.pallets = new ArrayList<Pallet>();
		this.productFactory = new ProductFactory();
	}
	
	public ArrayList<Forklift> getForklifts()
	{
		return this.forklifts;
	}	
	public void addForklift(Forklift forklift)
	{
		this.forklifts.add(forklift);
	}
	public void removeForklift(Forklift forklift)
	{
		this.forklifts.remove(forklift);
	}
	
	public ArrayList<RetBot> getRetBots()
	{
		return this.retbots;
	}	
	public void addRetBot(RetBot retbot)
	{
		this.retbots.add(retbot);
	}
	public void removeRetBot(RetBot retbot)
	{
		this.retbots.remove(retbot);
	}
	
	public ArrayList<Pallet> getPallets()
	{
		return this.pallets;
	}	
	public void addPallet(Pallet pallet)
	{
		this.pallets.add(pallet);
	}
	public void removePallet(Pallet pallet)
	{
		this.pallets.remove(pallet);
	}
	
	public ProductFactory getProductFactory()
	{
		return this.productFactory;
	}
	public void setProductFactory(ProductFactory productFactory)
	{
		this.productFactory = productFactory;
	}
	
	public Warehouse initWarehouse()
	{
		
		return this;
	}

}
