package com.lab.work;

public class Manager extends Employee implements IService {
	protected String takeSports;

	public Manager(String name, String id, String takeSports) {
		super(name, id);
		this.takeSports = takeSports;
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

	public void arrangeSportsEvent(Student st) {
		if (takeSports.equals("Yes")) {
			System.out.println(st.name + " " + "participate sports which arranged by" + " " + name);
			System.out.println("Good Student");
		} else
			System.out.println("Regular Student");
	}

}
