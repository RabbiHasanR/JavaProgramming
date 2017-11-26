package com.pointOfSale.pos;

import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Product extends JFrame {

	private JPanel contentPane;
	private JTextField article;
	private JTextField description;
	private JTextField buyingPrice;
	private JTextField sellingPrice;
	private JTextField addDate;
	private JComboBox catagory;
	Connection connection = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product frame = new Product();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void fillCombobox() {
		try {
			String query = "select * from Catagory";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				catagory.addItem("catagoryName");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

	public Product() {
		connection = DatabaseConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewProduct = new JLabel("New Product");
		lblNewProduct.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewProduct.setBounds(60, 11, 168, 36);
		contentPane.add(lblNewProduct);

		JLabel lblArticle = new JLabel("Article");
		lblArticle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblArticle.setBounds(10, 58, 71, 28);
		contentPane.add(lblArticle);

		article = new JTextField();
		article.setBounds(113, 58, 115, 28);
		contentPane.add(article);
		article.setColumns(10);

		JLabel lblCatagory = new JLabel("Catagory");
		lblCatagory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCatagory.setBounds(10, 116, 86, 28);
		contentPane.add(lblCatagory);

		catagory = new JComboBox();
		catagory.setBounds(113, 116, 115, 28);
		contentPane.add(catagory);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDescription.setBounds(10, 157, 93, 28);
		contentPane.add(lblDescription);

		description = new JTextField();
		description.setBounds(113, 155, 115, 30);
		contentPane.add(description);
		description.setColumns(10);

		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuantity.setBounds(10, 205, 93, 28);
		contentPane.add(lblQuantity);

		JComboBox quantity = new JComboBox();
		quantity.setBounds(113, 205, 115, 28);
		contentPane.add(quantity);

		JLabel lblBuyingprice = new JLabel("BuyingPrice");
		lblBuyingprice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBuyingprice.setBounds(10, 254, 93, 28);
		contentPane.add(lblBuyingprice);

		buyingPrice = new JTextField();
		buyingPrice.setBounds(113, 254, 115, 26);
		contentPane.add(buyingPrice);
		buyingPrice.setColumns(10);

		JLabel lblSellingprice = new JLabel("SellingPrice");
		lblSellingprice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSellingprice.setBounds(10, 293, 93, 27);
		contentPane.add(lblSellingprice);

		sellingPrice = new JTextField();
		sellingPrice.setBounds(113, 291, 115, 27);
		contentPane.add(sellingPrice);
		sellingPrice.setColumns(10);

		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 331, 71, 25);
		contentPane.add(lblNewLabel);

		addDate = new JTextField();
		addDate.setBounds(113, 329, 115, 27);
		contentPane.add(addDate);
		addDate.setColumns(10);

		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSave.setBounds(37, 386, 89, 34);
		contentPane.add(btnSave);

		JButton btnCancle = new JButton("Cancle");
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancle.setBounds(168, 386, 89, 34);
		contentPane.add(btnCancle);
		fillCombobox();
	}
}
