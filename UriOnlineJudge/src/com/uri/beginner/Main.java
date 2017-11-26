package com.uri.beginner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		int codeOfProduct=input.nextInt();
		int numberOfUnits=input.nextInt();
		float priceOfProduct=input.nextFloat();
		int codeOfProduct2=input.nextInt();
		int numberOfUnits2=input.nextInt();
		float priceOfProduct2=input.nextFloat();
		
		float totalPriceForProduct1=numberOfUnits*priceOfProduct;
		float totalPriceForProduct2=numberOfUnits2*priceOfProduct2;
		float totalPrice=totalPriceForProduct1+totalPriceForProduct2;
		System.out.println("VALOR A PAGAR: R$ "+totalPrice);
		
		
		

	}

}
