package com.staticKeyword.practise;

public class Main {

	public static void main(String[] args) {
		StaticDeclaration.setTestValue(5);
		 
		// non-private static variables can be accessed with class name
        StaticDeclaration.testString = "\nAssigning testString a value";
		StaticDeclaration csd = new StaticDeclaration();
		System.out.println(StaticDeclaration.getTestString());
 
		// class and instance static variables are same
		System.out.print("\nCheck if Class and Instance Static Variables are same:  ");
		System.out.println(StaticDeclaration.testString == csd.testString);
		System.out.println("Why? Because: CrunchifyStaticDeclaration.testString == csd.testString");
	}



	}


