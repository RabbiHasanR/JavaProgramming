package com.challenge.java;

public class MySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder add=new Adder();
		System.out.println("My superclass is: "+add.getClass().getSuperclass().getName());
		System.out.println(add.add(10, 32)+" "+add.add(10, 3)+" "+add.add(10, 10));

	}

}
