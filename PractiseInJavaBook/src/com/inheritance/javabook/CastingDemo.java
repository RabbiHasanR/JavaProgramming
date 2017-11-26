package com.inheritance.javabook;

public class CastingDemo {
	public static void displayObject(Object object) {
		if (object instanceof Circle) {
			System.out.println("The cirlcle area is:" + ((Circle) object).getArea());
			System.out.println("The cirlce diameter is:" + ((Circle) object).getDameter());
		}

		else if (object instanceof Rectangle) {
			System.out.println("The rectangle area is:" + ((Rectangle) object).getArea());
			System.out.println("The rectangle perimeter is:" + ((Rectangle) object).getPerimeter());
		}

	}

}
