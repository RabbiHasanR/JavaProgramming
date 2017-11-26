package com.inheritance.practise;

public class Blackberry extends Mobile {
	Blackberry(String manufature, String operatingSystem, String model, int cost) {
		super(manufature, operatingSystem, model, cost);
	}

	public String getModel() {
		return "this is blackberry" + " " + model;
	}

}
