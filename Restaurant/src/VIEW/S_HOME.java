package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class S_HOME  implements ActionListener{

	public JFrame frame;
	JButton btnRegister = new JButton("register");
	JButton btnLogin = new JButton("login");
	JButton btnAdddishes = new JButton("add_dishes");
	JButton btnDeletedishes = new JButton("delete_dishes");
	JButton btnUpdatePrice = new JButton("update price");
	JButton btnSeeall = new JButton("seeAll");
	JButton btnSeedishesof = new JButton("seeDishesof");
	JButton btnSeeresturantof = new JButton("seeResturantOf");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S_HOME window = new S_HOME();
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
	public S_HOME() {
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
		
		JLabel lblSeller = new JLabel("seller");
		lblSeller.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSeller.setBounds(165, 32, 48, 14);
		frame.getContentPane().add(lblSeller);
		
		
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBounds(10, 74, 89, 23);
		frame.getContentPane().add(btnRegister);
		btnRegister.addActionListener(this);
		
		
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(10, 120, 89, 23);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);
		
		
		btnAdddishes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdddishes.setBounds(10, 172, 119, 23);
		frame.getContentPane().add(btnAdddishes);
		btnAdddishes.addActionListener(this);
		
		
		btnDeletedishes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDeletedishes.setBounds(10, 212, 134, 23);
		frame.getContentPane().add(btnDeletedishes);
		btnDeletedishes.addActionListener(this);
		
		
		btnUpdatePrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUpdatePrice.setBounds(255, 172, 140, 23);
		frame.getContentPane().add(btnUpdatePrice);
		btnUpdatePrice.addActionListener(this);
		
		
		btnSeeall.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeeall.setBounds(255, 74, 89, 23);
		frame.getContentPane().add(btnSeeall);
		btnSeeall.addActionListener(this);
		
		
		btnSeedishesof.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSeedishesof.setBounds(255, 120, 119, 23);
		frame.getContentPane().add(btnSeedishesof);
		btnSeedishesof.addActionListener(this);
		
		
		btnSeeresturantof.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSeeresturantof.setBounds(255, 212, 130, 23);
		frame.getContentPane().add(btnSeeresturantof);
		btnSeeresturantof.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnRegister))
		{
			new register().frame.setVisible(true);
		}
		if(e.getSource().equals(btnLogin))
		{
			new component1().frame.setVisible(true);
		}
		if(e.getSource().equals(btnAdddishes))
		{
			new Add_dishes().frame.setVisible(true);
		}
		if(e.getSource().equals(btnDeletedishes))
		{
			new delete_dishes().frame.setVisible(true);
		}
		if(e.getSource().equals(btnUpdatePrice))
		{
			new update_p().frame.setVisible(true);
		}
		if(e.getSource().equals(btnSeeall))
		{
			new seeAll().frame.setVisible(true);
		}
		if(e.getSource().equals(btnSeedishesof))
		{
			new seedishesof().frame.setVisible(true);
		}
		if(e.getSource().equals(btnSeeresturantof))
		{
			new seeRestaurantOf().frame.setVisible(true);
		}
	}

}
