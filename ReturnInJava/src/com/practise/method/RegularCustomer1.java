package com.practise.method;

public class RegularCustomer1 extends Customer5{
	
	private double discout;
	public RegularCustomer1(String customerName,double discount){
		super(customerName);
		this.discout=discount;
	}
	public void displayInformation(){
		super.displayInformation();
		System.out.println("Discount:"+discout);
	}

}
