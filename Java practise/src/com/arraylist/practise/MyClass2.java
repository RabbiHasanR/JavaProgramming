package com.arraylist.practise;

import java.util.ArrayList;
import java.util.Iterator;

public class MyClass2 {
	// print String value using ArrayList and iterator
	ArrayList<String> list = new ArrayList<String>(5);

	public void showStringArray() {
		list.add("Rabbi");
		list.add("Namyem");
		list.add("Rony");
		list.add("Riaz");
		// create instance of iterator
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
