package com.oop.exercise;

public class Rectangle {
	public double width;
	public double height;

	Rectangle() {

	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerameter() {
		return 2 * (width + height);
	}

	public String toString() {
		return "Rectangle[Width=" + width + "height=" + height + "]";
	}

}
