package com.practise.method;

public class Purchase {
	private int billId;
	private double billAmount;
	
	public Purchase(int billId,double billAmount){
		this.billId=billId;
		this.billAmount=billAmount;
	}
	int getBillId(){
		return billId;
	}
	double getBillAmount(){
		return billAmount;
	}
	public void calculateBill(String mode,int pcharge){
		if(mode.equalsIgnoreCase("Credit")){
			billAmount=billAmount+(billAmount*pcharge/100);
		}
	}

}
