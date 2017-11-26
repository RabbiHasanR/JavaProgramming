package com.lab.work;

abstract class Employee extends Person {
	public Employee(String name, String id) {
		super(name, id);
	}

	abstract void roomRant();

	abstract void foodService();

}
