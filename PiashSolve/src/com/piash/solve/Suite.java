package com.piash.solve;

public class Suite extends Room {
	public String bedRoom;
	public String livingArea;
	public String kitchen;
	public String airCondition;

	Suite(String noOfBed, String roomId, String facilitis, String bedRoom, String livingArea, String kitchen,
			String airCondition) {
		super(noOfBed, roomId, facilitis);
		this.bedRoom = bedRoom;
		this.livingArea = livingArea;
		this.kitchen = kitchen;
		this.airCondition = airCondition;
	}

	public void display() {
		System.out.println("Room Id is " + getRoomId());
		System.out.println("It has " + getNoOfBed() + "bed");
		System.out.println("Room facilitis is " + getFacilitis());
		System.out.println("Family room has " + airCondition);
		System.out.println("Suite has " + bedRoom);
		System.out.println("Suite has " + livingArea);
		System.out.println("Suite has " + kitchen);
	}

}
