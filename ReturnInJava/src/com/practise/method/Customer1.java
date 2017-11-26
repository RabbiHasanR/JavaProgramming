package com.practise.method;

public class Customer1 {
private String customerName;

public Customer1(String fname,String lname){
	String s1=fname.toUpperCase();
	String s2=lname.toLowerCase();
	
	if(s1.equals(s2))
		System.out.println("Both are same");
	
	else{
		System.out.println("Both are different");
		customerName=s1.concat(s2);
	}
		
}
public String getCustomerName(){
	return customerName;
}
}
