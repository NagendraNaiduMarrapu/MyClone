package com.myCloningWebsite;

public class Products {
	long productid;
	String Productname;
	double price;
	int AvailableQuantity;

	public Products(long productid, String Productname, double price, int availableQuantity) {
		super();
		this.productid = productid;
		this.Productname = Productname;
		this.price = price;
		AvailableQuantity = availableQuantity;
	}

	public String getName() {
		return Productname;
	}

	public void setName(String name) {
		this.Productname = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableQuantity() {
		return AvailableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		AvailableQuantity = availableQuantity;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

}
