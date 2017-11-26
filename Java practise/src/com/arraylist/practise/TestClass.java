package com.arraylist.practise;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		// create instance of class
		Student s1 = new Student(121, "Rabbi", 22);
		Student s2 = new Student(122, "Nayem", 23);
		Student s3 = new Student(123, "Riaz", 23);
		// create arraylist instance/object
		ArrayList<Student> list = new ArrayList<Student>();
		// add value
		list.add(s1);
		list.add(s2);
		list.add(s3);
		// print array value
		for (Student s : list) {
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}

	}

}
