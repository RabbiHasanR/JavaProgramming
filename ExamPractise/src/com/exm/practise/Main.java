package com.exm.practise;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Employee e=new Employee("1","Rabbi");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Employee Position");
		try{
		String position=input.nextLine();
		e.consider(position);
		}
		catch(Exception f){
			JOptionPane.showMessageDialog(null,f);
		}
		
		e.display();

	}

}
