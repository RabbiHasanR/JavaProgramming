package com.piash.solve;

public class FamillyRoom extends Room {
	public String airCondition;

	FamillyRoom(String noOfBed, String roomId, String facilitis, String airCondition) {
		super(noOfBed, roomId, facilitis);
		this.airCondition = airCondition;
	}

	public void display() {
		System.out.println("Room Id is " + getRoomId());
		System.out.println("It has " + getNoOfBed() + "bed");
		System.out.println("Room facilitis is " + getFacilitis());
		System.out.println("Family room has " + airCondition);
	}

}
