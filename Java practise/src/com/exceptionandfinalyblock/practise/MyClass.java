package com.exceptionandfinalyblock.practise;

public class MyClass {

	public static int display() {
		int a = 10 / 0;
		try {

			return a;
		} catch (Exception e) {
			System.out.println(e);
			return a;
		} finally {
			System.out.println("Finally called");
			return a;
		}
	}

}
