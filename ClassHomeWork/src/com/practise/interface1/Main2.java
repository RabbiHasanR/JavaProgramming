package com.practise.interface1;

import java.util.Scanner;

public class Main2 {
public Main2() {
	// TODO Auto-generated constructor stub\\
	
int a = Math.abs(-5);

System.out.println(a);
System.out.println("Cosine Result of 0.90 "+Math.acos(.90));
System.out.println(Math.addExact(20, 30));
System.out.println(Math.decrementExact(3));


int b = (int) (Math.random()*10);
int c=(int) (Math.random()*10);
System.out.println(b);
System.out.println(c);
Scanner input=new Scanner(System.in);
int x=input.nextInt();

int d=b+c;
if(x==d){
System.out.println("equal");
}
else
	System.out.println("not equal");
	

}

}
