package com.cutomer.bank;
import java.util.Scanner;

public class Customer {
	String name;
	String mobile;
	String address;
	double amount;
	double saveAmount=0;
	String password;
	String savePassword;
	static int accountNumberForAccount=100;
	 int saveAccountNumberForAccount;
	/*static int accountNumberForCurrentAccount=200;
	int saveAccountNumberForCurrentAccount;*/
	String choice;
	public Customer(){
		accountNumberForAccount++;
		//accountNumberForCurrentAccount++;
	}
	
	public void mainMenu(){
		Scanner input=new Scanner(System.in);
		try{
		System.out.println("Create Account");
		System.out.println("Sign Up With Your Account");
		System.out.println("Enter Your Choice");
		 choice=input.nextLine();
		if(choice.equals("Create Account")){
			createAccountMenu();
		}
		else if(choice.equals("Sign Up")){
			signUp();
		}
		else{
			System.out.println("Sorry!\nTry Again");
			mainMenu();
		}
		}
		catch(Exception e){
			System.out.println("Enter Valid Input");
			mainMenu();
		}
	}
	public void createAccountMenu(){
		Scanner input=new Scanner(System.in);
		try{
		System.out.println("Saving Account");
		System.out.println("Current Account");
		System.out.println("Main Menu");
		System.out.println("Enter your Choice");
		 choice=input.nextLine();
		if(choice.equals("Saving Account")){
			savingAccount();
		}
		else if(choice.equals("Current Account")){
			currentAccount();
		}
		else if(choice.equals("Main Menu")){
			mainMenu();
		}
		else{
			System.out.println("Sorry!\nTry Again");
			createAccountMenu();
		}
		}
		catch(Exception e){
			System.out.println("Enter Valid Input");
			createAccountMenu();
		}
	}
	public void savingAccount(){
		Scanner input=new Scanner(System.in);
		try{
		System.out.println("Enter Your Name");
		name=input.nextLine();
		System.out.println("Enter Your Mobile");
		mobile=input.nextLine();
		System.out.println("Enter Your Address");
		address=input.nextLine();
		System.out.println("Enter Your Password");
		password=input.nextLine();
		System.out.println("Give Money(Getar Then or Equal 1000$)");
		amount=input.nextDouble();
		if(amount>=1000){
			System.out.println("Congratulation.\nYou Create Your Saving Account successfuly.");
			System.out.println("Your Account Number is: "+accountNumberForAccount);
			//signUp();
			mainMenu();
		}
		else{
			System.out.println("Sorry!Try Again");
			savingAccount();
		}
		}
		catch(Exception e){
			System.out.println("Enter Valid Input");
			savingAccount();
		}
	}
	public void currentAccount(){
		Scanner input=new Scanner(System.in);
		try{
		System.out.println("Enter Your Name");
		name=input.nextLine();
		System.out.println("Enter Your Mobile");
		mobile=input.nextLine();
		System.out.println("Enter Your Address");
		address=input.nextLine();
		System.out.println("Enter Your Password");
		password=input.nextLine();
		System.out.println("Give Money");
		amount=input.nextDouble();
		System.out.println("Congratulation.\nYou Create Your Current Account successfuly.");
		System.out.println("Your Account Number is: "+accountNumberForAccount);
		//signUp();
		mainMenu();
		}
		catch(Exception e){
			System.out.println("Enter Valid Input");
			currentAccount();
		}
	}
	public void saveInformation(){
		saveAmount=+amount;
		String save=password;
		savePassword=new String(save);
		saveAccountNumberForAccount=accountNumberForAccount;
		//saveAccountNumberForCurrentAccount=accountNumberForCurrentAccount;
	}
	public void signUp(){
		saveInformation();
		Scanner input=new Scanner(System.in);
		try{
		System.out.println("Sign Up With Your Account");
		System.out.println("Enter Your Account Number");
		int takeAccountNumber=input.nextInt();
		System.out.println("Enter Your Password");
		String takePassword=input.next();
		if(saveAccountNumberForAccount==takeAccountNumber &&takePassword.equals(savePassword)){
			accountMainMenu();
		}
		else{
			System.out.println("Wrong ID Or Password !\nTry Again");
			signUp();
		}
		}
		catch(Exception e){
			System.out.println("Enter Valid Input");
			signUp();
		}
	}
	public void accountMainMenu(){
		Scanner input=new Scanner(System.in);
		try{
		System.out.println("Balance Show");
		System.out.println("Money Withdraw");
		System.out.println("Deposit");
		System.out.println("Main Menu");
		System.out.println("Enter Your Choice");
		 choice=input.nextLine();
		if(choice.equals("Balance Show")){
			balanceShow();
			
		}
		else if(choice.equals("Money Withdraw")){
			moneyWithdraw();
			
		}
		else if(choice.equals("Deposit")){
			deposit();
		}
		else if(choice.equals("Main Menu")){
			mainMenu();
		}
		else{
			System.out.println("Sorry !\nTry Again With Correct Word");
			accountMainMenu();
		}
		}
		catch(Exception e){
			System.out.println("Enter Valid Input");
			accountMainMenu();
		}
	}
	
    public void moneyWithdraw(){
    	//saveInformation();
    	Scanner input=new Scanner(System.in);
    	try{
    	System.out.println("Withdraw Amount:");
    	double takeWithdarwMoney=input.nextDouble();
    	if(takeWithdarwMoney<saveAmount){
    		saveAmount=saveAmount-takeWithdarwMoney;
    		System.out.println("Successfully Withdraw!");
    		System.out.println("Ok");
    		accountMainMenu();
    	}
    	else{
    		System.out.println("Insufficient Amount!\nTry Again");
    		moneyWithdraw();
    	}
    	}
    	catch(Exception e){
			System.out.println("Enter Valid Input");
			moneyWithdraw();
		}
		
	}
    public void deposit(){
    	//saveInformation();
    	Scanner input=new Scanner(System.in);
    	try{
    	System.out.println("Deposit Amount:");
    	double takeDepositMoney=input.nextDouble();
    	saveAmount=saveAmount+takeDepositMoney;
    	System.out.println("successfully Deposite !\nOk");
    	accountMainMenu();
    	}
    	catch(Exception e){
			System.out.println("Enter Valid Input");
			 deposit();
		}
    }
    public void balanceShow(){
		//saveInformation();
		System.out.println("Balance Show");
		System.out.println("Your Current Balance is: "+saveAmount);
		System.out.println("Ok");
		accountMainMenu();
		
		
	}

}
