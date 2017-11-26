import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame1 {

	private JFrame frame;
	private JTextField tfOne;
	private JTextField tfTwo;
	private JTextField tfthree;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblThirdNumber;
	private JButton btnNewButton_1;
	private JLabel lbl;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnDivision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 520, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblResult = new JLabel("Result");
		lblResult.setForeground(Color.MAGENTA);
		lblResult.setBackground(new Color(240, 240, 240));
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double one =Double.parseDouble(tfOne.getText()) ;
				double two =Double.parseDouble(tfTwo.getText()) ;
				double three=Double.parseDouble(tfthree.getText());
				double c = one+two+three; 
			    String result = String.valueOf(c);
			    
			    lblResult.setText("Sum Of All Value:"+result);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(309, 212, 185, 49);
		frame.getContentPane().add(btnNewButton);
		
		tfOne = new JTextField();
		tfOne.setBounds(139, 2, 86, 20);
		frame.getContentPane().add(tfOne);
		tfOne.setColumns(10);
		
		tfTwo = new JTextField();
		tfTwo.setBounds(139, 48, 86, 20);
		frame.getContentPane().add(tfTwo);
		tfTwo.setColumns(10);
		
		
		lblResult.setBounds(13, 212, 227, 38);
		frame.getContentPane().add(lblResult);
		
		tfthree = new JTextField();
		tfthree.setBounds(139, 99, 86, 20);
		frame.getContentPane().add(tfthree);
		tfthree.setColumns(10);
		
		lblNewLabel = new JLabel("First Number:");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(13, -4, 116, 28);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Second Number:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(13, 37, 116, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblThirdNumber = new JLabel("Third Number:");
		lblThirdNumber.setForeground(Color.BLUE);
		lblThirdNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThirdNumber.setBounds(13, 93, 116, 28);
		frame.getContentPane().add(lblThirdNumber);
		
		btnNewButton_1 = new JButton("Show Massage ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "HI,I am Rabbi");
				lbl.setText("HI,Rabbi");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(187, 276, 146, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		lbl = new JLabel("Text");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl.setForeground(Color.RED);
		lbl.setBounds(85, 355, 171, 43);
		frame.getContentPane().add(lbl);
		
		btnNewButton_2 = new JButton("Subtraction");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double one =Double.parseDouble(tfOne.getText()) ;
				double two =Double.parseDouble(tfTwo.getText()) ;
				//double three=Double.parseDouble(tfthree.getText());
				 if(two>one){
					 double temp=0;
					 temp=two;
					 two=one;
					 one=temp;
					 double d=one-two;
					 String result = String.valueOf(d);
					 lblResult.setText("Subtraction:"+result);
				 }
				 else{
					 double d=one-two;
					 String result = String.valueOf(d);
					 lblResult.setText("Subtraction:"+result);
				 }
			    
			    
			    
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setForeground(Color.MAGENTA);
		btnNewButton_2.setBounds(309, 152, 185, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Multiple");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double one =Double.parseDouble(tfOne.getText()) ;
				double two =Double.parseDouble(tfTwo.getText()) ;
				double three=Double.parseDouble(tfthree.getText());
				double c = one*two*three; 
			    String result = String.valueOf(c);
			    
			    lblResult.setText("Multiplication Value:"+result);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBounds(310, 81, 184, 52);
		frame.getContentPane().add(btnNewButton_3);
		
		btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double one =Double.parseDouble(tfOne.getText()) ;
				double two =Double.parseDouble(tfTwo.getText()) ;
				//double three=Double.parseDouble(tfthree.getText());
				//double c = one+two+three;
				
				if(two>one){
					
					double c=two/one;
					 String result = String.valueOf(c);
					    
					    lblResult.setText("Divied Value:"+result);
				}
				else{
					double c=one/two;
					  String result = String.valueOf(c);
					    
					    lblResult.setText("Divied Value:"+result);
				}
			  
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDivision.setForeground(Color.PINK);
		btnDivision.setBounds(309, 19, 185, 49);
		frame.getContentPane().add(btnDivision);
	}
}
