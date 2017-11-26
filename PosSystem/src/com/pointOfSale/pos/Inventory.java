package com.pointOfSale.pos;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 481);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnProducts = new JMenu("Products");
		menuBar.add(mnProducts);

		JMenu mnStockFlow = new JMenu("Stock Flow");
		menuBar.add(mnStockFlow);

		JMenu mnBack = new JMenu("Back");
		menuBar.add(mnBack);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(26, 11, 57, 25);
		contentPane.add(lblSearch);

		textField = new JTextField();
		textField.setBounds(93, 11, 105, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(219, 13, 78, 20);
		contentPane.add(comboBox);

		JLabel lblNewLabel = new JLabel("Filter:");
		lblNewLabel.setBounds(319, 16, 66, 20);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setBounds(395, 13, 105, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(510, 12, 66, 23);
		contentPane.add(btnAdd);

		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(586, 12, 66, 23);
		contentPane.add(btnEdit);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(662, 12, 66, 23);
		contentPane.add(btnDelete);

		JButton btnSave = new JButton("Save");
		btnSave.setBounds(738, 12, 66, 23);
		contentPane.add(btnSave);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 826, 213);
		contentPane.add(scrollPane);

		table_2 = new JTable();
		scrollPane.setViewportView(table_2);

		JLabel lblArticle = new JLabel("Article:");
		lblArticle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblArticle.setBounds(10, 303, 57, 25);
		contentPane.add(lblArticle);

		textField_2 = new JTextField();
		textField_2.setBounds(77, 303, 121, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblQuntity = new JLabel("Quntity:");
		lblQuntity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuntity.setBounds(10, 339, 73, 20);
		contentPane.add(lblQuntity);

		textField_3 = new JTextField();
		textField_3.setBounds(93, 339, 105, 23);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblBuyingprice = new JLabel("BuyingPrice:");
		lblBuyingprice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBuyingprice.setBounds(10, 384, 105, 26);
		contentPane.add(lblBuyingprice);

		textField_4 = new JTextField();
		textField_4.setBounds(125, 384, 105, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblCatagory = new JLabel("Catagory:");
		lblCatagory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCatagory.setBounds(290, 303, 86, 25);
		contentPane.add(lblCatagory);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(386, 303, 105, 25);
		contentPane.add(comboBox_1);

		JLabel lblUnit = new JLabel("Unit:");
		lblUnit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUnit.setBounds(300, 345, 57, 25);
		contentPane.add(lblUnit);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(386, 339, 105, 31);
		contentPane.add(comboBox_2);

		JLabel lblSellingprice = new JLabel("SellingPrice:");
		lblSellingprice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSellingprice.setBounds(290, 384, 95, 23);
		contentPane.add(lblSellingprice);

		textField_5 = new JTextField();
		textField_5.setBounds(396, 384, 105, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDescription.setBounds(541, 303, 95, 25);
		contentPane.add(lblDescription);

		textField_6 = new JTextField();
		textField_6.setBounds(646, 294, 136, 31);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblRegisterDate = new JLabel("Register Date:");
		lblRegisterDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRegisterDate.setBounds(541, 345, 121, 25);
		contentPane.add(lblRegisterDate);

		textField_7 = new JTextField();
		textField_7.setBounds(672, 342, 110, 31);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblUpdateDate = new JLabel("Update Date:");
		lblUpdateDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUpdateDate.setBounds(541, 390, 111, 20);
		contentPane.add(lblUpdateDate);

		textField_8 = new JTextField();
		textField_8.setBounds(672, 384, 110, 26);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

	}
}
