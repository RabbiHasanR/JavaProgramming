package com.assignment.classwork;

public class Customer extends Person {

	double totalTax;

	public Customer(String name, String id, String address) {
		super(name, id, address);

	}

	public void buyProducts(Products p) {
		if (p.productAvailability.equals("yes")) {
			double totalPrice = p.price + totalTax;
			p.setProductAvailability("no");
			System.out.println("Products is avilable");
			p.showProductInfo();
			System.out.println("Tax:" + totalTax);
			System.out.println("Total Price:" + totalPrice);
		} else {
			System.out.println("no product available.");
		}
	}

}
