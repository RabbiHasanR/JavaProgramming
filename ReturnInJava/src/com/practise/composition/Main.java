package com.practise.composition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author ath=new Author("Rabbi","jasrabbi50@gmail.com","male");
		System.out.println(ath);
		
		ath.setEmail("hasan35-1199@diu.edu.bd");
		System.out.println(ath.getName());
		System.out.println(ath.getEmail());
		System.out.println(ath.getGender());

	}

}
