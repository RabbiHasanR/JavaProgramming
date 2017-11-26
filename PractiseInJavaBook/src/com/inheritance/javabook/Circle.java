package com.inheritance.javabook;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getDameter() {
		return 2 * radius;
	}

	public double getPeimeter() {
		return 2 * radius * Math.PI;
	}

	public void printCircle() {
		System.out.println("The circle is created" + getDateCreated() + "and the radius is" + radius);
	}

}
