import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField tfone;
	private JTextField tftwo;
	private JTextField tfans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
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
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfone = new JTextField();
		tfone.setBounds(25, 24, 131, 45);
		frame.getContentPane().add(tfone);
		tfone.setColumns(10);
		
		tftwo = new JTextField();
		tftwo.setBounds(233, 24, 131, 45);
		frame.getContentPane().add(tftwo);
		tftwo.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(tfone.getText());
					num2=Integer.parseInt(tftwo.getText());
					ans=num1+num2;
					tfans.setText(Integer.toString(ans));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setBounds(22, 128, 134, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sub");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(tfone.getText());
					num2=Integer.parseInt(tftwo.getText());
					ans=num1-num2;
					tfans.setText(Integer.toString(ans));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(233, 128, 131, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		tfans = new JTextField();
		tfans.setBounds(233, 211, 131, 39);
		frame.getContentPane().add(tfans);
		tfans.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The answer is:");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(136, 210, 127, 39);
		frame.getContentPane().add(lblNewLabel);
	}
}
