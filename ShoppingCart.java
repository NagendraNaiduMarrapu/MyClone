package com.myCloningWebsite;

import java.util.ArrayList;

public class ShoppingCart extends Products {

	public ShoppingCart(long productid, String Productname, double price, int availableQuantity) {
		super(productid, Productname, price, availableQuantity);
	}

	ArrayList<Products> productList = new ArrayList<Products>();

	public ArrayList<Products> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Products> productList) {
		this.productList = productList;
	}

	public void add_Product(long productid, String name, double price, int availableQuantity) {
		productList.add(new Products(productid, name, price, availableQuantity));

	}

	public void remove_Product(long productid) {
		for (Products product : productList) {
			if (product.getProductid() == productid) {
				productList.remove(product);
				break;
			}
		}
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;
		for (Products productPrice : productList) {
			totalPrice += productPrice.getPrice();
		}
		return totalPrice;
	}
}
