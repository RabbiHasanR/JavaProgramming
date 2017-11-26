package com.pointofsale.demo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Loging extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox<String> comboBoxName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loging frame = new Loging();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void fillCombobox() {
		try {
			comboBoxName.addItem("Admin");
			comboBoxName.addItem("User");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	/**
	 * Create the frame.
	 */
	public Loging() {
		Connection connection = SqlConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMassage = new JLabel("POINT OF SALE");
		lblMassage.setForeground(Color.RED);
		lblMassage.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMassage.setBounds(141, 11, 177, 35);
		contentPane.add(lblMassage);

		JLabel lblTypeOfUser = new JLabel("Type of user");
		lblTypeOfUser.setForeground(Color.WHITE);
		lblTypeOfUser.setBounds(141, 75, 80, 14);
		contentPane.add(lblTypeOfUser);

		comboBoxName = new JComboBox<String>();
		comboBoxName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		comboBoxName.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBoxName.setBounds(247, 57, 95, 35);
		contentPane.add(comboBoxName);

		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(127, 125, 62, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(199, 122, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(104, 178, 69, 14);
		contentPane.add(lblPassword);

		textField_1 = new JTextField();
		textField_1.setBounds(199, 175, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnLoging = new JButton("Loging");
		btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (comboBoxName.getSelectedItem() == "Admin") {
						String query = "select * from Admin where adminId=? and password=?";
						// String query = "select adminId, [password] from
						// Admin";
						PreparedStatement pst = connection.prepareStatement(query);
						pst.setString(1, textField.getText());
						pst.setString(2, textField_1.getText());
						ResultSet rs = pst.executeQuery();
						int count = 0;
						while (rs.next()) {
							count = count + 1;
						}
						if (count == 1) {
							JOptionPane.showMessageDialog(null, "Id and password is correct");
							AdminPanel ad = new AdminPanel();
							ad.setVisible(true);
						} else if (count > 1) {
							JOptionPane.showMessageDialog(null, "Duplicate Id or password");
						} else {
							JOptionPane.showMessageDialog(null, "Incorrect Id or Passeord");
						}

					} else {
						String query = "select * from [User] where userId=? and password=?";
						PreparedStatement pst = connection.prepareStatement(query);
						pst.setString(1, textField.getText());
						pst.setString(2, textField_1.getText());
						ResultSet rs = pst.executeQuery();
						int count = 0;
						while (rs.next()) {
							count = count + 1;
						}
						if (count == 1) {
							JOptionPane.showMessageDialog(null, "Id and password is correct");
							UserPanel up = new UserPanel();
							up.setVisible(true);
						} else if (count > 1) {
							JOptionPane.showMessageDialog(null, "Duplicate Id or password");
						} else {
							JOptionPane.showMessageDialog(null, "Incorrect Id or Passeord");
						}

					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}

			}
		});
		btnLoging.setForeground(Color.BLACK);
		btnLoging.setBounds(118, 225, 89, 23);
		contentPane.add(btnLoging);

		JButton btnCancle = new JButton("Cancle");
		btnCancle.setForeground(Color.BLACK);
		btnCancle.setBounds(236, 225, 89, 23);
		contentPane.add(btnCancle);

		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/black12.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(0, 0, 443, 295);
		contentPane.add(lblNewLabel_1);
		fillCombobox();

	}
}
