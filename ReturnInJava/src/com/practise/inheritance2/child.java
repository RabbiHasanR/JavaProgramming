package com.practise.inheritance2;

public class child extends Super{
	String name;
	public child(String n1,String n2){
		super(n1);
		this.name=n2;
	}
	void details(){
		super.show();
		
		System.out.print(super.name+" "+name);
	}

}
