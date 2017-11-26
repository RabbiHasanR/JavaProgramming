package com.project.hr;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EmployeeMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeMenu frame = new EmployeeMenu();
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
	public EmployeeMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 603, 21);
		contentPane.add(menuBar);

		JMenu mnLeaves = new JMenu("Leaves");
		mnLeaves.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnLeaves.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\leave.png"));
		menuBar.add(mnLeaves);

		JMenuItem mntmApplyForLeaves = new JMenuItem("Apply For Leaves");
		mnLeaves.add(mntmApplyForLeaves);

		JMenu mnLoan = new JMenu("Loan");
		mnLoan.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnLoan.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\loan.png"));
		menuBar.add(mnLoan);

		JMenuItem mntmApplyForLoan = new JMenuItem("Apply For Loan");
		mnLoan.add(mntmApplyForLoan);

		JMenu mnSalary = new JMenu("Salary");
		mnSalary.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\recruitment.png"));
		menuBar.add(mnSalary);

		JMenuItem mntmPayclips = new JMenuItem("Payclips");
		mnSalary.add(mntmPayclips);

		JMenu mnRecruitment = new JMenu("Recruitment");
		mnRecruitment.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\reports.png"));
		menuBar.add(mnRecruitment);

		JMenuItem mntmRegistation = new JMenuItem("Registation");
		mnRecruitment.add(mntmRegistation);

		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		mntmLogout.setIcon(new ImageIcon("C:\\Users\\Rabbi hasan\\Downloads\\logout.png"));
		menuBar.add(mntmLogout);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 21, 73, 21);
		contentPane.add(lblNewLabel);

		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setBounds(465, 20, 138, 23);
		contentPane.add(btnForgetPassword);

		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/hrmsBanner.png")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, 44, 603, 274);
		contentPane.add(background);
	}
}
