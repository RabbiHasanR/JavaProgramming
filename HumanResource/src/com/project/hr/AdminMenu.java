package com.project.hr;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdminMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	Connection connection = null;

	public AdminMenu() {
		connection = DatabaseConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 737, 21);
		contentPane.add(menuBar);

		JMenu mnEmployee = new JMenu("Employee");
		mnEmployee.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\Employee.png"));
		mnEmployee.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnEmployee);

		JMenuItem mntmAddNewEmployee = new JMenuItem("Add New Employee");
		mnEmployee.add(mntmAddNewEmployee);

		JMenuItem mntmEditEmployeePersonal = new JMenuItem("Edit Employee Personal Details");
		mntmEditEmployeePersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeInformation el = new EmployeeInformation();
				el.setVisible(true);
			}
		});
		mnEmployee.add(mntmEditEmployeePersonal);

		JMenuItem mntmEditEmployeeJob = new JMenuItem("Edit Employee Job Details");
		mnEmployee.add(mntmEditEmployeeJob);

		JMenuItem mntmEditEmployeeSalary = new JMenuItem("Edit Employee Salary Details");
		mnEmployee.add(mntmEditEmployeeSalary);

		JMenu mnNewMenu = new JMenu("Leaves");
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\leave.png"));
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnNewMenu);

		JMenuItem mntmEmployeeLeaves = new JMenuItem("Employee Leaves");
		mnNewMenu.add(mntmEmployeeLeaves);

		JMenuItem mntmLeavesApplication = new JMenuItem("Leaves Application");
		mnNewMenu.add(mntmLeavesApplication);

		JMenu mnPayro = new JMenu("Payroll");
		mnPayro.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\recruitment.png"));
		mnPayro.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnPayro);

		JMenuItem mntmSalaryDetails = new JMenuItem("Salary Details");
		mnPayro.add(mntmSalaryDetails);

		JMenuItem mntmAttendanceDetails = new JMenuItem("Attendance Details");
		mnPayro.add(mntmAttendanceDetails);

		JMenuItem mntmLeavesDetails = new JMenuItem("Leaves Details");
		mnPayro.add(mntmLeavesDetails);

		JMenu mnAttendance = new JMenu("Attendance");
		mnAttendance.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\Attendance.png"));
		mnAttendance.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnAttendance);

		JMenuItem mntmMonthlyAttendanceReport = new JMenuItem("Monthly Attendance Report");
		mnAttendance.add(mntmMonthlyAttendanceReport);

		JMenuItem mntmDailly = new JMenuItem("Daily Attendance Report ");
		mnAttendance.add(mntmDailly);

		JMenu mnRecruitment = new JMenu("Recruitment");
		mnRecruitment.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\recruitment.png"));
		mnRecruitment.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnRecruitment);

		JMenuItem mntmRegister = new JMenuItem("Registation");
		mnRecruitment.add(mntmRegister);

		JMenuItem mntmRegistetionDetails = new JMenuItem("Registation Details");
		mnRecruitment.add(mntmRegistetionDetails);

		JMenu mnLoan = new JMenu("Loan");
		mnLoan.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\loan.png"));
		mnLoan.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnLoan);

		JMenuItem mntmEmployeeLoan = new JMenuItem("Employee Loan");
		mnLoan.add(mntmEmployeeLoan);

		JMenuItem mntmLoanApplication = new JMenuItem("Loan Application");
		mnLoan.add(mntmLoanApplication);

		JMenu mnReports = new JMenu("Reports");
		mnReports.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\reports.png"));
		mnReports.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnReports);

		JMenuItem mntmHrReports = new JMenuItem("HR Reports");
		mnReports.add(mntmHrReports);

		JMenuItem mntmEmployeeReports = new JMenuItem("Employee Reports");
		mnReports.add(mntmEmployeeReports);

		JMenuItem mntmPayrollReports = new JMenuItem("Payroll Reports");
		mnReports.add(mntmPayrollReports);

		JMenuItem mntmTrainingReports = new JMenuItem("Training Reports");
		mnReports.add(mntmTrainingReports);

		JMenuItem mntmRecruitmentReports = new JMenuItem("Recruitment Reports");
		mnReports.add(mntmRecruitmentReports);

		JMenu mnTraining = new JMenu("Training");
		mnTraining.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\Training.png"));
		mnTraining.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnTraining);

		JMenuItem mntmEmployeeTraining = new JMenuItem("Employee Training");
		mnTraining.add(mntmEmployeeTraining);

		JMenuItem mntmTrainingReports_1 = new JMenuItem("Training Reports");
		mnTraining.add(mntmTrainingReports_1);

		JMenu mnAnnouncment = new JMenu("Announcement");
		mnAnnouncment.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\recruitment.png"));
		mnAnnouncment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnAnnouncment.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnAnnouncment);

		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\logout.png"));
		mntmLogout.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		menuBar.add(mntmLogout);

		JLabel lblWelcomeAdmin = new JLabel("Welcome Admin");
		lblWelcomeAdmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWelcomeAdmin.setBounds(0, 21, 151, 21);
		contentPane.add(lblWelcomeAdmin);

		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/hrmsBanner3.jpg")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 50, 788, 523);
		contentPane.add(background);
	}
}
