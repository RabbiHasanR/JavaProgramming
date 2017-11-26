package com.daynamicbonding.javabook;

public class DaynamicBonding {

	public static void main(String[] args) {
		// dynamic bonding//
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());

	}

	// object passing static method//
	private static void m(Object x) {
		System.out.println(x.toString());

	}

}
