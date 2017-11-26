package com.sir.ans;

public class Main {

	public static void main(String[] args) {
		A a = new B();
		System.out.println("Class   A String: " + a.name);
		// this statement is compile error
		// B b=new A();

	}

}
