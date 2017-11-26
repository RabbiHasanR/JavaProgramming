package com.linklist.practise;

import java.util.LinkedList;

public class MyClass {
	LinkedList<String> name = new LinkedList<String>();

	public void showName() {
		// add value in linkedlist
		name.add("Rabbi");
		name.add("Riaz");
		name.add("Rumman");
		// print size
		System.out.println("Size:" + name.size());
		// add new value in new index
		name.add(1, "Shihan");
		name.add(0, "Topu");
		name.remove(2);
		// modify name
		name.set(0, "Shihan");
		System.out.println("Size:" + name.size());
		name.remove(2);
		// print all value
		for (String n : name) {
			System.out.println(n);
		}
	}

}
