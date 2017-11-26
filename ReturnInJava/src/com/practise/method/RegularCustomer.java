package com.practise.method;

public class RegularCustomer extends Customer3{
	private double discount;
	
	public RegularCustomer(int customerId,double discount){
		super(customerId);
		this.discount=discount;
	}
	public double getDiscount(){
		return discount;
	}

}
