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

public class delete_dishes {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_dishes window = new delete_dishes();
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
	public delete_dishes() {
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
		
		JLabel lblDeletedishes = new JLabel("delete_dishes");
		lblDeletedishes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDeletedishes.setBounds(167, 27, 112, 27);
		frame.getContentPane().add(lblDeletedishes);
		
		JLabel lblDishname = new JLabel("dishname");
		lblDishname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDishname.setBounds(10, 85, 80, 27);
		frame.getContentPane().add(lblDishname);
		
		JLabel lblRestname = new JLabel("restname");
		lblRestname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRestname.setBounds(10, 130, 80, 17);
		frame.getContentPane().add(lblRestname);
		
		JLabel lblBranch = new JLabel("branch");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBranch.setBounds(10, 169, 48, 14);
		frame.getContentPane().add(lblBranch);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "dish deleted successfully");
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(167, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(156, 90, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 130, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 169, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}

}
