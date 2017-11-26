package com.classproblem.homework;

public class StandardRoom extends Room{
	
	private String cAddress;
	private String cName;
	public StandardRoom(String roomId,double roomFare,String cName,String cAddress){
		super(roomId,roomFare);
		this.cName=cName;
		this.cAddress=cAddress;
		
	}
	public void acAvaibality(){
		System.out.println("Standard Room has AC Available");
	}
	public void rentStandardRoom(){
		acAvaibality();
	}
	Customer c=new Customer();
	public void showAllInfo(){
		c.setCustomerName(cName);
		c.setCustomerAddress(cAddress);
		System.out.println("Room Id:"+getRoomId());
		System.out.println("Room Fare:"+getRoomFare());
		System.out.println("Customer ID:"+c.getCustomerId());
		System.out.println("Customer Name:"+c.getCustomerName());
		System.out.println("Customer Address:"+c.getCustomerAddress());
	}

}
