package com.practise.method;

public class PriviliageCustomer extends Customer3{
	private String memCard;
	public PriviliageCustomer(int customerId,String memCard){
		super(customerId);
		this.memCard=memCard;
	}
	public String getMemCard(){
		return memCard;
	}

}
