package com.project.Mess;
import java.util.Scanner;


public class Person {
	String []membar_name=new String[20];
	String []member_address=new String[20];
	String []phone_number=new String[20];
	int []age=new int[20];
	int i=0;
	public int count=0;
	int n=0; 
	
	/*Person(String []membar_name,String []member_address,String []phone_number,int []age){
		
		
	}*/
	Scanner input=new Scanner(System.in);

	
	
	void memberInformation(String []membar_name,String []member_address,String []phone_number,int []age){
		this.membar_name=membar_name;
		this.member_address=member_address;
		this.phone_number=phone_number;
		this.age=age;
		
		
		for(;;){
		
			System.out.println("Enter mamber name:");
			membar_name[i]=input.next();
			System.out.println("Enter mamber Address:");
			member_address[i]=input.next();
			System.out.println("Enter mamber phone number:");
			phone_number[i]=input.next();
			System.out.println("Enter mamber age:");
			age[i]=input.nextInt();
			i++;
			count++;
			
			
			try{
				System.out.println("add information press any key or stope press 88");
				n=input.nextInt();
				if(n==88){
					break;	
				}
			}
			catch(Exception e){
				
			}	
		}
		
	}
	void displayInformation(){
		for(i=0;i<count;i++){
			System.out.println("Enter mamber name: "+membar_name[i]);
			System.out.println("Enter mamber Address: "+member_address[i]);
			System.out.println("Enter mamber phone number: "+phone_number[i]);
			System.out.println("Enter mamber age: "+age[i]);
			
		}
	}
	

}
