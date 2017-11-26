package com.practise.inheritance;

public class Main {

	public static void main(String[] args) {
		/*Rectangle rec=new Rectangle();
		Triangle tri=new Triangle();
		rec.setValue(46,3 );
		tri.setValue(45, 5);
		System.out.println("The rectangle area is: "+rec.area());
		System.out.println("The triangle area is: "+tri.area());*/
		Car c=new Car();
		c.color="Blue";
		c.speed=198;
		c.size=23;
		c.cc=2000;
		c.gear=5;
		c.attributes();
		c.attributescar();

	}

}
