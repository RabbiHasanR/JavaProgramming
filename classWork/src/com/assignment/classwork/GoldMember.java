package com.assignment.classwork;

public class GoldMember extends MemberCustomer implements ITax, IDiscount {
	public GoldMember(String name, String id, String address, String memberType) {
		super(name, id, address, memberType);

	}

	public void payTax(Products p) {
		totalTax = (p.price * 2) / 100;
	}

	public void countDiscount(Products p) {
		super.totalDiscount = (p.price * 5) / 100;
	}

	public void totalPurches(Products p) {

	}

}
