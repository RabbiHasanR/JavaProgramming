package com.project.Mess;
//import java.io.FileWriter;
import java.util.Scanner;
//import java.io.*;


public class Main {

	public static void main(String[] args) {
		System.out.println("1.Add Information");
		System.out.println("2.Account");
		System.out.println("3.Exit");
		System.out.println("Enter Option");
		Scanner input=new Scanner(System.in);
		MessAccount m = new MessAccount();
		//m.show();
		int option=input.nextInt();
		switch(option){
		case 1:
			String membar_name[]=new String[5];
			String member_address[]=new String[20];
		    String phone_number[]=new String[20];
			int age[]=new int[20];
			Person first=new Person();
			first.memberInformation(membar_name, member_address, phone_number, age);
			
			first.displayInformation();
			break;
		case 2:
			double F=0;
			double E=0;
			double C = 0;
			double Cu = 0;
			double O = 0;
			MessAccount second=new MessAccount(F,E,C,Cu,O);
			second.inputBill();
			second.showEveryBill();
			System.out.println("Payment Value For Every Mess Member: "+second.PaymentCalculationForEveryMember());
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Option");
		}
		
		
		
		
		
		
		

	}

}
