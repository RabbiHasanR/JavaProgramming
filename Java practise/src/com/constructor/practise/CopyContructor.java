package com.constructor.practise;

public class CopyContructor {
	public int id;
	public String name;
	public CopyContructor(int i,String s){
		id=i;
		name=s;
		
	}
	/*public CopyContructor(CopyContructor s){
		id=s.id;
		name=s.name;
	}*/
	public CopyContructor(){}
	public void display(){
		System.out.println(id+" "+name);
	}
	

}
