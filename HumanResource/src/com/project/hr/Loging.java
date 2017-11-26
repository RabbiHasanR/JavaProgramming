package com.project.hr;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Loging extends JFrame {

	private JPanel contentPane;
	private JTextField getText;

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

	/**
	 * Create the frame.
	 */
	public Loging() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		getText = new JTextField();
		getText.setBounds(35, 21, 202, 35);
		contentPane.add(getText);
		getText.setColumns(10);

		JButton btn = new JButton("7");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = getText.getText() + btn.getText();
				getText.setText(enterNumber);
			}
		});
		btn.setBounds(10, 82, 51, 23);
		contentPane.add(btn);

		JButton btn1 = new JButton("8");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn1.getText();
				getText.setText(enterNumber);
			}
		});
		btn1.setBounds(71, 82, 51, 23);
		contentPane.add(btn1);

		JButton btn2 = new JButton("9");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn2.getText();
				getText.setText(enterNumber);
			}
		});
		btn2.setBounds(132, 82, 45, 23);
		contentPane.add(btn2);
		Image img1 = new ImageIcon(this.getClass().getResource("/hrmloging.jpg")).getImage();

		JButton btn3 = new JButton("4");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn3.getText();
				getText.setText(enterNumber);
			}
		});
		btn3.setBounds(10, 116, 51, 23);
		contentPane.add(btn3);

		JButton btn4 = new JButton("5");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn4.getText();
				getText.setText(enterNumber);
			}
		});
		btn4.setBounds(71, 116, 52, 23);
		contentPane.add(btn4);

		JButton btn5 = new JButton("6");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn5.getText();
				getText.setText(enterNumber);
			}
		});
		btn5.setBounds(132, 115, 45, 23);
		contentPane.add(btn5);

		JButton btn6 = new JButton("1");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn6.getText();
				getText.setText(enterNumber);
			}
		});
		btn6.setBounds(10, 150, 51, 23);
		contentPane.add(btn6);

		JButton btn7 = new JButton("2");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn7.getText();
				getText.setText(enterNumber);
			}
		});
		btn7.setBounds(71, 150, 51, 23);
		contentPane.add(btn7);

		JButton btn8 = new JButton("3");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn8.getText();
				getText.setText(enterNumber);
			}
		});
		btn8.setBounds(132, 149, 45, 23);
		contentPane.add(btn8);

		JButton btn9 = new JButton("0");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = getText.getText() + btn9.getText();
				getText.setText(enterNumber);
			}
		});
		btn9.setBounds(10, 184, 51, 23);
		contentPane.add(btn9);

		JButton enter = new JButton("Enter");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLoging al = new AdminLoging();
				try {
					String code = getText.getText();
					if (code.equals("12345")) {
						JOptionPane.showMessageDialog(null, "Password is correct");
						al.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Password is not correct");
					}
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		});
		enter.setBounds(82, 186, 89, 23);
		contentPane.add(enter);

		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getText.setText(null);
			}
		});
		clear.setBounds(10, 220, 89, 23);
		contentPane.add(clear);

		JButton employeeLoging = new JButton("Employee Loging");
		employeeLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					EmployeeLoging el = new EmployeeLoging();
					el.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		employeeLoging.setBounds(109, 220, 144, 23);
		contentPane.add(employeeLoging);

		JLabel background = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/hrms.jpg")).getImage();
		background.setIcon(new ImageIcon(img));
		background.setBounds(0, -20, 594, 287);
		contentPane.add(background);

	}
}
