import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;
public class sqliteConnection {
 static 	Connection  conn=null;
	public static Connection dbconnector(){
		try{
			Class.forName("org.sqlite.JDBC");
		     conn=DriverManager.getConnection("jdbc:sqlite:C:\\JavaGUI\\employee.sqlite");
			JOptionPane.showMessageDialog(null,"Connection is succsesfull");
			return conn;
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}
		
	}
	public static String[] getName(){
		String [] name= new String[10];
		int i =0; 
		String query= "select Name from Employee_info "; 
		   PreparedStatement pstmt;
		try {
			pstmt = sqliteConnection.dbconnector().prepareStatement(query);
			ResultSet rs  = pstmt.executeQuery(); 
			
			   while(rs.next()){
				   name[i] = rs.getString(1);
				   i++;
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name ;   
	}
	 

}
