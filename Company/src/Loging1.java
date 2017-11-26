import java.awt.EventQueue;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

//import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Resource.secondFrame;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Loging1 {
	Connection connection=null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loging1 window = new Loging1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
//	Connection connection=null;
	private JTextField textField;
	private JPasswordField passwordField_1;
	public Loging1() {
		try {
			initialize();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection=sqliteConnection.dbconnector();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 601, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(348, 41, 68, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(426, 38, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(348, 106, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(426, 103, 86, 20);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Loging");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Image img=new ImageIcon(this.getClass().getResource("/check.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(166, 227, 161, 20);
		frame.getContentPane().add(comboBox);
		
	
		String [] name = sqliteConnection.getName();
		for(int i=0; i<name.length ; i++){
			comboBox.addItem(name[i]);
		}
		
	  
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					String query="select * from Employee_info where Username=? and Password=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,textField.getText());
					pst.setString(2,passwordField_1.getText());
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()){
						count=+1;
					}
					if(count==1){
						JOptionPane.showMessageDialog(null,"Username and Password is correct");
						frame.dispose();
						secondFrame sf=new  secondFrame();
						sf.setVisible(true); 
					}
					else if(count>1){
						JOptionPane.showMessageDialog(null,"Duplicate Username and Password");
					}
					else{
						JOptionPane.showMessageDialog(null,"Username and Password is not correct try again...");
					}
					rs.close();
					pst.close();
				}
				catch(Exception f){
					JOptionPane.showMessageDialog(null, f);
				}
			}
		});
		btnNewButton.setBounds(385, 160, 132, 41);
		frame.getContentPane().add(btnNewButton);
		
		JLabel jlabel2 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		jlabel2.setIcon(new ImageIcon(img1));
		jlabel2.setBounds(31, 51, 178, 196);
		frame.getContentPane().add(jlabel2);
		
		
        
	   
	     
}
}