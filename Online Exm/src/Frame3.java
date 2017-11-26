import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
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
	public Frame3() {
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
		
		JLabel lblUsername = new JLabel("UserName :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(46, 42, 91, 26);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(147, 47, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(46, 95, 91, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 100, 139, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLoging = new JButton("Loging");
		btnLoging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String username=textField.getText();
					String password=textField_1.getText();
					if(username.equals("Rabbi") && password.equals("01681194424")){
						frame.dispose();
						Frame4 f=new Frame4();
					    f.setVisible(true);
					}
					
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnLoging.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLoging.setBounds(123, 164, 89, 23);
		frame.getContentPane().add(btnLoging);
	}
}
