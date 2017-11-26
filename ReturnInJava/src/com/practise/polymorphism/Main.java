package com.practise.polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank abc=new Bank_ABC();
		Bank def=new Bank_DEF();
		Bank xyz=new Bank_XYZ();
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());

	}

}
