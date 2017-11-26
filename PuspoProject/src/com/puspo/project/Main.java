package com.puspo.project;
import java.util.Scanner;

import javax.swing.JOptionPane;
class Student{
    String name;
    String city;
    String gender;
    String id;
    String dept;
    int birthYear;
    
    String result;
    String waiver;
/*Student(String n,String a,String g,String i,String d,int b)
{
    name=n;
    city=a;
    gender=g;
    id=i;
    dept=d;
    birthYear=b;
    
}
*/
Scanner input=new Scanner(System.in);
void input(){
	try{
	
	System.out.println("Pease Enter Your Name:");
	 name=input.nextLine();
	System.out.println("Pease Enter Your City:");
    city=input.nextLine();
	System.out.println("Pease Enter Your Gender:");
	 gender=input.nextLine();
	System.out.println("Pease Enter Your ID:");
	 id=input.nextLine();
	System.out.println("Pease Enter Your Department:");
	 dept=input.nextLine();
	System.out.println("Pease Enter Your BirthYear:");
	 birthYear=input.nextInt();
	}
	catch(Exception e){
		JOptionPane.showMessageDialog(null,e);
	}
}
void information(){
    System.out.println(name+" "+city+" "+gender+" "+id+" "+dept+" "+birthYear);
}

int studentAge(){
    return (2016-birthYear);
}
 int cost(int credit){
     int b=12;
     return(credit*b);
 }
 
 void setValue(int java_number,int algorithm_number,int database_number){
	 int total=java_number+algorithm_number+database_number;
	 int marks=total/3;
     if(marks>=80){
    	 result="A+";
    	 System.out.println("Result:"+" "+result);}
      
     else if(marks>=60){
       result="B+";
       System.out.println("Result:"+" "+result);}
     else{
       result="C+";
       System.out.println("Result:"+" "+result);}
 }

 
 void waver(){
     if(result.equals("A+"))
    	 System.out.println(" Twenty Parcent");
    
     else if(result.equals("B+"))
    	 System.out.println(" 30 Parcent");
     else
    	 System.out.println(" Zero Parcent");
 }
}

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		  /*String n;
		    String c;
		    String g;;
		    String i;
		    String d;
		    int y;*/
		    
		    //String result;
		    //String waiver;
	     
		
		Student box=new Student();
		box.input();
	    box.information();
	    System.out.println(" Age:"+" "+ box.studentAge());
	    System.out.println( "Total Coast:"+" "+box.cost(3500));
	    System.out.println("Please Enter Your Course Number:");
	        int j=input.nextInt();
	        int db=input.nextInt();
	        int a=input.nextInt();
	        box.setValue(j,db,a);
	        box.waver();
	        
	        

	}

}




