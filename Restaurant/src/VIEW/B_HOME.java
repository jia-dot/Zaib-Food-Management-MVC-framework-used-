package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class B_HOME implements ActionListener {

	public JFrame frame;
	JButton btnRegister = new JButton("register");
	JButton btnLogin = new JButton("login");
	JButton btnSeeall = new JButton("seeAll");
	JButton btnSearchdishes = new JButton("searchDishes");
	JButton btnOrderdishes = new JButton("orderDishes");
	JButton btnVieworder = new JButton("viewOrder");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B_HOME window = new B_HOME();
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
	public B_HOME() {
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
		
		JLabel lblBuyer = new JLabel("buyer");
		lblBuyer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBuyer.setBounds(166, 34, 48, 24);
		frame.getContentPane().add(lblBuyer);
		
		
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegister.setBounds(10, 66, 89, 23);
		frame.getContentPane().add(btnRegister);
		btnRegister.addActionListener(this);
		
		
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(10, 112, 89, 23);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);
		
		
		btnSeeall.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSeeall.setBounds(10, 166, 89, 23);
		frame.getContentPane().add(btnSeeall);
		btnSeeall.addActionListener(this);
		
		
		btnSearchdishes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearchdishes.setBounds(269, 166, 129, 23);
		frame.getContentPane().add(btnSearchdishes);
		btnSearchdishes.addActionListener(this);
		
		
		btnOrderdishes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOrderdishes.setBounds(269, 66, 129, 23);
		frame.getContentPane().add(btnOrderdishes);
		btnOrderdishes.addActionListener(this);
		
		btnVieworder.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVieworder.setBounds(269, 112, 117, 23);
		frame.getContentPane().add(btnVieworder);
		btnVieworder.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnVieworder))
		{
			new order().frame.setVisible(true);
		}
		if(e.getSource().equals(btnOrderdishes))
		{
			new order().frame.setVisible(true);
		}
		if(e.getSource().equals(btnSearchdishes))
		{
			new seedishesof().frame.setVisible(true);
		}
		if(e.getSource().equals(btnSeeall))
		{
			new seeAll().frame.setVisible(true);
		}
		if(e.getSource().equals(btnLogin))
		{
			new component1().frame.setVisible(true);
		}
		if(e.getSource().equals(btnRegister))
		{
			new register().frame.setVisible(true);
		}
	}

}
