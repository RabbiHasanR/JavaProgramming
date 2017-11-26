package com.project.hr;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EmployeeLoging extends JFrame {

	private JPanel contentPane;
	private JTextField employeeId;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLoging frame = new EmployeeLoging();
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
	public EmployeeLoging() {
		Connection connection = DatabaseConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEmployee = new JLabel("Employee");
		lblEmployee.setForeground(Color.WHITE);
		lblEmployee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmployee.setBounds(111, 72, 95, 24);
		contentPane.add(lblEmployee);

		JLabel lblEmployeeId = new JLabel("Employee Id:");
		lblEmployeeId.setForeground(Color.WHITE);
		lblEmployeeId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmployeeId.setBounds(21, 133, 101, 14);
		contentPane.add(lblEmployeeId);

		employeeId = new JTextField();
		employeeId.setBounds(141, 132, 86, 20);
		contentPane.add(employeeId);
		employeeId.setColumns(10);

		JLabel IblPassword = new JLabel("Password:");
		IblPassword.setForeground(Color.WHITE);
		IblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IblPassword.setBounds(52, 183, 70, 14);
		contentPane.add(IblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(141, 182, 86, 20);
		contentPane.add(passwordField);

		JButton btnLoging = new JButton("Loging");
		btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from Employee where EId=? and EPassword=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, employeeId.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while (rs.next()) {
						count++;
					}
					if (count == 1) {
						JOptionPane.showMessageDialog(null, "EmployeeId and password is correct");
						EmployeeMenu em = new EmployeeMenu();
						em.setVisible(true);
					} else if (count > 1) {
						JOptionPane.showMessageDialog(null, "duplicate EmployeeId and password");
					} else {
						JOptionPane.showMessageDialog(null, "EmployeeId and passeword is  incorrect");
					}
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnLoging.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLoging.setBounds(43, 227, 89, 31);
		contentPane.add(btnLoging);

		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnCancle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancle.setBounds(162, 227, 89, 31);
		contentPane.add(btnCancle);

		JLabel lblHumanResourceHr = new JLabel("Human Resource HR");
		lblHumanResourceHr.setForeground(Color.RED);
		lblHumanResourceHr.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHumanResourceHr.setBounds(21, 11, 274, 36);
		contentPane.add(lblHumanResourceHr);

		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/welcome-office.jpg")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 0, 357, 298);
		contentPane.add(background);
	}
}
