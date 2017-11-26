package com.hashset.practise;

import java.util.HashSet;
import java.util.Iterator;

public class MyClass {
	public void display() {
		HashSet<String> name = new HashSet<String>();
		name.add("Rabbi");
		name.add("Rajon");
		name.add("Nayem");
		Iterator<String> itr = name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
