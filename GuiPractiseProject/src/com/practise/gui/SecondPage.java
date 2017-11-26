package com.practise.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

public class SecondPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JComboBox comboBoxName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondPage frame = new SecondPage();
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
	Connection connection = null;

	public void fillComboBox() {
		try {
			String qurey = "select*from member";
			PreparedStatement pst = connection.prepareStatement(qurey);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				comboBoxName.addItem(rs.getString("MemberId"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public void refreshTable() {
		try {
			String query = "select * from member";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	private JTextField memberId;
	private JTextField memberName;
	private JTextField password;

	public SecondPage() {
		connection = SqlConnection.getConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton show = new JButton("Show");
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from member";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		show.setBounds(200, 21, 89, 23);
		contentPane.add(show);

		table = new JTable();
		table.setBounds(175, 112, 83, 0);
		contentPane.add(table);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(155, 62, 415, 143);
		contentPane.add(scrollPane);

		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					int row = table_1.getSelectedRow();
					String mId = (table_1.getModel().getValueAt(row, 0).toString());
					String qurey = "select * from member where MemberId='" + mId + "'";
					PreparedStatement pst = connection.prepareStatement(qurey);
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						memberId.setText(rs.getString("MemberId"));
						memberName.setText(rs.getString("UserName"));
						password.setText(rs.getString("UserPassword"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		scrollPane.setViewportView(table_1);

		JLabel lblMemberId = new JLabel("Member Id");
		lblMemberId.setBounds(26, 25, 62, 14);
		contentPane.add(lblMemberId);

		memberId = new JTextField();
		memberId.setBounds(10, 50, 86, 20);
		contentPane.add(memberId);
		memberId.setColumns(10);

		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(26, 98, 62, 14);
		contentPane.add(lblUsername);

		memberName = new JTextField();
		memberName.setBounds(10, 132, 86, 20);
		contentPane.add(memberName);
		memberName.setColumns(10);

		JLabel lblUserpassword = new JLabel("UserPassword");
		lblUserpassword.setBounds(10, 171, 78, 14);
		contentPane.add(lblUserpassword);

		password = new JTextField();
		password.setBounds(10, 214, 86, 20);
		contentPane.add(password);
		password.setColumns(10);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "insert into member(MemberId,UserName,UserPassword)values(?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, memberId.getText());
					pst.setString(2, memberName.getText());
					pst.setString(3, password.getText());
					// ResultSet rs = pst.executeQuery();
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Insert");
					refreshTable();

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnSave.setBounds(7, 261, 89, 23);
		contentPane.add(btnSave);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "delete from member where MemberId='" + memberId.getText() + "'";
					PreparedStatement pst = connection.prepareStatement(query);

					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Delete");
					refreshTable();

				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}
		});
		btnDelete.setBounds(10, 294, 89, 23);
		contentPane.add(btnDelete);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String qurey = "update  member set UserName='" + memberName.getText() + "',UserPassword='"
							+ password.getText() + "' where MemberId='" + memberId.getText() + "'";
					PreparedStatement pst = connection.prepareStatement(qurey);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Update");
					refreshTable();
				} catch (Exception g) {
					JOptionPane.showMessageDialog(null, g);
				}
			}
		});
		btnUpdate.setBounds(10, 328, 89, 23);
		contentPane.add(btnUpdate);

		comboBoxName = new JComboBox();
		comboBoxName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String qurey = "select * from member where MemberId=?";
					PreparedStatement pst = connection.prepareStatement(qurey);
					pst.setString(1, (String) comboBoxName.getSelectedItem());
					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						memberId.setText(rs.getString("MemberId"));
						memberName.setText(rs.getString("UserName"));
						password.setText(rs.getString("UserPassword"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		comboBoxName.setBounds(350, 22, 71, 20);
		contentPane.add(comboBoxName);

		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(168, 243, 308, 160);
		contentPane.add(list);

		JButton showJlist = new JButton("JList");
		showJlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel DLM = new DefaultListModel();
				DLM.addElement("Rabbi");
				DLM.addElement("Rabbi");
				DLM.addElement("Rabbi");
				list.setModel(DLM);
			}
		});
		showJlist.setBounds(535, 307, 89, 23);
		contentPane.add(showJlist);
		fillComboBox();
	}
}
