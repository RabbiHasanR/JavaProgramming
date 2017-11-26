package com.practise.composition;

public class Author {
	private String name;
	private String email;
	private String gender;
	
	public Author(String name,String email,String gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public String getGender(){
		return gender;
	}
	
	public void setEmail(String email){
		this.email=email;
		
	}
	
	public String toString(){
		return name+"("+gender+")at"+email;
	}

}
