package com.defferenceArrylistAndLinkedlist.practise;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyClass {
	long n = (long) 1E7;

	public void defferenceLinkedListAndArrayList() {
		// Insertion
		ArrayList al = new ArrayList();
		long mills = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			al.add(i);
		}
		System.out.println("Inserts ArrayList takes" + (System.currentTimeMillis() - mills) + "Millis");
		LinkedList ll = new LinkedList();
		mills = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			ll.add(i);
		}
		System.out.println("Inserts Linkedlist takes" + (System.currentTimeMillis() - mills) + "Millis");

		// remove
		mills = System.currentTimeMillis();
		al.remove(1E5);
		System.out.println("Deletion Arraylist takes" + (System.currentTimeMillis() - mills) + "Millis");
		mills = System.currentTimeMillis();
		ll.remove(1E5);
		System.out.println("Deletion Linkedlist takes" + (System.currentTimeMillis() - mills) + "Millis");
		// Search
		mills = System.currentTimeMillis();
		al.get((int) n / 2);
		System.out.println("Search Arraylist takes" + (System.currentTimeMillis() - mills) + "Millis");
		mills = System.currentTimeMillis();
		ll.get((int) n / 2);
		System.out.println("Search Linkedlist takes" + (System.currentTimeMillis() - mills) + "Millis");
	}

}
