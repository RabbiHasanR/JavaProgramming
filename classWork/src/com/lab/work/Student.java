package com.lab.work;

public class Student extends Person {
	public Student(String name, String id) {
		super(name, id);
	}

	public void bookRoom(Manager m) {
		m.roomRant();
		System.out.println("Student Name:" + name);
		System.out.println("Manager Name:" + m.name);
	}

	public void buyFood(Stuff s) {
		s.foodService();
		System.out.println(" buy food for:");
		System.out.println("Student Name:" + name);
		System.out.println("Food suplier:");
		System.out.println("Stuff Id:" + s.id);
		System.out.println("Stuff Name:" + s.name);
	}

}