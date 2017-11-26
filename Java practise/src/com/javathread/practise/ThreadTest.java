package com.javathread.practise;

public class ThreadTest {

	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		mc1.start();

		mc2.start();

	}

}
