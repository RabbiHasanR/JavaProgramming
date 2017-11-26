package com.inheritance.practise;

public class Android extends Mobile {
	Android(String manufature, String operatingSystem, String model, int cost) {
		super(manufature, operatingSystem, model, cost);

	}

	public String getModel() {
		return "this is android" + " " + model;
	}

}
