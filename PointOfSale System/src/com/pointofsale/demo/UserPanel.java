package com.pointofsale.demo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class UserPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPanel frame = new UserPanel();
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
	public UserPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 332);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnSales = new JMenu("Sales");
		mnSales.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnSales);

		JMenu mnProduct = new JMenu("Product");
		mnProduct.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnProduct);

		JMenuItem mntmAddProduct = new JMenuItem("Add Product");
		mntmAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ProductInfo pi = new ProductInfo();
					pi.setVisible(true);
				} catch (Exception n) {
					JOptionPane.showMessageDialog(null, n);
				}
			}
		});
		mnProduct.add(mntmAddProduct);

		JMenu mnSupliar = new JMenu("Supliar");
		mnSupliar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnSupliar);

		JMenuItem mntmAddSupliar = new JMenuItem("Add Supliar");
		mnSupliar.add(mntmAddSupliar);

		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnProfile);

		JMenu mnBack = new JMenu("Back");
		mnBack.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnBack);

		JMenu mnExit = new JMenu("Exit");
		mnExit.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
}
