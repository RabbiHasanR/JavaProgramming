package com.quize2.practise;

public class Products {
	private String productId;
	private String productName;
	private int productStock;
	private double productPrice;
	public  Products(String productId,String productName,int productStock,double productPrice){
		this.productId=productId;
		this.productName=productName;
		this.productStock=productStock;
		this.productPrice=productPrice;
	}
	public String getProductId(){
		return productId;
	}
	public String getProductName(){
		return productName;
	}
	public int getProductStock(){
		return productStock;
	}
	public double getProductPrice(){
		return productPrice;
	}

}
