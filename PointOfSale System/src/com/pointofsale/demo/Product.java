package com.pointofsale.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Product {
	Connection connection = SqlConnection.getConnection();

	public void addProductInformation(String productId, String productName, String buyingCost, String sellingCost,
			String totalNumberOfProduct, String catagory, String size) {
		try {
			String query = "insert into Product(productId,productName,buyingCost,sellingCost,totalNumberOfProduct,catagory,size)values(?,?,?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, productId);
			pst.setString(2, productName);
			pst.setString(3, buyingCost);
			pst.setString(4, sellingCost);
			pst.setString(5, totalNumberOfProduct);
			pst.setString(6, catagory);
			pst.setString(7, size);
			pst.execute();
			JOptionPane.showMessageDialog(null, "Data save");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter data");
		}
	}

}
