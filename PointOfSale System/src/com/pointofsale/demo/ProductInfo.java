package com.pointofsale.demo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ProductInfo extends JFrame {

	private JPanel contentPane;
	private JTextField productId;
	private JTextField productName;
	private JTextField buingCost;
	private JTextField sellingCost;
	private JTextField totalNumberOfProduct;
	private JTextField catagory;
	private JTextField size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInfo frame = new ProductInfo();
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
	public ProductInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblProductid = new JLabel("ProductId:");
		lblProductid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductid.setBounds(10, 42, 69, 26);
		contentPane.add(lblProductid);

		productId = new JTextField();
		productId.setBounds(89, 41, 102, 26);
		contentPane.add(productId);
		productId.setColumns(10);

		JLabel lblProductname = new JLabel("ProductName:");
		lblProductname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductname.setBounds(10, 92, 93, 26);
		contentPane.add(lblProductname);

		productName = new JTextField();
		productName.setBounds(113, 91, 102, 26);
		contentPane.add(productName);
		productName.setColumns(10);

		JLabel lblBuyingcost = new JLabel("BuyingCost:");
		lblBuyingcost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBuyingcost.setBounds(10, 130, 93, 26);
		contentPane.add(lblBuyingcost);

		buingCost = new JTextField();
		buingCost.setBounds(113, 128, 102, 27);
		contentPane.add(buingCost);
		buingCost.setColumns(10);

		JLabel lblSellingcost = new JLabel("SellingCost:");
		lblSellingcost.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSellingcost.setBounds(10, 174, 93, 27);
		contentPane.add(lblSellingcost);

		sellingCost = new JTextField();
		sellingCost.setBounds(113, 173, 102, 26);
		contentPane.add(sellingCost);
		sellingCost.setColumns(10);

		JLabel lblNewLabel = new JLabel("TotalNumberOfProduct:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 215, 157, 26);
		contentPane.add(lblNewLabel);

		totalNumberOfProduct = new JTextField();
		totalNumberOfProduct.setBounds(177, 214, 107, 26);
		contentPane.add(totalNumberOfProduct);
		totalNumberOfProduct.setColumns(10);

		JLabel lblCatagory = new JLabel("Catagory:");
		lblCatagory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCatagory.setBounds(10, 252, 69, 24);
		contentPane.add(lblCatagory);

		catagory = new JTextField();
		catagory.setBounds(113, 250, 102, 26);
		contentPane.add(catagory);
		catagory.setColumns(10);

		JLabel lblSize = new JLabel("Size:");
		lblSize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSize.setBounds(10, 293, 45, 24);
		contentPane.add(lblSize);

		size = new JTextField();
		size.setBounds(81, 284, 110, 33);
		contentPane.add(size);
		size.setColumns(10);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Product p = new Product();
					p.addProductInformation(productId.getText(), productName.getText(), buingCost.getText(),
							sellingCost.getText(), totalNumberOfProduct.getText(), catagory.getText(), size.getText());
				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}
		});
		btnSave.setBounds(20, 335, 89, 23);
		contentPane.add(btnSave);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UserPanel up = new UserPanel();
					up.setVisible(true);
				} catch (Exception n) {
					JOptionPane.showMessageDialog(null, n);
				}
			}
		});
		btnBack.setBounds(155, 335, 89, 23);
		contentPane.add(btnBack);
	}
}
