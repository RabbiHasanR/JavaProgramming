package com.practise.method;

public class PriviliageCustomer1 extends Customer5{
	private String memCard;
	public PriviliageCustomer1(String customerName,String memCard){
		super(customerName);
		this.memCard=memCard;
		
	}
	public void displayInformation(){
		super.displayInformation();
		System.out.println("Membership Care:"+memCard);
	}

}
