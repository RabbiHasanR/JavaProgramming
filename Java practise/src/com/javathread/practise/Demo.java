package com.javathread.practise;

public class Demo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass2());
		Thread t2 = new Thread(new MyClass2());
		t1.start();
		t2.start();

	}

}
