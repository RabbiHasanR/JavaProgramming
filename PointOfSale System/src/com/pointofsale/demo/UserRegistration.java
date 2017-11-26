package com.pointofsale.demo;

import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

public class UserRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField userId;
	private JTextField userPassword;
	private JTextField userName;
	private JTextField userAddress;
	private JTextField userMobile;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration frame = new UserRegistration();
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
	public UserRegistration() {
		Connection connection = SqlConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUserId = new JLabel("User Id:");
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserId.setBounds(33, 56, 77, 30);
		contentPane.add(lblUserId);

		userId = new JTextField();
		userId.setBounds(165, 56, 110, 32);
		contentPane.add(userId);
		userId.setColumns(10);

		JLabel lblUserPassword = new JLabel("User Password:");
		lblUserPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserPassword.setBounds(20, 97, 135, 30);
		contentPane.add(lblUserPassword);

		userPassword = new JTextField();
		userPassword.setBounds(165, 99, 110, 26);
		contentPane.add(userPassword);
		userPassword.setColumns(10);

		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserName.setBounds(33, 155, 98, 30);
		contentPane.add(lblUserName);

		userName = new JTextField();
		userName.setBounds(165, 157, 110, 26);
		contentPane.add(userName);
		userName.setColumns(10);

		JLabel lblUserAddress = new JLabel("User Address:");
		lblUserAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserAddress.setBounds(33, 209, 122, 34);
		contentPane.add(lblUserAddress);

		userAddress = new JTextField();
		userAddress.setBounds(165, 209, 110, 30);
		contentPane.add(userAddress);
		userAddress.setColumns(10);

		JLabel lblUserMobile = new JLabel("User Mobile:");
		lblUserMobile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserMobile.setBounds(33, 254, 98, 30);
		contentPane.add(lblUserMobile);

		userMobile = new JTextField();
		userMobile.setBounds(165, 256, 110, 26);
		contentPane.add(userMobile);
		userMobile.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(298, 11, 399, 259);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "insert into [User](userId,password,name,address,moblie) values(?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, userId.getText());
					pst.setString(2, userPassword.getText());
					pst.setString(3, userName.getText());
					pst.setString(4, userAddress.getText());
					pst.setString(5, userMobile.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Save");

				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, "Enter data");
				}
			}
		});
		btnSave.setBounds(53, 295, 89, 23);
		contentPane.add(btnSave);

		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(165, 295, 89, 23);
		contentPane.add(btnEdit);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(264, 295, 89, 23);
		contentPane.add(btnDelete);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(363, 295, 89, 23);
		contentPane.add(btnSearch);

		JButton btnShowInformation = new JButton("Show Information");
		btnShowInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query2 = "select * from [User]";
					PreparedStatement pst1 = connection.prepareStatement(query2);
					ResultSet rs = pst1.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnShowInformation.setBounds(507, 295, 135, 23);
		contentPane.add(btnShowInformation);

	}
}
