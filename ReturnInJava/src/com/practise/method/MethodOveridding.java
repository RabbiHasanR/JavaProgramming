package com.practise.method;

public class MethodOveridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularCustomer1 rc=new RegularCustomer1("Rabbi",50);
		rc.displayInformation();
		PriviliageCustomer1 pc=new PriviliageCustomer1("Nayem","Platinum");
		pc.displayInformation();

	}

}
