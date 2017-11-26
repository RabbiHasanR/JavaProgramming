package com.piash.solve;

public class Room {
	private String noOfBed;
	private String roomId;
	public String facilitis;

	Room(String noOfBed, String roomId, String facilitis) {
		this.noOfBed = noOfBed;
		this.roomId = roomId;
		this.facilitis = facilitis;
	}

	public String getNoOfBed() {
		return noOfBed;
	}

	public String getRoomId() {
		return roomId;
	}

	public String getFacilitis() {
		return facilitis;
	}

}
