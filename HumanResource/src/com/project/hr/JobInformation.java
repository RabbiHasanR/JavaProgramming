package com.project.hr;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JobInformation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JobInformation frame = new JobInformation();
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
	public JobInformation() {
		Connection connection = DatabaseConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblJobInformation = new JLabel("Job Information");
		lblJobInformation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJobInformation.setBounds(10, 11, 151, 24);
		contentPane.add(lblJobInformation);

		JLabel lblJobTitle = new JLabel("Job Title:");
		lblJobTitle.setBounds(33, 64, 58, 14);
		contentPane.add(lblJobTitle);

		textField = new JTextField();
		textField.setBounds(109, 61, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblBranchName = new JLabel("Branch Name:");
		lblBranchName.setBounds(33, 107, 67, 14);
		contentPane.add(lblBranchName);

		textField_1 = new JTextField();
		textField_1.setBounds(109, 104, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblBranchAddress = new JLabel("Branch Address:");
		lblBranchAddress.setBounds(10, 146, 90, 14);
		contentPane.add(lblBranchAddress);

		textField_2 = new JTextField();
		textField_2.setBounds(109, 143, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblDepartmentName = new JLabel("Department name:");
		lblDepartmentName.setBounds(10, 190, 102, 14);
		contentPane.add(lblDepartmentName);

		textField_3 = new JTextField();
		textField_3.setBounds(122, 187, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// String query="insert into JobHistory(JobTitle) values(?)
				// where EId";
			}
		});
		btnSave.setBounds(33, 242, 89, 23);
		contentPane.add(btnSave);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(140, 242, 89, 23);
		contentPane.add(btnUpdate);

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(20, 281, 89, 23);
		contentPane.add(btnClear);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(140, 281, 89, 23);
		contentPane.add(btnDelete);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(255, 281, 89, 23);
		contentPane.add(btnSearch);

		JLabel lblEmployeeId = new JLabel("Employee Id:");
		lblEmployeeId.setBounds(280, 33, 73, 14);
		contentPane.add(lblEmployeeId);

		textField_4 = new JTextField();
		textField_4.setBounds(375, 30, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
