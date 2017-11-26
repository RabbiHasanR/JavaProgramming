package com.staticKeyword.practise;

public class Student {
	int id;
	String name;
	static String college="DIU";
	static void change(){
		college="DU";
	}
	
	Student(int i,String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println(id+" "+name+" "+college);
	}
	

}
