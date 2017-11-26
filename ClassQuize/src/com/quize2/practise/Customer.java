package com.quize2.practise;

public class Customer {
	private String customerId;
	private String customerName;
	private int customerWantProduct;
  public Customer(String customerId,String customerName,int customerWantProduct){
	  this.customerId=customerId;
	  this.customerName=customerName;
	  this.customerWantProduct=customerWantProduct;
	  
  }
  public String getCustomerId(){
	  return customerId;
  }
  public String getCustomerName(){
	  return customerName;
  }
  public int getCusotmerWantProduct(){
	  return customerWantProduct;
  }
}
