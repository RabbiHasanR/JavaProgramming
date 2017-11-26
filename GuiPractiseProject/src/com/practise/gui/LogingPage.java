package com.practise.gui;

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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LogingPage extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogingPage frame = new LogingPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	// Connection connection = null;

	public LogingPage() {
		// SqlConnection sc=new SqlConnection();
		Connection connection = SqlConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setBounds(87, 55, 53, 14);
		contentPane.add(lblUsername);

		userName = new JTextField();
		userName.setBounds(150, 52, 132, 20);
		contentPane.add(userName);
		userName.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(87, 106, 53, 14);
		contentPane.add(lblPassword);

		password = new JPasswordField();
		password.setBounds(150, 103, 132, 20);
		contentPane.add(password);

		JButton btnLoging = new JButton("Loging");
		btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					String qurey = "select * from member where UserName=? and UserPassword=?";
					PreparedStatement pst = connection.prepareStatement(qurey);
					pst.setString(1, userName.getText());
					pst.setString(2, password.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while (rs.next()) {
						count++;
					}
					if (count == 1) {
						JOptionPane.showMessageDialog(null, "Username and password is correct");
						SecondPage sp = new SecondPage();
						sp.setVisible(true);
					} else if (count > 1) {
						JOptionPane.showMessageDialog(null, "duplicate Username and password");
					} else {
						JOptionPane.showMessageDialog(null, "username and passeword is not correct");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnLoging.setBounds(161, 155, 89, 23);
		contentPane.add(btnLoging);
	}
}
