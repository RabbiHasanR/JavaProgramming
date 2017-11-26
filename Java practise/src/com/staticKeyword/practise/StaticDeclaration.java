package com.staticKeyword.practise;

public class StaticDeclaration {
	public static String testString;
	private static int testValue;

	static{
		System.out.println("\nI'm static block 1...");
		setTestString("This is a static block string");
		setTestValue(2);
	}
	static{
		System.out.println("\nI'm a static block 2....");
	}
	public static String getTestString() {
		return testString;
	}
	
	public static int getTestValue() {
		return testValue;
	}
	

	public static void setTestString(String testString) {
		StaticDeclaration.testString = testString;
		System.out.println("setTestString method: " + testString);
		
	}

	public static void setTestValue(int testvalue) {
		if (testvalue > 0)
			StaticDeclaration.testValue = testvalue;
		System.out.println("setTestValue method: " + testvalue);
		
	}
	public static int subValue(int i, int... js) {
		int sum = i;
		for (int x : js)
			sum -= x;
		return sum;
	}

}
