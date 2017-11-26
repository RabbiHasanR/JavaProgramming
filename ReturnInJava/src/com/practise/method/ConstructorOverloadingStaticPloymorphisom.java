package com.practise.method;

public class ConstructorOverloadingStaticPloymorphisom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer4 c=new Customer4();
		System.out.println("Customer Id:"+c.getCustomerId());
		System.out.println("Customer Name:"+c.getCustomerName());
		Customer4 c1=new Customer4("Rabbi");
		System.out.println("Customer Id:"+c1.getCustomerId());
		System.out.println("Customer Name:"+c1.getCustomerName());

	}

}
