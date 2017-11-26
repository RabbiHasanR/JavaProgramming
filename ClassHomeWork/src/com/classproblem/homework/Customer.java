package com.classproblem.homework;

public class Customer {
	private static int customerId=0;
	private String customerName;
	private String customerAddress;
	public Customer(){
		customerId++;
	}
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setCustomerAddress(String customerAddress){
		this.customerAddress=customerAddress;
	}
	public int getCustomerId(){
		return customerId;
	}
	public String getCustomerName(){
		return customerName;
	}
	public String getCustomerAddress(){
		return customerAddress;
	}

}
