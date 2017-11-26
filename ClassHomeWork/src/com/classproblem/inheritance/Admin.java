package com.classproblem.inheritance;

public class Admin extends Employee{
	public Admin(String id,String name,double salary,int workingHour){
		super(id,name,salary,workingHour);
	}
	public void display(){
		System.out.println("Admin Id:"+super.getId());
		System.out.println("Admin Name:"+super.getName());
		System.out.println("Admin Salary:"+super.getSalary());
		System.out.println("Employee WorkingHour:"+super.getWorkingHour());
	}

}
