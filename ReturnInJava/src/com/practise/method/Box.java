package com.practise.method;

public class Box {
	int width;
	int height;
	
	Box(int width,int height){
		this.width=width;
		this.height=height;
	}
	Box(Box b){
		this.width=b.width;
		this.height=b.height;
	}
	static boolean isTwoObject(Box b1,Box b2){
		if(b1.width==b2.width && b1.height==b1.height)
			return true;
		else 
		  return false;
	}
	boolean isEqual(Box b){
		if(this.width==b.width && this.height==b.height)
			return true;
		else
			return false;
	}
	void display(){
		System.out.println("width is"+this.width+"height is"+this.height);
	}
	Box duplicate(){
		Box temp=new Box(this.width,this.height);
		return temp;
	}

}
