package com.arraylist.practise;

import java.util.ArrayList;

public class MyClass {
	// ArrayList practise
	// create arraylist object or instance
	ArrayList<Integer> mylist = new ArrayList<Integer>(5);

	// add value in arraylist using method
	public void arraylistShow() {
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);
		// mylist.add(6);
		// mylist.add(7);
		// print all arraylist value
		for (Integer x : mylist) {
			System.out.println(x);
		}
		// print arraylist size
		System.out.println("Size: " + mylist.size());
		// remove index of arraylist
		// mylist.remove(3);
		// clear arraylist all index or value
		// mylist.clear();
		/// reset arraylist value
		// mylist.set(2, 33);
		for (Integer x : mylist) {
			System.out.println(x);
		}
		System.out.println("Size: " + mylist.size());
	}

}
