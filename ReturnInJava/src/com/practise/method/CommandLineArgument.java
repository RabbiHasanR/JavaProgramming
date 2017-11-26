package com.practise.method;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String mode=args[6];
		//int pcharge=Integer.parseInt(args[1]);
		Purchase p=new Purchase(1001,1000);
		System.out.println("BillID:"+p.getBillId());
		System.out.println("BillAmount:"+p.getBillAmount());
		p.calculateBill("credit",5);
		System.out.println("NetBillAmount:"+p.getBillAmount());
		

	}

}
