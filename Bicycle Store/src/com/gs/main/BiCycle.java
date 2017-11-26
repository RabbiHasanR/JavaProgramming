package com.gs.main;

public class BiCycle {
	String brand;
	String model;
	double price;
	double current_speed;
	
	BiCycle(String brand,String model,double price,double current_speed){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.current_speed=current_speed;
	}
	
	double speedUp(double current_speed){
		current_speed++;
		return current_speed;
	}
	double speedDown(double down){
		down-=current_speed;
		return down;
	}
	void showInfo(){
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(current_speed);
	}
	
}