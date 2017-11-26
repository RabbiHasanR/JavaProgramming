package com.pointofsale.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Suplier {
	Connection connection = SqlConnection.getConnection();

	public void addSuplierInfo(String suplierId, String name, String mobile, String email, String companyName) {
		try {
			String query = "insert into Suplier(suplierId,name,mobile,email,companyName)values(?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, suplierId);
			pst.setString(2, name);
			pst.setString(3, mobile);
			pst.setString(4, email);
			pst.setString(5, companyName);
			pst.execute();
			JOptionPane.showMessageDialog(null, "Data save");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter data");

		}

	}

}
