package com.practise.overiding;

public class Ebay extends Company {
	public void address(){
		super.address();
		System.out.println("this is ebay");
	}
	public void location(){
		super.address();
	}

}
