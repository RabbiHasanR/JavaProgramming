package com.lab.work;

public class Stuff extends Employee implements IService {
	public Stuff(String name, String id) {
		super(name, id);
	}

	public void roomRant() {
		System.out.println("Room is available");
	}

	public void foodService() {
		System.out.println("Give food for breakfast");
	}

	public void roomClean() {
		System.out.println("Room is clean");
	}

}
