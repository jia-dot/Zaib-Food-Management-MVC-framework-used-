package def;
import java.net.*;

import DAL.BuyerD;

import java.io.*;
public class ClientHandler extends Thread {
	final Socket s;
	DataInputStream dis;
	DataOutputStream dos;

	public ClientHandler(Socket s,DataInputStream dis,DataOutputStream dos)
	{
		this.s=s;
		this.dis=dis;
		this.dos=dos;
	}
	public void run()
	{try
	{String recieve="";
	String res="";
	Controller cont=new Controller();
	//seller register
		/*recieve=new String(dis.readUTF());
		String[] recieve2=recieve.split(",");
		if(recieve2[5].equals("sell_register"))
		{String sts="allowed";
			res=cont.Register(recieve2[0],recieve2[1],recieve2[2],recieve2[3],recieve2[4],sts);
			System.out.println(res);
			dos.writeUTF(res);
		}*/
	
	//login(SELLER)
	
			/*recieve=new String(dis.readUTF());
			String[] recieve2=recieve.split(",");
		res=cont.Login(recieve2[0],recieve2[1]);
		dos.writeUTF(res);*/
		
		//ADD DISH (SELLER)
		
				/*recieve=new String(dis.readUTF());
				 String[] recieve2=recieve.split(",");
				double price=Double.parseDouble(recieve2[1]);
				double rating=Double.parseDouble(recieve2[2]);
				res=cont.addDish(recieve2[0],price,rating,recieve2[3],recieve2[4],recieve2[5]);
				dos.writeUTF(res);*/
			
				//DELETE DISH(SELLER)
				
				/*recieve=new String(dis.readUTF());
				String[] recieve2=recieve.split(",");
				res=cont.delete_dish(recieve2[0],recieve2[1],recieve2[2]);
				dos.writeUTF(res);*/
			
				//UPDATE PRICE (SELLER)
				
				/*recieve=new String(dis.readUTF());
				String[] recieve2=recieve.split(",");
			    double price=Double.parseDouble(recieve2[3]);
				res=cont.update_price(recieve2[0],recieve2[1],recieve2[2],price);
				dos.writeUTF(res);*/
			
				//see all
				
				res=cont.see_all();
				dos.writeUTF(res);
				
				//see dishes of restaurant name
				
				/*recieve=new String(dis.readUTF());
				res=cont.seeDishesOf(recieve);
				dos.writeUTF(res);*/
				
				//see all restaurant on dish name
				
				/*recieve=new String(dis.readUTF());
				res=cont.seeRestaurantOf(recieve);
				dos.writeUTF(res);*/
				
				//Admin
				//Registration
				
			    /*recieve=new String(dis.readUTF());
				String sts="allowed";
				String[] recieve2=recieve.split(",");
			    res=cont.Register(recieve2[0],recieve2[1],recieve2[2],recieve2[3],recieve2[4],sts);
				dos.writeUTF(res);*/
						
				//login
						
				/*recieve=new String(dis.readUTF());
				String[] recieve2=recieve.split(",");
				res=cont.Login(recieve2[0],recieve2[1]);
				dos.writeUTF(res);*/
				
				//seealldishes
				/*res=cont.see_allDishes();
				dos.writeUTF(res);*/
				
				//see allusers
				/*res=cont.see_allUsers();
				dos.writeUTF(res);*/
				
				//blockuser  
				/*recieve=new String(dis.readUTF());
				String[] recieve2=recieve.split(",");
			    res=cont.blockUser(recieve2[0],recieve2[1]);
				dos.writeUTF(res);*/
				
				//allow user
				/*recieve=new String(dis.readUTF());
				String[] recieve2=recieve.split(",");
			    res=cont.allowUser(recieve2[0],recieve2[1]);
				dos.writeUTF(res);*/
				
				//UPDATE RATINGS 
				 /* recieve=new String(dis.readUTF());
				  String[] recieve2=recieve.split(",");
				  double rating=Double.parseDouble(recieve2[3]);
				  res=cont.update_rating(recieve2[0],recieve2[1],recieve2[2],rating);
				  dos.writeUTF(res);*/
				
				//Add restaurant
				  /*recieve=new String(dis.readUTF());
				  String[] recieve2=recieve.split(",");
				  int id=Integer.parseInt(recieve2[3]);
				  res=cont.addRestaurant(recieve2[0],recieve2[1],recieve2[2],id);
				  dos.writeUTF(res);*/
				
				//delete restaurant
				/*recieve=new String(dis.readUTF());
				String[] recieve2=recieve.split(",");
			    res=cont.deleteRestaurant(recieve2[0],recieve2[1]);
				dos.writeUTF(res);*/
		dos.close();
		dis.close();
		s.close();
		
		}
	catch(Exception e)
	{
		// TODO Auto-generated catch block
					e.printStackTrace();
	}
	
	}
}