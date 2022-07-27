package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class update_rating {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update_rating window = new update_rating();
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
	public update_rating() {
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
		
		JLabel lblNewLabel = new JLabel("update_rating");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(170, 38, 103, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDname = new JLabel("dname");
		lblDname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDname.setBounds(10, 85, 48, 14);
		frame.getContentPane().add(lblDname);
		
		JLabel lblRestname = new JLabel("restname");
		lblRestname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRestname.setBounds(10, 121, 87, 17);
		frame.getContentPane().add(lblRestname);
		
		JLabel lblBranch = new JLabel("branch");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBranch.setBounds(10, 161, 48, 14);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblRatings = new JLabel("ratings");
		lblRatings.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRatings.setBounds(10, 199, 48, 19);
		frame.getContentPane().add(lblRatings);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		     JOptionPane.showMessageDialog(null, "rating updated");
			}
			
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(318, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(145, 84, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 121, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 160, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(145, 198, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}

}
