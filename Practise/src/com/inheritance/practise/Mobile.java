package com.inheritance.practise;

public class Mobile {
	private String manufature;
	private String operatingSystem;
	public String model;
	private int cost;

	Mobile(String manufature, String operatingSystem, String model, int cost) {
		this.manufature = manufature;
		this.operatingSystem = operatingSystem;
		this.model = model;
		this.cost = cost;

	}

	public String getModel() {
		return this.model;
	}

}
