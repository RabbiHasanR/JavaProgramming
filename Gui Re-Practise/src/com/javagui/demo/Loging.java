package com.javagui.demo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Loging {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loging window = new Loging();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public Loging() {
		initialize();
		connection = DbConnector.dbConnection();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(76, 74, 46, 14);
		frame.getContentPane().add(lblUser);

		textField = new JTextField();
		textField.setBounds(132, 71, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(76, 116, 46, 14);
		frame.getContentPane().add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(132, 113, 86, 20);
		frame.getContentPane().add(passwordField);

		JButton btnLoging = new JButton("Loging");
		btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String quiry = "select * from Employee where Eid=? and Epassword=?";
					PreparedStatement pst = connection.prepareStatement(quiry);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while (rs.next()) {
						count = count + 1;
					}
					if (count == 1) {
						JOptionPane.showMessageDialog(null, "UserName and password is correct");
					} else if (count > 1) {
						JOptionPane.showMessageDialog(null, "UserName and password is duplicate");
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect");
					}
					// rs.close();
					// pst.close();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnLoging.setBounds(104, 172, 89, 23);
		frame.getContentPane().add(btnLoging);

	}
}
