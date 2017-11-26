package com.pointOfSale.pos;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DatabaseConnection {
	Connection con = null;

	public static Connection getConnection() {
		try {

			String conUrl = "jdbc:sqlserver://Rabbihasan\\SQLEXPRESS:1433; databaseName=PosSystem; user=sa; password=Rabbihasan1995;";
			Connection con = DriverManager.getConnection(conUrl);
			JOptionPane.showMessageDialog(null, "Connection succsesfull");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				String conUrl = "jdbc:sqlserver://Rabbihasan\\SQLEXPRESS:1433; databaseName=PosSystem; user=sa; password=Rabbihasan1995;";

				Connection con = DriverManager.getConnection(conUrl);
				if (con != null) {
					try {
						con.close();
					} catch (Exception e) {
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);

			}
		}

	}

}
