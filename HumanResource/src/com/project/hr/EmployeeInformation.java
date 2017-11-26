package com.project.hr;

import java.awt.Color;
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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EmployeeInformation extends JFrame {

	private JPanel contentPane;
	private JTextField eName1;
	private JTextField eAddress1;
	private JTextField ePhone1;
	private JTextField eEmail1;
	private JTextField eSex1;
	private JTextField textField_5;
	private JTextField eId;
	private JTextField ePassword1;

	/**
	 * Launch the application.
	 */
	protected String employeeName;
	protected String employeeAddress;
	protected String employeePhone;
	protected String employeeEmail;
	protected String employeeSex;
	protected String employeePassword;
	Employee em = new Employee(employeeName, employeeAddress, employeePhone, employeeEmail, employeeSex,
			employeePassword);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeInformation frame = new EmployeeInformation();
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
	public EmployeeInformation() {
		Connection connection = DatabaseConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 443);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel eName = new JLabel("Name:");
		eName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eName.setBounds(29, 41, 47, 14);
		contentPane.add(eName);

		JLabel lblEmployeeInformation = new JLabel("Employee Information");
		lblEmployeeInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmployeeInformation.setBounds(10, 11, 144, 19);
		contentPane.add(lblEmployeeInformation);

		JLabel eAddress = new JLabel("Address:");
		eAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eAddress.setBounds(10, 81, 66, 14);
		contentPane.add(eAddress);

		JLabel ePhone = new JLabel("Phone:");
		ePhone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ePhone.setBounds(30, 117, 46, 14);
		contentPane.add(ePhone);

		JLabel eEmail = new JLabel("Email:");
		eEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eEmail.setBounds(29, 155, 46, 14);
		contentPane.add(eEmail);

		JLabel eSex = new JLabel("Sex:");
		eSex.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eSex.setBounds(29, 191, 46, 14);
		contentPane.add(eSex);

		JLabel eDateOfBirth = new JLabel("Date Of Birth:");
		eDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eDateOfBirth.setBounds(10, 233, 94, 14);
		contentPane.add(eDateOfBirth);

		eName1 = new JTextField();
		eName1.setBounds(86, 38, 86, 20);
		contentPane.add(eName1);
		eName1.setColumns(10);

		eAddress1 = new JTextField();
		eAddress1.setBounds(86, 78, 86, 20);
		contentPane.add(eAddress1);
		eAddress1.setColumns(10);

		ePhone1 = new JTextField();
		ePhone1.setBounds(86, 114, 86, 20);
		contentPane.add(ePhone1);
		ePhone1.setColumns(10);

		eEmail1 = new JTextField();
		eEmail1.setBounds(85, 152, 86, 20);
		contentPane.add(eEmail1);
		eEmail1.setColumns(10);

		eSex1 = new JTextField();
		eSex1.setBounds(85, 188, 86, 20);
		contentPane.add(eSex1);
		eSex1.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(114, 230, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					employeeName = eName1.getText();
					employeeAddress = eAddress1.getText();
					employeePhone = ePhone1.getText();
					employeeEmail = eEmail1.getText();
					employeeSex = eSex1.getText();
					employeePassword = ePassword1.getText();
					Employee em = new Employee(employeeName, employeeAddress, employeePhone, employeeEmail, employeeSex,
							employeePassword);
					// String employeeDateOfBirth = eDateOfBirth.getText();

					em.addInformarion();
				} catch (Exception r) {
					r.printStackTrace();
				}

			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSave.setBounds(32, 297, 89, 23);
		contentPane.add(btnSave);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String qurey = "update  Employee set EName='" + eName1.getText() + "',eAddress='"
							+ eAddress1.getText() + "',EPhone='" + ePhone1.getText() + "',EEmail='" + eEmail1.getText()
							+ "',ESex='" + eSex1.getText() + "' where EId='" + eId.getText() + "'";
					PreparedStatement pst = connection.prepareStatement(qurey);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Update");
					// refreshTable();
				} catch (Exception g) {
					JOptionPane.showMessageDialog(null, g);
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnUpdate.setBounds(141, 297, 89, 23);
		contentPane.add(btnUpdate);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					em.deleteInformation(eId.getText().toString());
				} catch (Exception n) {
					n.printStackTrace();
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDelete.setBounds(245, 297, 89, 23);
		contentPane.add(btnDelete);

		JButton btnSerch = new JButton("Search");
		btnSerch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String qurey = "select * from Employee where EId=? ";
					PreparedStatement pst = connection.prepareStatement(qurey);
					pst.setString(1, eId.getText().toString());
					ResultSet rs = pst.executeQuery();
					if (rs.next()) {
						employeeName = rs.getString("EName");
						eName1.setText(employeeName);
						employeeAddress = rs.getString("EAddress");
						eAddress1.setText(employeeAddress);
						employeePhone = rs.getString("EPhone");
						ePhone1.setText(employeePhone);
						employeeEmail = rs.getString("EEmail");
						eEmail1.setText(employeeEmail);
						employeeSex = rs.getString("ESex");
						eSex1.setText(employeeSex);
						// employeeDateOfBirth = rs.getString("EDateOfBirth");
					} else {
						JOptionPane.showMessageDialog(null, "Not Found");
					}
				} catch (Exception t) {
					t.printStackTrace();
				}
			}
		});
		btnSerch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSerch.setBounds(447, 97, 89, 23);
		contentPane.add(btnSerch);

		JLabel lblEmployeeId = new JLabel("Employee Id:");
		lblEmployeeId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmployeeId.setBounds(337, 41, 94, 14);
		contentPane.add(lblEmployeeId);

		eId = new JTextField();
		eId.setBounds(447, 38, 86, 20);
		contentPane.add(eId);
		eId.setColumns(10);

		JLabel passwordlbl = new JLabel("EmployeePassword:");
		passwordlbl.setBounds(10, 272, 111, 14);
		contentPane.add(passwordlbl);

		ePassword1 = new JTextField();
		ePassword1.setBounds(124, 269, 86, 20);
		contentPane.add(ePassword1);
		ePassword1.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eName1.setText(null);
				eAddress1.setText(null);
				ePhone1.setText(null);
				eEmail1.setText(null);
				eSex1.setText(null);
				ePassword1.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClear.setBounds(42, 331, 89, 23);
		contentPane.add(btnClear);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClose.setBounds(151, 332, 89, 23);
		contentPane.add(btnClose);
	}
}
