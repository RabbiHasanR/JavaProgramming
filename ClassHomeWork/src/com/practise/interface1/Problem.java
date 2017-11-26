package com.practise.interface1;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m = new Main2();
		
		
		
		
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a<b&&b<c){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else if(b<a&&a<c){
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		else if(c<a&&a<b){
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		else if(c<b&&b<a){
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		else if(b<c&&c<a){
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		else{
			System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}

	}

}
