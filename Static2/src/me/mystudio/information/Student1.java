package me.mystudio.information;

public class Student1 {
	String name;
	int age;
	
	static int NoOfStudent=0;
	Student1(){
		NoOfStudent++;
		
	}
	public static  int getNoOfStudent(){
		return NoOfStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
