package me.java.farjanaSadia;

public class Person {
	String name;
	int weight;
	int height;
	int birthDate;
	
	
	Person(String name,int weight,int height,int birthDate){
		this.name=name;
		this.weight=weight;
		this.height=height;
		this.birthDate=birthDate;
	}
	int age(){
		return (2016-birthDate);
	}
	void information(){
		System.out.println("Name:"+name);
		System.out.println("Height:"+height);
		System.out.println("Weight:"+weight);
		System.out.println("Birthdate:"+birthDate);

		
	}

}
