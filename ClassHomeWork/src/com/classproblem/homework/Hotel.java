package com.classproblem.homework;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeluxRoom dr=new DeluxRoom("1001-A",5000.00,"Rabbi Hasan","Dhaka");
		StandardRoom sr=new StandardRoom("2001-A",2500,"Nayeem","Chitagong");
		Scanner input=new Scanner(System.in);
		System.out.println("Which Room are you need?Enter Choice(DeluxRoom/StandardRoom):");
		String choice=input.nextLine();
		if(choice.equalsIgnoreCase("DeluxRoom")){
			dr.rentDeluxRoom();
			dr.showAllInfo();
		}
		else if(choice.equalsIgnoreCase("StandardRoom")){
			sr.rentStandardRoom();
			sr.showAllInfo();
		}
		else{
			System.out.println("There is no Room");
		}

	}

}
