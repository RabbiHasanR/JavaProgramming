package com.classproblem.homework;

public class Room {
	private String roomId;
	private double roomFare;
	private final int TOTALROOM;
	
	public Room(String roomId,double roomFare){
		this.roomId=roomId;
		this.roomFare=roomFare;
		TOTALROOM=40;
	}
	public String getRoomId(){
		return roomId;
	}
	public double getRoomFare(){
		return roomFare;
	}
	public int getTotalRoom(){
		return TOTALROOM;
	}

}
