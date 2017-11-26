package com.piash.solve;

public class StandardRoom extends Room {
	StandardRoom(String noOfBed, String roomId, String facilitis) {
		super(noOfBed, roomId, facilitis);
	}

	public void display() {
		System.out.println("Room Id is " + getRoomId());
		System.out.println("It has " + getNoOfBed() + "bed");
		System.out.println("Room facilitis is " + getFacilitis());
	}

}
