package com.gs.main;

public class MainClass {

	public static void main(String[] args) {
		BiCycle b=new BiCycle("Phoenix","Phoenix EUR 770",15200.00,21);
		b.showInfo();
		b.speedUp(5.00);
		b.showInfo();
		b.speedDown(3.00);
		b.showInfo();

	}

}
