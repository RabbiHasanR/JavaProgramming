package com.practise.method;

public class Customer5 {
	private int customerId;
	private String customerName;
	private static int counter=0;
	public Customer5(String customerName){
		this.customerName=customerName;
		customerId=++counter;
	}
	public void displayInformation(){
		System.out.println("Customer Name:"+customerName);
		System.out.println("Customer Id:"+customerId);
		
	}

}
