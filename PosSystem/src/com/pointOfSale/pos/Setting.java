package com.pointOfSale.pos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

public class Setting extends JFrame {

	private JPanel contentPane;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTextField userName;
	private JTextField password;
	private JTextField catagoryId;
	private JTextField catagoryName;
	private JTextField unitId;
	private JTextField unitName;
	private JComboBox<String> userType;
	Connection connection = null;
	private JTextField address;
	private JTextField emailOrPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting frame = new Setting();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void fillCombobox() {
		try {
			userType.addItem("Admin");
			userType.addItem("Employee");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public void showDataInTable() {
		try {
			String query = "select password,name,address,email_or_phone,usertype from [User]";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table_4.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public void showDataInTable2() {
		try {
			String query = "select * from Catagory";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table_5.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public void showDataInTable3() {
		try {
			String query = "select * from Unit";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table_6.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public Setting() {
		connection = DatabaseConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUser.setBounds(88, 26, 64, 27);
		contentPane.add(lblUser);

		JLabel lblCatagory = new JLabel("Catagory");
		lblCatagory.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCatagory.setBounds(340, 27, 94, 24);
		contentPane.add(lblCatagory);

		JLabel lblUnit = new JLabel("Unit");
		lblUnit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUnit.setBounds(653, 27, 52, 27);
		contentPane.add(lblUnit);

		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit.setBounds(10, 73, 64, 27);
		contentPane.add(btnEdit);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBounds(79, 74, 73, 27);
		contentPane.add(btnDelete);

		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave.setBounds(156, 73, 73, 27);
		contentPane.add(btnSave);

		JButton btnEdit_1 = new JButton("Edit");
		btnEdit_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit_1.setBounds(280, 77, 64, 32);
		contentPane.add(btnEdit_1);

		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete_1.setBounds(354, 77, 73, 32);
		contentPane.add(btnDelete_1);

		JButton btnSave_1 = new JButton("Save");
		btnSave_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave_1.setBounds(436, 77, 64, 32);
		contentPane.add(btnSave_1);

		JButton btnEdit_2 = new JButton("Edit");
		btnEdit_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit_2.setBounds(565, 77, 64, 32);
		contentPane.add(btnEdit_2);

		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete_2.setBounds(636, 75, 73, 32);
		contentPane.add(btnDelete_2);

		JButton btnSave_2 = new JButton("Save");
		btnSave_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave_2.setBounds(719, 77, 64, 32);
		contentPane.add(btnSave_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 114, 219, 143);
		contentPane.add(scrollPane);

		table_4 = new JTable();
		table_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					int row = table_4.getSelectedRow();
					String name = (table_4.getModel().getValueAt(row, 0)).toString();
					String query = "select * from [User] where name='" + name + "'";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						userName.setText(rs.getString("name"));
						password.setText(rs.getString("password"));
						userType.setSelectedItem(rs.getShort("userType"));
						address.setText(rs.getString("address"));
						emailOrPhone.setText(rs.getString("email_or_phone"));
					}
					pst.close();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		scrollPane.setViewportView(table_4);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(280, 120, 220, 137);
		contentPane.add(scrollPane_1);

		table_5 = new JTable();
		scrollPane_1.setViewportView(table_5);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(565, 120, 218, 136);
		contentPane.add(scrollPane_2);

		table_6 = new JTable();
		scrollPane_2.setViewportView(table_6);

		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(10, 269, 79, 24);
		contentPane.add(lblUsername);

		userName = new JTextField();
		userName.setBounds(99, 269, 118, 24);
		contentPane.add(userName);
		userName.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 304, 79, 27);
		contentPane.add(lblPassword);

		password = new JTextField();
		password.setBounds(99, 304, 118, 27);
		contentPane.add(password);
		password.setColumns(10);

		JLabel lblUsertype = new JLabel("UserType");
		lblUsertype.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsertype.setBounds(10, 342, 79, 24);
		contentPane.add(lblUsertype);

		userType = new JComboBox<String>();
		userType.setBounds(99, 346, 118, 20);
		contentPane.add(userType);

		JLabel lblCatagoryid = new JLabel("CatagoryID");
		lblCatagoryid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCatagoryid.setBounds(280, 276, 79, 27);
		contentPane.add(lblCatagoryid);

		catagoryId = new JTextField();
		catagoryId.setBounds(369, 274, 110, 27);
		contentPane.add(catagoryId);
		catagoryId.setColumns(10);

		JLabel lblCatagoryname = new JLabel("CatagoryName");
		lblCatagoryname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCatagoryname.setBounds(280, 315, 103, 27);
		contentPane.add(lblCatagoryname);

		catagoryName = new JTextField();
		catagoryName.setBounds(393, 317, 107, 27);
		contentPane.add(catagoryName);
		catagoryName.setColumns(10);

		JLabel lblUnitid = new JLabel("UnitID");
		lblUnitid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUnitid.setBounds(565, 276, 52, 27);
		contentPane.add(lblUnitid);

		unitId = new JTextField();
		unitId.setBounds(636, 269, 118, 32);
		contentPane.add(unitId);
		unitId.setColumns(10);

		JLabel lblUnitname = new JLabel("UnitName");
		lblUnitname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUnitname.setBounds(565, 312, 73, 27);
		contentPane.add(lblUnitname);

		unitName = new JTextField();
		unitName.setBounds(653, 311, 101, 27);
		contentPane.add(unitName);
		unitName.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "insert into [User](password,name,address,email_or_phone,userType)values(?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, password.getText());
					pst.setString(2, userName.getText());
					pst.setString(3, address.getText());
					pst.setString(4, emailOrPhone.getText());
					pst.setString(5, (String) userType.getSelectedItem());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Save");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnAdd.setBounds(227, 365, 89, 23);
		contentPane.add(btnAdd);

		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "insert into Catagory(catagoryName)values(?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, catagoryName.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data save");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnAdd_1.setBounds(393, 365, 89, 23);
		contentPane.add(btnAdd_1);

		JButton btnAdd_2 = new JButton("Add");
		btnAdd_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "insert into Unit(unitName)values(?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, unitName.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data save");
				} catch (Exception n) {
					JOptionPane.showMessageDialog(null, n);
				}
			}
		});
		btnAdd_2.setBounds(636, 387, 89, 23);
		contentPane.add(btnAdd_2);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddress.setBounds(10, 377, 64, 24);
		contentPane.add(lblAddress);

		address = new JTextField();
		address.setBounds(98, 377, 119, 20);
		contentPane.add(address);
		address.setColumns(10);

		JLabel lblEmail = new JLabel("EmailOrPhone");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(10, 412, 91, 20);
		contentPane.add(lblEmail);

		emailOrPhone = new JTextField();
		emailOrPhone.setBounds(111, 411, 118, 27);
		contentPane.add(emailOrPhone);
		emailOrPhone.setColumns(10);
		fillCombobox();
		showDataInTable();
		showDataInTable2();
		showDataInTable3();

	}
}
