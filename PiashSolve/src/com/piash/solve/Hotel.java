package com.piash.solve;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardRoom sr = new StandardRoom("Single", "S101", "Basic");
		FamillyRoom fr = new FamillyRoom("Double", "F101", "Basic", "AirCondition");
		Suite s = new Suite("Double/Single", "S101", "Basic", "BedRoom", "LivingArea", "Kitchen", "AirCondition");
		Customer c = new Customer("C101", "Piash", "piash40@gmail.com", "Dhaka", "standard");
		c.rentRoom(sr, fr, s);

	}

}
