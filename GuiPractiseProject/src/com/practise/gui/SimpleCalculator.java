package com.practise.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField value1;
	private JTextField value2;
	private JTextField answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator frame = new SimpleCalculator();
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
	public SimpleCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		value1 = new JTextField();
		value1.setBounds(56, 31, 86, 20);
		contentPane.add(value1);
		value1.setColumns(10);
		
		value2 = new JTextField();
		value2.setBounds(204, 31, 86, 20);
		contentPane.add(value2);
		value2.setColumns(10);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int num1=Integer.parseInt(value1.getText());
					int num2=Integer.parseInt(value2.getText());
					int ans=num1+num2;
					answer.setText(Integer.toString(ans));
					
				}
				catch(Exception f){
					JOptionPane.showMessageDialog(null,"Enter valid number");
				}
			}
		});
		add.setBounds(56, 99, 89, 23);
		contentPane.add(add);
		
		JButton sub = new JButton("Sub");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int num1=Integer.parseInt(value1.getText());
					int num2=Integer.parseInt(value2.getText());
					int ans;
					if(num2>num1){
						int temp=num2;
						num2=num1;
						num1=temp;
					   ans=num1-num2;
						answer.setText(Integer.toString(ans));
					}
					else{
						ans=num1-num2;
						answer.setText(Integer.toString(ans));
					}
					
				}
				catch(Exception g){
					JOptionPane.showMessageDialog(null,"Enter valid number");
				}
			}
		});
		sub.setBounds(204, 99, 89, 23);
		contentPane.add(sub);
		
		answer = new JTextField();
		answer.setBounds(173, 165, 86, 20);
		contentPane.add(answer);
		answer.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(96, 168, 46, 14);
		contentPane.add(lblAnswer);
	}

}
