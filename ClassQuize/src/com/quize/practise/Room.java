package com.quize.practise;

public class Room {
	private int roomId;
	private double roomPrice;
	private String roomAvailability;
	public Room(int roomId,double roomPrice,String roomAvailability){
		this.roomId=roomId;
		this.roomPrice=roomPrice;
		this.roomAvailability=roomAvailability;
	}
	public int getRoomId(){
		return roomId;
	}
	public double getRoomPrice(){
		return roomPrice;
	}
	public String getRoomAvailability(){
		return roomAvailability;
	}

}
