package me.practise.stat;

public class Student {
	String name;
	int age;
	static int NoOfStudent=0;
	static class X{
		static String str="rabbi";
	}
	Student(){
		NoOfStudent++;
	}
	public static int getNoOfStudent(){
		return NoOfStudent;
	}
	public String getNmae(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
		

}
