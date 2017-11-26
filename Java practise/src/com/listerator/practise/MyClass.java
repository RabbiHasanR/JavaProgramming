package com.listerator.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyClass {

	public void display() {
		List<String> al = new ArrayList<String>();
		al.add("Rabbi");
		al.add("Rony");
		al.add("Nayem");
		ListIterator<String> itr = al.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println(" ................................");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
