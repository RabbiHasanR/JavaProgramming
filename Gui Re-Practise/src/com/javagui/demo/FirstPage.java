package com.javagui.demo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FirstPage extends JFrame {

	private JPanel contentPane;
	private JTextField Num1;
	private JTextField Num2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Num1 = new JTextField();
		Num1.setBounds(31, 33, 150, 36);
		contentPane.add(Num1);
		Num1.setColumns(10);

		Num2 = new JTextField();
		Num2.setBounds(237, 33, 158, 36);
		contentPane.add(Num2);
		Num2.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1, num2, ans;
					num1 = Integer.parseInt(Num1.getText());
					num2 = Integer.parseInt(Num2.getText());
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));

				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}
		});
		btnAdd.setBounds(59, 149, 89, 23);
		contentPane.add(btnAdd);

		JButton btnSub = new JButton("Sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1, num2, ans;
					num1 = Integer.parseInt(Num1.getText());
					num2 = Integer.parseInt(Num2.getText());
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));

				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}
		});
		btnSub.setBounds(263, 149, 89, 23);
		contentPane.add(btnSub);

		JLabel lblAns = new JLabel("Ans:");
		lblAns.setBounds(76, 216, 46, 14);
		contentPane.add(lblAns);

		textFieldAns = new JTextField();
		textFieldAns.setBounds(132, 213, 86, 20);
		contentPane.add(textFieldAns);
		textFieldAns.setColumns(10);
	}
}
