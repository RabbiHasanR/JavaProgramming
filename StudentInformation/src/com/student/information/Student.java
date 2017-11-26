package com.student.information;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Student {
	String[] name=new String[5];
	String[] id=new String[5];
	
	Scanner input=new Scanner(System.in);
	
	void inputInformation(){
		
		
		try{
		for(int i=0;i<name.length;i++){
			System.out.println("Enter Name:");
			name[i]=input.nextLine();
			System.out.println("Enter ID:");
			id[i]=input.nextLine();
			
		}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
		}
		
		
	}
	void displayInformation(){
		for(int i=0;i<name.length;i++){
			System.out.println("Student Name:"+name[i]);
			System.out.println("Student ID:"+id[i]);
		}
			
		
	}

}
