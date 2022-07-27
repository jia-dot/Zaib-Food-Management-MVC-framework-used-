package VIEW;
import def.CLIENTT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class component1 implements ActionListener {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JRadioButton rdbtnSeller;
	private JRadioButton rdbtnBuyer;
	private JRadioButton rdbtnAdmin;
	private JButton btnNewButton = new JButton("submit");
	
	CLIENTT c=new CLIENTT();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					component1 window = new component1();
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
	public component1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(146, 25, 119, 39);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(223, 87, 103, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(230, 131, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(56, 90, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(56, 132, 82, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(156, 238, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		rdbtnAdmin = new JRadioButton("admin");
		rdbtnAdmin.addActionListener(this);
		rdbtnAdmin.setBounds(25, 186, 82, 23);
		frame.getContentPane().add(rdbtnAdmin);
		
		rdbtnSeller = new JRadioButton("seller");
		rdbtnSeller.addActionListener(this);
		rdbtnSeller.setBounds(163, 186, 82, 23);
		frame.getContentPane().add(rdbtnSeller);
		
		rdbtnBuyer = new JRadioButton("buyer");
		rdbtnBuyer.addActionListener(this);
		rdbtnBuyer.setBounds(282, 186, 82, 23);
		frame.getContentPane().add(rdbtnBuyer);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String usernameInput=textField.getText();
		String pasInput=textField_1.getText();
	 if(e.getSource().equals(rdbtnAdmin))
	 {
		 if(rdbtnAdmin.isSelected())
			{ rdbtnSeller.setSelected(false);
			  rdbtnBuyer.setSelected(false);
			}
	 }
	
	 if(e.getSource().equals(rdbtnSeller))
	 {if(rdbtnSeller.isSelected())
		{ rdbtnAdmin.setSelected(false);
		  rdbtnBuyer.setSelected(false);
		}
		
		 
	 }
	 if(e.getSource().equals(rdbtnBuyer))
	 {
		 if(rdbtnBuyer.isSelected())
		{ rdbtnAdmin.setSelected(false);
		  rdbtnSeller.setSelected(false);
		}
		 
	 }
	 if(e.getSource().equals(btnNewButton))
	 {String res=new String();
		 if(!textField.getText().isEmpty() && !textField_1.getText().isEmpty())
		 {try
		 {
			 CLIENTT c=new CLIENTT();
			 res=c.Login(textField.getText().toString(),textField_1.getText().toString());
			 }
		 catch(Exception e1)
		 {
			 
		 }
			
	JOptionPane.showMessageDialog(null,res);
	if(rdbtnSeller.isSelected())
	{ 	new S_HOME().frame.setVisible(true);
		}
	if(rdbtnBuyer.isSelected())
	{
		new B_HOME().frame.setVisible(true);
	}
	if(rdbtnAdmin.isSelected())
	{
		new D_HOME().frame.setVisible(true);
	}
	
	}
	 }
	}
}
