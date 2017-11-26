package com.practise.method;

import java.util.Scanner;

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularCustomer rc=new RegularCustomer(100,30);
		System.out.println("Customer Id:"+rc.getCustomerId());
		System.out.println("Customer Id:"+rc.getDiscount());
		PriviliageCustomer pc=new PriviliageCustomer(101,"Gold");
		System.out.println("Customer Id:"+pc.getCustomerId());
		System.out.println("Customer Id:"+pc.getMemCard());
		
		Scanner input=new Scanner(System.in);
		String s=input.next();
		System.out.println(s);

	}

}
