package com.puspo.project;
import java.util.Scanner;

public class Bank {
	
	    void mainMenu(){
	        Scanner sc=new Scanner (System.in);
	        System.out.println("create account");
	        System.out.println("sign up with your account");
	        System.out.println("your option plz");
	        String a=sc.nextLine();
	        if(a.equals("create account"))
	        {
	            createAccountMenu();
	        }
	    }
	        void createAccountMenu(){
	        Scanner in=new Scanner (System.in);
	        System.out.println("saving account");
	        System.out.println("current account");
	        String b=in.nextLine();
	        if(b.equals("saving account"))
	        {
	            savingAccount();
	        }
	        else if(b.equals("current account")){
                
                currentAccount();}
}
	        
	        void savingAccount(){
	            Scanner p=new Scanner (System.in);
	            System.out.println("enter your name");
	            String c=p.nextLine();
	            System.out.println("enter your mobile no.");
	            String d=p.nextLine();
	            System.out.println("enter your address");
	            String e=p.nextLine();
	            System.out.println("confirm your amount ");
	            int amount=p.nextInt();
	            if(amount>1000)
	            {
	                System.out.println("congratulation!your account is open now");
	                 System.out.println("your account id is:234283");
	            }
     
	            else
	            System.out.println("sorry!insufficient fund");
	        
	    
	    
	
}
	                
	        void currentAccount(){
	            Scanner p=new Scanner (System.in);
	            System.out.println("enter your name");
	            String c=p.nextLine();
	            System.out.println("enter your mobile no.");
	            String d=p.nextLine();
	            System.out.println("enter your address");
	            String e=p.nextLine();
	            System.out.println("confirm your amount ");
	            int amount=p.nextInt();
	            if(amount>1000)
	            {
	                System.out.println("congratulation!your account is open now");
	                 System.out.println("your account id is:465677");
	            }
	            else
	            System.out.println("sorry!insufficient fund");
	        }
	        
	    /*else
	    { System.out.println("sign up with your account");
	    mainmanu();}*/
	    int d;
		int f;
		void mainmanu(){
			Scanner sc=new Scanner(System.in);
			System.out.println("create account");
			System.out.println("sign up");
			System.out.println("Enter account number");
			int a=sc.nextInt();
			System.out.println("Enter password");
			int p=sc.nextInt();
			if(p==1234){
				showaccount();
			
				}
				else{
					System.out.println("Wrong id or password");
					mainmanu();
				}
			}
		void showaccount(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Balance show");
			System.out.println("Money withdraw");
			System.out.println("Deposit");
	System.out.println("Choice your option");
			String x=sc.nextLine();
			

			if(x.equals("Balance show")){
				showbalance();
			}
			else if(x.equals("Money withdraw")) {
				showwithdrawbalance();
			}
			else {
				showdeposit();
			}
			
		}
		void showbalance(){
			
			System.out.println("Your current balance is =34324");
			System.out.println("ok");
			showaccount();
			}
			void showdeposit(){
				
				
				System.out.println("Deposit balance=343453");
				depositCalculate();
			}
			void depositCalculate(){
				d=(34324+343453);
				System.out.println("Successful Deposit!And your current balance is="+d);
				System.out.println("Ok");
			}
			void showwithdrawbalance(){
				System.out.println("Withdraw amount=4000");
				withdrawCalculate();
			}
			void withdrawCalculate(){
				f=(34324-4000);
				if(f<=30000){
					System.out.println("Sorry!Insufficienr amount try Again");
					
				}
				else{
					System.out.println("Successfully withdraw balance!And current balance is="+f);
					System.out.println("Ok");
				}
			}
		
		  
			} 
	
	




