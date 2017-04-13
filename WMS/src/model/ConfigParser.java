package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigParser {
	
	private Properties prop;
	private InputStream in;
	private OutputStream out;
	
	public ConfigParser()
	{
		prop = new Properties();
	}
	
	public void readConfig(String config)
	{
		try {
			in = new FileInputStream(config);
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public void writeConfig(String key, String value, String config)
	{
		try {
			out = new FileOutputStream(config);
			prop.setProperty(key, value);
			prop.store(out, null);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public void writeConfig(String key, int value, String config) 
	{
		try {
			out = new FileOutputStream(config);
			prop.setProperty(key, Integer.toString(value));
			prop.store(out, null);
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
	
	public void closeOutput()
	{
		try {
			out.close();
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
