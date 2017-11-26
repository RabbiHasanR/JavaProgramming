package com.method.practise;

public class ConstructorAndMathod {
	int height;
	ConstructorAndMathod(){
		System.out.println("bricks");
		height=0;
	}
	ConstructorAndMathod(int i){
		System.out.println("Bullding new house that is"+i+"feet fall");
		height=i;
	}
	void info(){
		System.out.println("house is"+height+"feet fall");
	}
	void info(String s){
		System.out.println(s+"house is"+height+"feet fall");
		
	}

}
