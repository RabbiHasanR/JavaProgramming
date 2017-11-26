package com.pointofsale.demo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdminPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
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
	public AdminPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAdminPanel = new JLabel("Admin Panel");
		lblAdminPanel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdminPanel.setBounds(164, 11, 143, 36);
		contentPane.add(lblAdminPanel);

		JButton btnUserRegistration = new JButton("User Registration");
		btnUserRegistration.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUserRegistration.setBounds(31, 108, 143, 36);
		contentPane.add(btnUserRegistration);

		JButton btnNewButton = new JButton("Store");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Store s = new Store();
					s.setVisible(true);
				} catch (Exception n) {
					JOptionPane.showMessageDialog(null, n);
				}
			}
		});
		btnNewButton.setBounds(192, 108, 89, 36);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reports");
		btnNewButton_1.setBounds(291, 108, 89, 36);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Account");
		btnNewButton_2.setBounds(390, 108, 89, 36);
		contentPane.add(btnNewButton_2);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(31, 228, 89, 36);
		contentPane.add(btnBack);

		JButton btnExits = new JButton("Exits");
		btnExits.setBounds(390, 176, 89, 36);
		contentPane.add(btnExits);

		JButton btnNewButton_3 = new JButton("Sales");
		btnNewButton_3.setBounds(152, 176, 89, 36);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Products");
		btnNewButton_4.setBounds(272, 176, 89, 36);
		contentPane.add(btnNewButton_4);

		JButton btnCustomer = new JButton("Customer");
		btnCustomer.setBounds(31, 176, 89, 36);
		contentPane.add(btnCustomer);

		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/pink-canada.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 518, 289);
		contentPane.add(label);
	}
}
