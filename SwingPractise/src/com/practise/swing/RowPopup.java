package com.practise.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JTable;

public class RowPopup extends JPopupMenu {
	public RowPopup(JTable table) {
		// create popup item
		JMenuItem add = new JMenuItem("Add");
		JMenuItem edit = new JMenuItem("Edit");
		JMenuItem delete = new JMenuItem("Delete");
		// when add clik
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Added");

			}
		});
		// when edit clik
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Edited");

			}
		});
		// when delete clik
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Deleted");

			}
		});
		// add items popup
		add(add);
		add(edit);
		add(new JSeparator());
		add(delete);
	}

}
