package com.pointofsale.demo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SuplierInfo extends JFrame {

	private JPanel contentPane;
	private JTextField suplierId;
	private JTextField name;
	private JTextField mobile;
	private JTextField email;
	private JTextField companyName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuplierInfo frame = new SuplierInfo();
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
	public SuplierInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSuplierid = new JLabel("SuplierId:");
		lblSuplierid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSuplierid.setBounds(10, 48, 86, 20);
		contentPane.add(lblSuplierid);

		suplierId = new JTextField();
		suplierId.setBounds(112, 48, 102, 23);
		contentPane.add(suplierId);
		suplierId.setColumns(10);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(10, 105, 66, 23);
		contentPane.add(lblName);

		name = new JTextField();
		name.setBounds(112, 105, 102, 24);
		contentPane.add(name);
		name.setColumns(10);

		JLabel lblMobile = new JLabel("Mobile:");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMobile.setBounds(10, 164, 66, 20);
		contentPane.add(lblMobile);

		mobile = new JTextField();
		mobile.setBounds(112, 164, 102, 23);
		contentPane.add(mobile);
		mobile.setColumns(10);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(10, 217, 66, 20);
		contentPane.add(lblEmail);

		email = new JTextField();
		email.setBounds(112, 217, 102, 23);
		contentPane.add(email);
		email.setColumns(10);

		JLabel lblCompanyname = new JLabel("CompanyName:");
		lblCompanyname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCompanyname.setBounds(10, 269, 132, 20);
		contentPane.add(lblCompanyname);

		companyName = new JTextField();
		companyName.setBounds(162, 269, 118, 23);
		contentPane.add(companyName);
		companyName.setColumns(10);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Suplier s = new Suplier();
					s.addSuplierInfo(suplierId.getText(), name.getText(), mobile.getText(), email.getText(),
							companyName.getText());
				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}
		});
		btnSave.setBounds(52, 323, 89, 23);
		contentPane.add(btnSave);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UserPanel up = new UserPanel();
					up.setVisible(true);
				} catch (Exception m) {
					JOptionPane.showMessageDialog(null, m);
				}
			}
		});
		btnBack.setBounds(205, 323, 89, 23);
		contentPane.add(btnBack);
	}
}
