package com.classproblem.inheritance;

public class Employee extends Person{
	private double salary;
	private int workingHour;
	public Employee(String id,String name,double salary,int workingHour){
		super(id,name);
		this.salary=salary;
		this.workingHour=workingHour;
	}
	public double getSalary(){
		return salary;
	}
	public int getWorkingHour(){
		return workingHour;
	}
	public void display(){
		System.out.println("Employee Id:"+super.getId());
		System.out.println("Employee Name:"+super.getName());
		System.out.println("Employee Salary:"+salary);
		System.out.println("Employee WorkingHour:"+workingHour);
	}

}
