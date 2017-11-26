package com.practise.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class FirstGui {

	private JFrame frame;
	private JTextField firstMassage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGui window = new FirstGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ShowMassage = new JButton("Show Massage");
		ShowMassage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstMassage.setText("Hi Rabbi");
				JOptionPane.showMessageDialog(null,"First Massage");
			}
		});
		ShowMassage.setBackground(Color.GREEN);
		ShowMassage.setFont(new Font("Tahoma", Font.BOLD, 14));
		ShowMassage.setBounds(157, 146, 135, 25);
		frame.getContentPane().add(ShowMassage);
		
		firstMassage = new JTextField();
		firstMassage.setBounds(157, 61, 86, 20);
		frame.getContentPane().add(firstMassage);
		firstMassage.setColumns(10);
	}
}
