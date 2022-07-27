package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class del_resturant {

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
					del_resturant window = new del_resturant();
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
	public del_resturant() {
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
		
		JLabel lblDeleteresturant = new JLabel("deleteresturant");
		lblDeleteresturant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDeleteresturant.setBounds(171, 23, 105, 14);
		frame.getContentPane().add(lblDeleteresturant);
		
		JLabel lblRestname = new JLabel("restname");
		lblRestname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRestname.setBounds(31, 90, 105, 26);
		frame.getContentPane().add(lblRestname);
		
		JLabel lblBranch = new JLabel("branch");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBranch.setBounds(37, 147, 80, 14);
		frame.getContentPane().add(lblBranch);
		
		textField = new JTextField();
		textField.setBounds(180, 95, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 146, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(187, 212, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
}
