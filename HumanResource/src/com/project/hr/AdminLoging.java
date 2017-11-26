package com.project.hr;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminLoging extends JFrame {

	private JPanel contentPane;
	private JTextField logingId;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoging frame = new AdminLoging();
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
	// connection = null;

	public AdminLoging() {
		Connection connection = DatabaseConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogingId = new JLabel("Loging ID:");
		lblLogingId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogingId.setBounds(52, 81, 75, 23);
		contentPane.add(lblLogingId);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(52, 140, 75, 23);
		contentPane.add(lblPassword);

		logingId = new JTextField();
		logingId.setBounds(137, 81, 111, 23);
		contentPane.add(logingId);
		logingId.setColumns(10);

		password = new JTextField();
		password.setBounds(137, 140, 111, 23);
		contentPane.add(password);
		password.setColumns(10);

		JButton btnLoging = new JButton("Loging");
		btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from AdminInfo where AId=? and APassword=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, logingId.getText());
					pst.setString(2, password.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while (rs.next()) {
						count++;
					}
					if (count == 1) {
						JOptionPane.showMessageDialog(null, "AdminId and password is correct");
						AdminMenu ad = new AdminMenu();
						ad.setVisible(true);
					} else if (count > 1) {
						JOptionPane.showMessageDialog(null, "duplicate AdminId and password");
					} else {
						JOptionPane.showMessageDialog(null, "AdminId and passeword is  incorrect");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		btnLoging.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLoging.setBounds(68, 189, 89, 23);
		contentPane.add(btnLoging);

		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnCancle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancle.setBounds(167, 191, 89, 23);
		contentPane.add(btnCancle);

		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdmin.setBounds(149, 37, 60, 23);
		contentPane.add(lblAdmin);

		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/welcome.jpg")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 0, 521, 373);
		contentPane.add(background);
	}
}
