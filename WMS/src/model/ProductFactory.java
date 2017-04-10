package model;

import java.util.HashMap;

public class ProductFactory
{
	private HashMap<String, Product> productList;
	
	public ProductFactory()
	{
		this.productList = new HashMap<String, Product>();
	}
	public HashMap<String, Product> getProductList()
	{
		return this.productList;
	}
	public Product lookupProduct(String prodID)
	{
		return productList.get(prodID);
	}
	public void addProduct(String prodID, String prodType, int weight)
	{
		Product product = new Product(prodID, prodType, weight);
		productList.put(product.getProdID(), product);
	}
}
