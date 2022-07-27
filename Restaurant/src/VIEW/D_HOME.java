package VIEW;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class D_HOME implements ActionListener {

	public JFrame frame;
	JButton btnRegister;
	JButton btnUpdaterate;
	JButton btnLogin;
	JButton btnSeealldishes;
	JButton btnSeeallusers;
	JButton btnAllowusers;
	JButton btnBlockusers;
	JButton btnAddresturant;
	JButton btnDeleteresturant;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D_HOME window = new D_HOME();
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
	public D_HOME() {
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
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdmin.setBounds(167, 36, 48, 14);
		frame.getContentPane().add(lblAdmin);
		
		JButton btnRegister = new JButton("register");
		btnRegister.setBounds(10, 71, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		btnLogin = new JButton("login");
		btnLogin.setBounds(10, 117, 89, 23);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);
		
		 btnSeealldishes = new JButton("seeallDishes");
		btnSeealldishes.setBounds(10, 216, 110, 23);
		frame.getContentPane().add(btnSeealldishes);
		btnSeealldishes.addActionListener(this);
		
		 btnSeeallusers = new JButton("seeAllUsers");
		btnSeeallusers.setBounds(10, 172, 89, 23);
		frame.getContentPane().add(btnSeeallusers);
		btnSeeallusers.addActionListener(this);
		
		 btnAllowusers = new JButton("allowusers");
		btnAllowusers.setBounds(303, 71, 89, 23);
		frame.getContentPane().add(btnAllowusers);
		btnAllowusers.addActionListener(this);
		
		 btnBlockusers = new JButton("blockusers");
		btnBlockusers.setBounds(303, 117, 89, 23);
		frame.getContentPane().add(btnBlockusers);
		btnBlockusers.addActionListener(this);
		
		 btnAddresturant = new JButton("Add_resturant");
		btnAddresturant.setBounds(303, 172, 121, 23);
		frame.getContentPane().add(btnAddresturant);
		btnAddresturant.addActionListener(this);
		
		 btnDeleteresturant = new JButton("delete_resturant");
		btnDeleteresturant.setBounds(303, 216, 110, 23);
		frame.getContentPane().add(btnDeleteresturant);
		btnDeleteresturant.addActionListener(this);
		
		btnUpdaterate = new JButton("updtae_rate");
		btnUpdaterate.setBounds(151, 227, 127, 23);
		frame.getContentPane().add(btnUpdaterate);
		btnUpdaterate.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(btnUpdaterate))
		{
			new update_rating().frame.setVisible(true);
		}
		if(e.getSource().equals(btnDeleteresturant))
		{
			new delete_dishes().frame.setVisible(true);
		}
		if(e.getSource().equals(btnAddresturant))
		{
			new add_resturant().frame.setVisible(true);
			
		}
		if(e.getSource().equals(btnBlockusers))
		{
			new blockuser().frame.setVisible(true);
		}
		if(e.getSource().equals(btnAllowusers))
		{
			new allowuser().frame.setVisible(true);
		}
		if(e.getSource().equals(btnSeeallusers))
		{
			new seeallusers().frame.setVisible(true);
		}
		if(e.getSource().equals(btnSeealldishes))
		{
			new seealldishes().frame.setVisible(true);
		}
		if(e.getSource().equals(btnLogin))
		{
			new component1().frame.setVisible(true);
		}
	}

}
