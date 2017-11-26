package com.quize.practise;

public class Hostel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r=new Room(1001,2000.00,"yes");
		Manager m=new Manager(11,"Nayem");
		Student s=new Student("Rabbi","152-35-1199");
		s.rentRoom(m, r);
		
		
		

	}

}
