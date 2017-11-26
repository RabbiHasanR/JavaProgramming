package methods;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//myfirstmethods();
		/*sayhello("Tome");
		sayhello("saykat");
		sayhello("Tohin");
		sayhello("Mahfus");*/
        /*add(647.339,273.278,1);
        add(4673.367,378.783,56);
        add(100,200,300);
        add(231,6,6);*/
		/*double[] a;
		int j;
		a=new double[3];
		double sum=add(double a[j]));*/
		int sum=add(10,20,30);
		int result=sum*2;
		System.out.println(result);
		

	}
	/*public static void myfirstmethods(){
		System.out.println("hello world");
	}*/
	/*public static void sayhello(String name){
		System.out.println("Hello"+name);
	}
	public static double add(double a ){
		//System.out.println(a+b+c);
		a=new double[3];
		 //result=0;
		System.out.println("Enter number:");
		for(int index=0;index<4;index++){
			Scanner input=new Scanner(System.in);
			a[index]=input.nextInt();
			return(a[index]);
			
		}
		
		
	}*/
	public static int add(int a,int b,int c){
		return(a+b+c);
	}

}
