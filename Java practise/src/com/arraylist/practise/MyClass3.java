package com.arraylist.practise;

import java.util.ArrayList;

public class MyClass3 {
	// declear first arraylist
	ArrayList<String> al = new ArrayList<String>();
	// declear second arraylist
	ArrayList<String> al2 = new ArrayList<String>();

	// add arraylist value
	public void displayArrylist() {
		al.add("Rabbi");
		al.add("Riaz");
		al.add("Rumman");
		al2.add("Shourav");
		al2.add("Rajon");
		al2.add("Ront");
		al.addAll(al2); // add all aryylist value
		// al.removeAll(al); //remove all arrylist value
		// al.removeAll(al2);//remove only al2 arraylist value
		// al.retainAll(al);//remove only al2 arraylist value/index
		// al.retainAll(al2);//remove all index/value
		// print all array
		// for (String a : al) {
		System.out.println(al);
		// }
	}

}
