package com.borna.project;
import java.util.Scanner;
import java.util.Scanner;
class Bank
{
    String name;
    String cname;
    int age;
    int cage;
    String gender;
    String cgender;
    String city;
    String ccity;
    int accountNumber;
    int salary;
    int loan;
    int deposit;
    int balance;
    int wBalance;
    Bank(String n,int a,String g,String c,int s)
    {
        name=n;
        age=a;
        gender=g;
        city=c;
        salary=s;
    }
    int salaryCalculation()
    {
        return salary*12;
    }
    void printEmployeeInformation()
    {
        System.out.println("Name:"+"    "+name);
        System.out.println("Age:"+"   "+age);
        System.out.println("Gender:"+"  "+gender);
        System.out.println("City:"+"    "+ city);
    }
    Bank(String na,String ge,int ag,String c,int ac,int b,int d,int l,int w)
    {
        cname=na;
        cage=ag;
        cgender=ge;
        city=c;
        accountNumber=ac;
        deposit=d;
        balance=b;
        loan=l;
        wBalance=w;
    }
    void printCustomerInformation()
    {
        System.out.println("Name:"+"    "+cname);
        System.out.println("Age:"+"    "+cage);
        System.out.println("Gender:"+"    "+cgender);
        System.out.println("City:"+"    "+ccity);
        System.out.println("Account Number:"+"    "+accountNumber);
    }
     void customerLoan()
     {
         System.out.println(loan);
     }
     
     double calculateInterest()
     {
        double interest=(loan*10)/100; 
        return interest;
     }
    double Payment()
    {
     
     double interest=(loan*10)/100; 
     double payment=((loan/12)+interest);
     return payment;
        
    }
    int balance()
    {
        return balance;
    }
    int depositBalance()
    {
        return deposit;
    }
    double currentBalance()
    {
        double currentBalance=balance+deposit;
        return currentBalance;
    }
     int withdrowBalance()
    {
      return wBalance; 
    }
    
    double accountBalance()
    {
        double accountbalance=balance+deposit-wBalance;
        return accountbalance;
    }
   
    
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
	       System.out.println("Enter the employee name:");
	       String n=input.nextLine();
	       System.out.println("Enter the employee age:");
	        int a=input.nextInt();
	        System.out.println("Enter the employee gender:");
	         String g=input.nextLine();
	         System.out.println("Enter the employee city:");
	          String c=input.nextLine();
	          System.out.println("Enter the employee salary:");
	           int s=input.nextInt();
	        Bank employee=new Bank(n,a,g,c,s);
	        System.out.println("       Bank Management System    ");
	        System.out.println("   ......Employee information:......   ");
	        employee.printEmployeeInformation();
	        System.out.println("salary is:"+employee.salaryCalculation());
	       Scanner input1=new Scanner(System.in);
	        
	        System.out.println("Enter the custome name:");
	        String na=input1.nextLine();
	        System.out.println("Enter the customer gender:");
	         String ge=input1.nextLine();
	        System.out.println("Enter the customer age:");
	        int ag=input1.nextInt();
	         System.out.println("Enter the customer city:");
	          String ci=input1.nextLine();
	          System.out.println("Enter the customer account number:");
	           int ac=input1.nextInt();
	           System.out.println("Enter the customer balance:");
	           int b=input1.nextInt();
	           System.out.println("Enter the customer deposit:");
	           int d=input1.nextInt();
	           System.out.println("Enter the customer loan:");
	           int l=input1.nextInt();
	           System.out.println("Enter the customer withdraw balance:"); 
	           int w=input1.nextInt();
	           
	        Bank customer=new Bank(na,ge,ag,ci,ac,b,d,l,w);
	        System.out.println("  ......Customer information......   ");
	        customer.printCustomerInformation();
	        System.out.println("Customer loan is:");
	        customer.customerLoan();
	        System.out.println("Interest is :   10%");
	        System.out.println("Interest against loan:");
	        System.out.println(customer.calculateInterest());
	        System.out.println("Customer Monthly Payment:");
	        System.out.println(customer.Payment());
	        System.out.println("Customer Balance is:");
	        System.out.println(customer.balance());
	        System.out.println("Customer Deposit Balance is:");
	        System.out.println(customer.depositBalance());
	        System.out.println("Customer Current Balance is:");
	        System.out.println(customer.currentBalance());
	        System.out.println("Customer Withdraw Balance is:");
	        System.out.println(customer.withdrowBalance());
	        System.out.println("Customer Account Balance:");
	        System.out.println(customer.accountBalance());
	          

	}

}


