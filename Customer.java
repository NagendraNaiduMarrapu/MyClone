package com.myCloningWebsite;

import java.util.ArrayList;

public class Customer {
	private String personName;
	private ArrayList<Products> shoppingCart;

	public Customer(String personName) {
		this.personName = personName;
		this.shoppingCart = new ArrayList<Products>();
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public ArrayList<Products> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ArrayList<Products> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public void addToShoppingCart(Products product) {
		shoppingCart.add(product);
	}

	public void removeFromShoppingCart(Products product) {
		shoppingCart.remove(product);
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;
		for (Products product : shoppingCart) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}

}
