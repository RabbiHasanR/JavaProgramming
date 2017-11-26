package com.assignment.classwork;

public class MemberCustomer extends Customer {
	String memberType;
	protected double totalDiscount;

	public MemberCustomer(String name, String id, String address, String memberType) {
		super(name, id, address);
		this.memberType = memberType;
	}

}
