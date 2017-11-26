package com.classproblem.homework;

public class DeluxRoom extends Room{
	private String cAddress;
	private String cName;
	public DeluxRoom(String roomId,double roomFare,String cName,String cAddress){
		super(roomId,roomFare);
		this.cName=cName;
		this.cAddress=cAddress;
	}
	public void roomSize(){
		System.out.println("Delux Room Size is 375-430sqf");
	}
	public void rentDeluxRoom(){
		roomSize();
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
