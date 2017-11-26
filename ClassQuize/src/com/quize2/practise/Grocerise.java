package com.quize2.practise;

public class Grocerise extends Products{
	public Grocerise(String productId,String productName,int productStock,double productPrice){
		super(productId,productName,productStock,productPrice);
	}
	
	public void buyGrocerise(Customer c){
		if(c.getCusotmerWantProduct()<=super.getProductStock()){
			System.out.println("Product is avilable");
			System.out.println("Product Id:"+super.getProductId());
			System.out.println("Product Name:"+super.getProductName());
			System.out.println("Product Name:"+super.getProductPrice());
			System.out.println("Customer Id:"+c.getCustomerId());
			System.out.println("Customer Name:"+c.getCustomerName());
		}
		else{
			System.out.println("Product is not avilable");
		}
	}

}
