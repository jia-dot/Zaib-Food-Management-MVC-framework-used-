package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import def.CLIENTT;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Add_dishes implements ActionListener{

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JButton btnSubmit = new JButton("submit");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_dishes window = new Add_dishes();
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
	public Add_dishes() {
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
		
		JLabel lblRegisterdish = new JLabel("add_dishes");
		lblRegisterdish.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRegisterdish.setBounds(147, 11, 100, 25);
		frame.getContentPane().add(lblRegisterdish);
		
		JLabel lblDishName = new JLabel("dish name");
		lblDishName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDishName.setBounds(10, 59, 91, 14);
		frame.getContentPane().add(lblDishName);
		
		JLabel lblPrice = new JLabel("price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrice.setBounds(10, 84, 48, 25);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRating = new JLabel("rating");
		lblRating.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRating.setBounds(10, 115, 48, 25);
		frame.getContentPane().add(lblRating);
		
		JLabel lblType = new JLabel("type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblType.setBounds(10, 144, 48, 25);
		frame.getContentPane().add(lblType);
		
		JLabel lblRestname = new JLabel("restname");
		lblRestname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRestname.setBounds(10, 180, 67, 25);
		frame.getContentPane().add(lblRestname);
		
		JLabel lblBranch = new JLabel("branch");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBranch.setBounds(10, 216, 48, 14);
		frame.getContentPane().add(lblBranch);
		
		textField = new JTextField();
		textField.setBounds(151, 58, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 88, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(151, 119, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(151, 153, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(151, 184, 96, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(151, 215, 96, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		
		btnSubmit.addActionListener(this);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnSubmit))
		{String concl=new String();
			CLIENTT c=new CLIENTT();
		try {
			 concl=c.addDish(textField.getText().toString(), textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString(),textField_4.getText().toString(),textField_4.getText().toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			JOptionPane.showMessageDialog(null, concl);
		}
	}

}
