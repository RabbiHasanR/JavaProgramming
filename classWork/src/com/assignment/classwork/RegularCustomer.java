package com.assignment.classwork;

public class RegularCustomer extends Customer implements ITax {
	public RegularCustomer(String name, String id, String address) {
		super(name, id, address);

	}

	public void payTax(Products p) {
		totalTax = (p.price * 2) / 100;
	}

	public void totalPurches(Products p) {
		super.buyProducts(p);
		System.out.println("Total tax:" + totalTax);
		System.out.println("Total price:" + (p.price + totalTax));
	}

}