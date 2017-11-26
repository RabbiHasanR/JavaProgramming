package com.inheritance.javabook;

public class TestCircleRectangle {

	public static void main(String[] args) {
		// Inheritance//

		Circle c = new Circle(1);
		System.out.println("A circle:" + c.toString());
		System.out.println("The radius is:" + c.getRadius());
		System.out.println("The area is:" + c.getArea());
		System.out.println("The diameter is:" + c.getDameter());
		Rectangle r = new Rectangle(2, 4);
		System.out.println("\nA rectangle" + r.toString());
		System.out.println("The area is:" + r.getArea());
		System.out.println("The perimeter is:" + r.getPerimeter());
		// polymorphism1//
		Ploymorphism.displayObject(new Circle(1, "red", false));
		Ploymorphism.displayObject(new Rectangle(2, 1, "White", true));
		// Casting Objects and the instanceof1 Operator//
		Object object1 = new Circle(1);
		Object object2 = new Rectangle(1, 1);
		CastingDemo.displayObject(object1);
		CastingDemo.displayObject(object2);

		/// Question answer 1//
		Circle cirlce = new Circle(5);
		GeometricObject object = cirlce;

		// Triangle Class//
		Triangle t = new Triangle(1, 1.5, 1, "yellow", true);
		System.out.println(t.toString());

	}

}
