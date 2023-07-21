package com.myCloningWebsite;

import java.util.ArrayList;

public class Shop {

	public static void main(String[] args) {
		ArrayList<Customer> al = new ArrayList<>();

		Products product1 = new Products(1, "Product 1", 10.99, 50);
		Products product2 = new Products(2, "Product 2", 5.99, 100);
		Products product3 = new Products(3, "Product 3", 7.49, 25);

		Customer customer1 = new Customer("John");
		Customer customer2 = new Customer("David");

		customer1.addToShoppingCart(product1);
		customer1.addToShoppingCart(product2);
		customer1.addToShoppingCart(product3);

		customer2.addToShoppingCart(product1);
		customer2.addToShoppingCart(product2);

		al.add(customer1);
		al.add(customer2);

		for (Customer customer : al) {

			System.out.println("\nProducts in the Shopping Cart:");
			System.out.println("Customer Name: " + customer.getPersonName());
			System.out.println("---------------------------");
			for (Products product : customer.getShoppingCart()) {
				System.out.println("Product ID: " + product.getProductid());
				System.out.println("Product Name: " + product.getName());
				System.out.println("Price: " + product.getPrice());
				System.out.println("---------------------------");
			}
			double totalPrice = customer.calculateTotalPrice();
			System.out.println("Shopping Cart Total Price: " + totalPrice);

		}
	}

}
