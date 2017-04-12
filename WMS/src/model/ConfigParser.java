package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigParser {
	
	private Properties prop;
	private InputStream in;
	
	public ConfigParser(String configFile)
	{
		prop = new Properties();
		
		try {
			in = new FileInputStream(configFile);
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void closeInput() 
	{
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getWeight(int num)
	{
		return Integer.parseInt(prop.getProperty("weight" + num));
	}
	
	public int getPalletQty(int num)
	{
		return Integer.parseInt(prop.getProperty("palletQty" + num));
	}
	
	public String getProdID(int num)
	{
		return prop.getProperty("prodID" + num);
	}
	
	public String getProdType(int num)
	{
		return prop.getProperty("prodType" + num);
	}
	
	public String getPalletLoc(int num)
	{
		return prop.getProperty("palletLoc" + num);
	}
	
	public int getNumLifts()
	{
		return Integer.parseInt(prop.getProperty("forklifts"));
	}
	
	public int getNumRets()
	{
		return Integer.parseInt(prop.getProperty("retbots"));
	}
	
	public int getNumProds()
	{
		return Integer.parseInt(prop.getProperty("numProducts"));
	}
}
