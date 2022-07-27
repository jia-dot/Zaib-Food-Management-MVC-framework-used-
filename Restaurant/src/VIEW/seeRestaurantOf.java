package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class seeRestaurantOf {

	 JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seeRestaurantOf window = new seeRestaurantOf();
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
	public seeRestaurantOf() {
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
		
		JLabel lblSeerestaurantof = new JLabel("seeRestaurantOf");
		lblSeerestaurantof.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSeerestaurantof.setBounds(157, 28, 120, 25);
		frame.getContentPane().add(lblSeerestaurantof);
		
		JLabel lblDishname = new JLabel("dishname");
		lblDishname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDishname.setBounds(25, 90, 84, 17);
		frame.getContentPane().add(lblDishname);
		
		textField = new JTextField();
		textField.setBounds(157, 90, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(169, 180, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}

}
