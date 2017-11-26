package com.practise.method;

public class Customer4 {
	private String customerName;
	private int customerId;
	private static int counter=0;
	public Customer4(){
		customerId=++counter;
	}
	public Customer4(String customerName){
		this();
		this.customerName=customerName;
	}
	public int getCustomerId(){
		return customerId;
	}
	public String getCustomerName(){
		return customerName;
	}

}
