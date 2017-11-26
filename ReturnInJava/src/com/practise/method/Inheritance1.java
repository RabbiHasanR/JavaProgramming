package com.practise.method;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RgularCustomer rc=new RgularCustomer();
		rc.setCustomerId(100);
		rc.setDiscount(20);
		System.out.println("Customer Id is:"+rc.getCustomerId());
		System.out.println("Customer Discount is:"+rc.getDiscount());
		PrivilaigeCustomer pc=new PrivilaigeCustomer();
		pc.setCustomerId(101);
		pc.setMemCard("Platinam");
		System.out.println("Customer Id is:"+pc.getCustomerId());
		System.out.println("Customer Discount is:"+pc.getMemCard());

	}

}
