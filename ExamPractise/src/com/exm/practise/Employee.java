package com.exm.practise;

public class Employee {
	
	double salry;
	String employeeId;
	String name;
	String position;
	
	Employee(String e,String n){
		employeeId=e;
		name=n;
		
	}
	
	double consider(String position){
		if(position.equals("Project Manager")){
			
		return salry=50000.00;
		}
		else if(position.equals("Project Manager")){
			return (salry=30000.00);
		}
		else
			return (salry=00.00);
	}
	
	void display(){
		System.out.println("Employee ID is: "+employeeId);
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee Salary is: "+salry);
	}

}
