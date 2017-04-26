package model;

import java.util.*;

public class Warehouse extends Observable {
	private ArrayList<Forklift> forklifts;
	private ArrayList<RetBot> retbots;
	private ArrayList<Pallet> pallets;
	private ProductFactory productFactory;
	private static final String configFilePath = "config.properties";
		
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
		forklift.setID("FL-" + forklifts.size());		
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
		retbot.setID("RB-" + retbots.size());		
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
		ConfigParser config = new ConfigParser();
		config.readConfig(configFilePath);
		
		// Create the forklifts
		for (int lift = 0; lift < config.getNumLifts(); lift++)
		{
			Forklift robot = (Forklift)RobotFactory.createRobot("Forklift");
			this.addForklift(robot);
		}
		
		// Create the retbots
		for (int bot = 0; bot < config.getNumRets(); bot++)
		{
			RetBot robot = (RetBot)RobotFactory.createRobot("RetBot");
			this.addRetBot(robot);
		}
		
		for (int product = 0; product < config.getNumProds(); product++) 
		{
			String prodID = config.getProdID(product);
			String prodType = config.getProdType(product);
			int weight = config.getWeight(product);
			int palletQty = config.getPalletQty(product);
			String palletLoc = config.getPalletLoc(product);
						
			this.getProductFactory().addProduct(prodID, prodType, weight);
			Pallet pallet = new Pallet(this.getProductFactory().lookupProduct(prodID),
					palletQty, palletLoc);			

			this.addPallet(pallet);			
		}
		
		config.closeInput();
		return this;
	}
	public Pallet findPallet(String location)
	{
		for (Pallet pallet: this.pallets)
		{
			if (pallet.getLocation().equals(location))
				return pallet;
		}
		System.out.println("Error:  No pallet at that location!");
		return null;
	}
	public Pallet findPallet(Product product)
	{
		for (Pallet pallet: this.pallets)
		{
			if (pallet.getComposedOf().equals(product) & pallet.getOnShelf()==true)
			{
				return pallet;
			}
		}
		System.out.println("Error:  No pallet on the shelves contains that product!");
		return null;
	}
	public Forklift assignForklift()
	{		
		for (Forklift forklift: this.forklifts)
		{
			if (forklift.getFunctional()==true & forklift.getBusy()==false)
			{
				return forklift;
			}			
		}
		System.out.println("Error:  No Forklift available!");
		return null;
	}
	public RetBot assignRetBot()
	{
		for (RetBot retbot: this.retbots)
		{
			if (retbot.getFunctional()==true & retbot.getBusy()==false)
			{
				return retbot;
			}
		}
		System.out.println("Error:  No RetBot available!");
		return null;
	}
	
}
