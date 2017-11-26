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

public class Store extends JFrame {

	private JPanel contentPane;
	private JTextField storeId;
	private JTextField storeName;
	private JTextField storeAddress;
	private JTextField storePhone;
	private JTextField storeEmail;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Store frame = new Store();
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
	public Store() {
		Connection connection = SqlConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblStoreId = new JLabel("Store Id:");
		lblStoreId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStoreId.setBounds(10, 46, 81, 23);
		contentPane.add(lblStoreId);

		JLabel lblStoreName = new JLabel("Store Name:");
		lblStoreName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStoreName.setBounds(10, 87, 102, 28);
		contentPane.add(lblStoreName);

		JLabel lblStoreAddress = new JLabel("Store Address:");
		lblStoreAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStoreAddress.setBounds(10, 137, 115, 28);
		contentPane.add(lblStoreAddress);

		JLabel lblStorePhone = new JLabel("Store Phone:");
		lblStorePhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStorePhone.setBounds(10, 192, 102, 28);
		contentPane.add(lblStorePhone);

		JLabel lblStoreEmail = new JLabel("Store Email:");
		lblStoreEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStoreEmail.setBounds(10, 234, 102, 28);
		contentPane.add(lblStoreEmail);

		storeId = new JTextField();
		storeId.setBounds(101, 42, 102, 28);
		contentPane.add(storeId);
		storeId.setColumns(10);

		storeName = new JTextField();
		storeName.setBounds(135, 87, 102, 27);
		contentPane.add(storeName);
		storeName.setColumns(10);

		storeAddress = new JTextField();
		storeAddress.setBounds(151, 137, 102, 27);
		contentPane.add(storeAddress);
		storeAddress.setColumns(10);

		storePhone = new JTextField();
		storePhone.setBounds(151, 192, 102, 27);
		contentPane.add(storePhone);
		storePhone.setColumns(10);

		storeEmail = new JTextField();
		storeEmail.setBounds(151, 234, 102, 27);
		contentPane.add(storeEmail);
		storeEmail.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(267, 22, 316, 171);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "insert into RetaileStore(storeId,name,phone,email,adress)values(?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, storeId.getText());
					pst.setString(2, storeName.getText());
					pst.setString(3, storePhone.getText());
					pst.setString(4, storeEmail.getText());
					pst.setString(5, storeAddress.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data save");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Enter Data");
				}
			}
		});
		btnSave.setBounds(151, 273, 89, 23);
		contentPane.add(btnSave);

		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(263, 273, 89, 23);
		contentPane.add(btnEdit);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(263, 225, 89, 23);
		contentPane.add(btnDelete);

		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query2 = "select * from RetaileStore";
					PreparedStatement pst1 = connection.prepareStatement(query2);
					ResultSet rs = pst1.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}
		});
		btnShow.setBounds(393, 225, 89, 23);
		contentPane.add(btnShow);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AdminPanel ap = new AdminPanel();
					ap.setVisible(true);
				} catch (Exception n) {
					JOptionPane.showMessageDialog(null, n);
				}
			}
		});
		btnBack.setBounds(393, 273, 89, 23);
		contentPane.add(btnBack);
	}
}
