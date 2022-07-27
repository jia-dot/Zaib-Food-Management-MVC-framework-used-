package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class allowuser {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allowuser window = new allowuser();
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
	public allowuser() {
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
		
		JLabel lblAllowuser = new JLabel("allowuser");
		lblAllowuser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAllowuser.setBounds(170, 26, 98, 14);
		frame.getContentPane().add(lblAllowuser);
		
		JLabel lblName = new JLabel("name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(29, 87, 98, 24);
		frame.getContentPane().add(lblName);
		
		JLabel lblNewLabel = new JLabel("type");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(29, 142, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(170, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(151, 91, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 158, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

}
