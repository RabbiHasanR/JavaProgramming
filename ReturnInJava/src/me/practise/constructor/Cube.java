package me.practise.constructor;

public class Cube {
	int height;
	int bredth;
	int length;
	
	/*public int getResult(){
	 return(height*bredth*length);
	}*/
	public Cube(){
		height=10;
		bredth=20;
		length=30;
		System.out.println("first constructor"+height*bredth*length);
		//System.out.println("hi saikat");
		
		
	}
	public Cube(int height){
		this();
		System.out.println("Second constructor"+height);
	}
	public Cube(int height,int bredth){
		this(bredth);
		System.out.println("third constructor"+height*bredth);
	}
	public Cube(int height,int bredth,int length){
		this(bredth,length);
		this.height=height;
		this.bredth=bredth;
		this.length=length;
		System.out.println("Forth constructor"+height*bredth*length);
		//System.out.println("hi shovo");
		
	}
	
	

}
