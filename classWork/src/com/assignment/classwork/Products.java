package com.assignment.classwork;

public class Products {
	protected String id;
	protected String name;
	protected String productAvailability;
	protected double price;

	public Products(String id, String name, String productAvailability, double price) {
		this.id = id;
		this.name = name;
		this.productAvailability = productAvailability;
		this.price = price;

	}

	public void setProductAvailability(String productAvailability) {
		this.productAvailability = productAvailability;
	}

	public void showProductInfo() {
		System.out.println("Product id is:" + id);
		System.out.println("Product name is:" + name);
		System.out.println("Product price is:" + price);
	}

}
