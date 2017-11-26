package com.staticKeyword.practise;

public class MyClass {
	static{
		System.out.println("We are SWE engineering student");
	}

	public static void main(String[] args) {
		
		Student stu=new Student(1,"Rabbi");
		Student stu1=new Student(2,"Shovo");
		Student stu2=new Student(3,"Faizul");
		Student.change();
		stu.display();
		stu1.display();
		stu2.display();
		

	}

}
