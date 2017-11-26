package com.classproblem.inheritance;

public class Student extends Person{
	public Student(String id,String name){
		super(id,name);
	}
	public void display(){
		System.out.println("Student Id:"+super.getId());
		System.out.println("Student Name:"+super.getName());
	}

}
