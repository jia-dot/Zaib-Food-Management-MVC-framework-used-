package def;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CLIENTT  {
	
public static void main(String args[]) throws IOException
	{
	Socket s= new Socket("127.0.0.1",1759);
	OutputStream os=s.getOutputStream();
	DataOutputStream dos=new DataOutputStream(os);
	InputStream is=s.getInputStream();
	DataInputStream dis=new DataInputStream(is);
	
	

	

	//SELLER
	//REGISTER
	//public String sel_register(String name,String email,String password,String cnfrmpas,String type) throws IOException
	//{
		/*Socket s= new Socket("127.0.0.1",1805);
		OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		InputStream is=s.getInputStream();
		DataInputStream dis=new DataInputStream(is);*/
	
	/*String name=JOptionPane.showInputDialog("enter your name");
	String email=JOptionPane.showInputDialog("enter your email");
	String password=JOptionPane.showInputDialog("enter your password");
	String confirmPassword=JOptionPane.showInputDialog("confirm your password");;
	String type=JOptionPane.showInputDialog("enter your type");
	dos.writeUTF(name+","+email+","+password+","+confirmPassword+","+type+","+"sell_register");
	System.out.println(dis.readUTF().toString());*/
	//return dis.readUTF().toString();*/
	
	//}

	//login seller
	
	/*public String Login(String name,String password) throws IOException
	{		Socket s= new Socket("127.0.0.1",1805);
	OutputStream os=s.getOutputStream();
	DataOutputStream dos=new DataOutputStream(os);
	InputStream is=s.getInputStream();
	DataInputStream dis=new DataInputStream(is);*/
	
		/*String name=JOptionPane.showInputDialog("enter your name");
	String password=JOptionPane.showInputDialog("enter your password");
		dos.writeUTF(name+","+password);
		System.out.println(dis.readUTF().toString());*/
		
	//	return dis.readUTF().toString();
		//}
		

	//ADD DISH
	
	//public String addDish(String dishname,String price,String rating,String type,String resname,String branch) throws IOException {
		/*Socket s= new Socket("127.0.0.1",1805);
		OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		InputStream is=s.getInputStream();
		DataInputStream dis=new DataInputStream(is);*/
	/*String dishname=JOptionPane.showInputDialog("Enter dishname:");
	String price=JOptionPane.showInputDialog("Enter dish price:");
	String rating=JOptionPane.showInputDialog("Enter dish rating:");
	String type=JOptionPane.showInputDialog("Enter dish type:");
	String resname=JOptionPane.showInputDialog("Enter restaurant name:");
	String branch=JOptionPane.showInputDialog("Enter restaurant branch:");
	dos.writeUTF(dishname+","+price+","+rating+","+type+","+resname+","+branch);
	System.out.println(dis.readUTF().toString());*/
	//return dis.readUTF().toString();}

	//DELETE DISH
	
	/*String dishname=JOptionPane.showInputDialog("Enter dishname:");
	String resname=JOptionPane.showInputDialog("Enter restaurant name:");
	String branch=JOptionPane.showInputDialog("Enter restaurant branch:");
	dos.writeUTF(dishname+","+resname+","+branch);
	System.out.println(dis.readUTF().toString());*/
	
	//UPDATE PRICE
			
	/*String dishname=JOptionPane.showInputDialog("Enter dishname:");
	String resname=JOptionPane.showInputDialog("Enter restaurant name:");
	String branch=JOptionPane.showInputDialog("Enter branch:");
	String price=JOptionPane.showInputDialog("Enter dish new price:");
	dos.writeUTF(dishname+","+resname+","+branch+","+price);
	System.out.println(dis.readUTF().toString());*/
	
	//see all
	
	System.out.println(dis.readUTF().toString());
	
	//see dishes of particular restaurant
	
	/*String restname=JOptionPane.showInputDialog("Enter restaurant name:");
	dos.writeUTF(restname);
	System.out.println(dis.readUTF().toString());*/
	
	//see restaurant of specific dish
	
	/*String dishname=JOptionPane.showInputDialog("Enter dishname:");
	dos.writeUTF(dishname);
	System.out.println(dis.readUTF().toString());*/
	
	//Admin
	
	//REGISTER
	    /*String name=JOptionPane.showInputDialog("enter your name");
		String email=JOptionPane.showInputDialog("enter your email");
		String password=JOptionPane.showInputDialog("enter your password");
		String confirmPassword=JOptionPane.showInputDialog("confirm your password");;
		String type=JOptionPane.showInputDialog("enter your type");
		dos.writeUTF(name+","+email+","+password+","+confirmPassword+","+type);
		System.out.println(dis.readUTF().toString());*/

		//login 
		/*String name=JOptionPane.showInputDialog("enter your name");
		String password=JOptionPane.showInputDialog("enter your password");
		dos.writeUTF(name+","+password);
		System.out.println(dis.readUTF().toString());*/
	
	    //see_allDishes
	    //System.out.println(dis.readUTF().toString());
	    
	    //see_allUsers
		/*System.out.println(dis.readUTF().toString());*/
		
		//blockUser
		/*String name=JOptionPane.showInputDialog("enter your name");;
		String type=JOptionPane.showInputDialog("enter your type");
		dos.writeUTF(name+","+type);
		System.out.println(dis.readUTF().toString());*/
		
		//allowUser
	    /*String name=JOptionPane.showInputDialog("enter your name");;
		String type=JOptionPane.showInputDialog("enter your type");
		dos.writeUTF(name+","+type);
		System.out.println(dis.readUTF().toString());*/
		
	    //UPDATE RATINGS
	  /*  String dishname=JOptionPane.showInputDialog("Enter dishname:");
		String resname=JOptionPane.showInputDialog("Enter restaurant name:");
		String branch=JOptionPane.showInputDialog("Enter branch:");
		String rating=JOptionPane.showInputDialog("Enter dish new ratings:");
		dos.writeUTF(dishname+","+resname+","+branch+","+rating);
		System.out.println(dis.readUTF().toString());*/
	
	//add restaurant
	 
		/*String resname=JOptionPane.showInputDialog("Enter restaurant name:");
		String branch=JOptionPane.showInputDialog("Enter branch:");
		String foodtypenotsold=JOptionPane.showInputDialog("Enter foodtype not sold by restaurant:");
		String sellerid=JOptionPane.showInputDialog("Enter your id(seller id)");
		dos.writeUTF(resname+","+branch+","+foodtypenotsold+","+sellerid);
		System.out.println(dis.readUTF().toString());*/
		
		//delete restaurant
		/*String resname=JOptionPane.showInputDialog("Enter restaurant name:");
		String branch=JOptionPane.showInputDialog("Enter branch:");
		dos.writeUTF(resname+","+branch);
		System.out.println(dis.readUTF().toString());*/
		
		//returning resources
			dis.close();
			is.close();
			dos.close();
			os.close();
			s.close();

	
	}}
	


//}