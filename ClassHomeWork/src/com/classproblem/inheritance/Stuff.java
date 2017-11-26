package com.classproblem.inheritance;

public class Stuff extends Employee{
	public Stuff(String id,String name,double salary,int workingHour){
		super(id,name,salary,workingHour);
	}
	public void display(){
		System.out.println("Stuff Id:"+super.getId());
		System.out.println("Stuff Name:"+super.getName());
		System.out.println("Stuff Salary:"+super.getSalary());
		System.out.println("Stuff WorkingHour:"+super.getWorkingHour());
	}

}
