package com.javagui.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DbConnector {
	static Connection conn = null;

	public static Connection dbConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:F:\\mess_management\\mess_management.sqlite");
			JOptionPane.showMessageDialog(null, "Connection is succsesfull");
			return conn;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

}
