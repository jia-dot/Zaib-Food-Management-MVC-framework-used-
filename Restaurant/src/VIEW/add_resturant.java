package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class add_resturant  implements ActionListener{

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
					add_resturant window = new add_resturant();
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
	public add_resturant() {
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
		
		JLabel lblAddresturant = new JLabel("add_resturant");
		lblAddresturant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddresturant.setBounds(150, 44, 98, 20);
		frame.getContentPane().add(lblAddresturant);
		
		JLabel lblResname = new JLabel("resname");
		lblResname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResname.setBounds(34, 83, 98, 19);
		frame.getContentPane().add(lblResname);
		
		JLabel lblBranch = new JLabel("branch");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBranch.setBounds(39, 134, 48, 14);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblFoodtypenotsold = new JLabel("foodtypenotsold");
		lblFoodtypenotsold.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFoodtypenotsold.setBounds(34, 168, 124, 32);
		frame.getContentPane().add(lblFoodtypenotsold);
		
		textField = new JTextField();
		textField.setBounds(192, 84, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 133, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(192, 189, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(320, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
