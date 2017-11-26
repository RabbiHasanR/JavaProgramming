package com.practise.method;

public class Customer {
	private int customerId;
	private static int counter=1000;
	
	public Customer(){
		customerId=++counter;
	}
	public int getCustomerId(){
		return customerId;
	}
	public static int getTotalCustomer(){
		return (counter-1000);
	}

}
