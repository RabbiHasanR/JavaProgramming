package com.practise.method;

public class StaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		Customer c2=new Customer();
		System.out.println("Customer Id: "+c1.getCustomerId());
		System.out.println("Customer Id: "+c2.getCustomerId());
		System.out.println("Total Customer: "+Customer.getTotalCustomer());
		

	}

}
