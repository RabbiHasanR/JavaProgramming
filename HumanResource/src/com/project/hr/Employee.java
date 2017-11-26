package com.project.hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Employee {
	protected String employeeName;
	protected String employeeAddress;
	protected String employeePhone;
	protected String employeeEmail;
	protected String employeeSex;
	protected String employeePassword;
	// protected String employeeDateOfBirth;
	Connection connection = DatabaseConnection.getConnection();

	Employee(String employeeName, String employeeAddress, String employeePhone, String employeeEmail,
			String employeeSex, String employeePassword) {
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.employeeEmail = employeeEmail;
		this.employeeSex = employeeSex;
		this.employeePassword = employeePassword;
		// this.employeeDateOfBirth = employeeDateOfBirth;

	}

	public void addInformarion() {
		try {
			String query = "Insert into Employee(EPassword,EName,EAddress,EPhone,EEmail,ESex) values(?,?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(query);

			pst.setString(1, employeePassword);
			pst.setString(2, employeeName);
			pst.setString(3, employeeAddress);
			pst.setString(4, employeePhone);
			pst.setString(5, employeeEmail);
			pst.setString(6, employeeSex);

			int value = pst.executeUpdate();
			if (value == 1) {
				JOptionPane.showMessageDialog(null, "Data Save");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public void updteInformation(){ try { String qurey =
	 * "update  Employee set EName,EAddress,EPhone,EEmail,ESex,EDateOfBirth where EId=?'"
	 * ; PreparedStatement pst = connection.prepareStatement(qurey);
	 * pst.execute(); JOptionPane.showMessageDialog(null, "Data Update"); }
	 * catch (Exception g) { JOptionPane.showMessageDialog(null, g); }
	 * 
	 * }
	 */
	public void deleteInformation(String EID) {
		String query = "delete from Employee where EId= ? ";

		try {
			PreparedStatement psmt = connection.prepareStatement(query);
			psmt.setString(1, EID);
			int value = psmt.executeUpdate();
			if (value == 1) {
				JOptionPane.showMessageDialog(null, "Data Delete");
			} else {
				JOptionPane.showMessageDialog(null, "Id Not Match.Try Again");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/*
	 * public void searchInformation(String EId) { try {
	 * 
	 * 
	 * 
	 * } catch (SQLException s) { s.printStackTrace(); } }
	 */
}
