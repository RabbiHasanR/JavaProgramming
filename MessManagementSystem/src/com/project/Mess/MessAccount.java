package com.project.Mess;
import java.util.Scanner;

public class MessAccount {
	double Flat_rent;
	double Eat_bill;
	double Chef_bill;
	double Current_bill;
	double Others_bill;
	double total_money;
	Person p = new Person(); 
    public MessAccount(){
    	
    }
	MessAccount(double Flat_rent,double Eat_bill,double Chef_bill,double Current_bill,double Others_bill){
		this.Flat_rent=Flat_rent;
		this.Eat_bill=Eat_bill;
		this.Chef_bill=Chef_bill;
		this.Current_bill=Current_bill;
		this.Others_bill=Others_bill;
		
	}
	/*protected void show(){
		System.out.println("Enter Flat Rent:"+p.count);
	}*/
	
	void inputBill(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Flat Rent:");
		Flat_rent=input.nextDouble();
		System.out.println("Enter Eat Bill:");
		Eat_bill=input.nextDouble();
		System.out.println("Enter Chef Bill:");
		Chef_bill=input.nextDouble();
		System.out.println("Enter Current Bill:");
		Current_bill=input.nextDouble();
		System.out.println("Enter Others Bill:");
		Others_bill=input.nextDouble();
	}
	void showEveryBill(){
		System.out.println(" Flat Rent: "+Flat_rent);
		System.out.println(" Eat Bill: "+Eat_bill);
		System.out.println(" Chef Bill: "+Chef_bill);
		System.out.println(" Current Bill: "+Current_bill);
		System.out.println(" Others Bill: "+Others_bill);
	}
	double PaymentCalculationForEveryMember(){
		 total_money=Flat_rent+Eat_bill+Chef_bill+Current_bill+Others_bill;
		double moneyPerPerson=total_money/10;
		return moneyPerPerson;
		
	}

}
