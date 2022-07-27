package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class BuyerD {
			public String buyer_register(String n, String e, String p) 
			{
				String s = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reslogin","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from loginuser where name='"+n+"' and email='"+e+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
						con.close();
						s="Account_already_exist";
						return s;
					}
					else
					{
						String sql1 = "INSERT INTO loginuser (name,email,password) VALUES ('"+n+"', '"+e+"', '"+p+"')";
						stmt.executeUpdate(sql1);
						con.close();
						s="Account_created_successfully";
						return s;
					}
				}catch(Exception e1) {System.out.print(e1);}
				return s;
			}
			
			public String buyer_login(String n, String p) 
			{
				String s = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reslogin","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from loginuser where name='"+n+"' and password='"+p+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
						con.close();
						s="Login_successfully";
						return s;
					}
					else
					{
						con.close();
						s="Incorrect_username_or_password!";
						return s;
					}
				}catch(Exception e1) {System.out.print(e1);}
				return s;
			}
			public String see_all()
			{String strin3=null;
				String strin4=null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reslogin","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from dishest";
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next())
					{   String id=rs.getString("id");
						String name=rs.getString("dishname");
						String price=rs.getString("price");
						String resname=rs.getString("restname");
						String rating=rs.getString("rating");
						String strin2=id+name+price+resname+rating;
						strin3=strin3+strin2;
						strin4=strin3+"\n";
						
					}
					
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
				
				return strin4;
			}
			public String search_dish(String dishName)
			{
				String strin3=null;
				String strin4=null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reslogin","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from dishest WHERE dishname='"+dishName+"'";
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next())
					{   String id=rs.getString("id");
						String name=rs.getString("dishname");
						String price=rs.getString("price");
						String resname=rs.getString("restname");
						String rating=rs.getString("rating");
						String strin2=id+name+price+resname+rating;
						strin3=strin3+strin2;
						strin4=strin3+"\n";
						
					}
					
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
				
				return strin4;
			}
			public String order_dish(String dishname,String quantity,String dishprice,String buyerId )
			{
				String s=null;
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reslogin","root","");
					Statement stmt=con.createStatement();
					String sql = "INSERT INTO orders (dishname,quantity,price,buyerId) VALUES ('"+dishname+"', '"+quantity+"','"+dishprice+"','"+buyerId+"')";
					stmt.executeUpdate(sql);
					con.close();
					s="Order_added_successfully";
					return s;
				}catch(Exception e1) {System.out.print(e1);}
				
				return s;
			}
			public String viewOrder(String buyerid)
			{
				String strin3=null;
				String strin4=null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reslogin","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from orders where buyer_id='"+buyerid+"'";
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next())
					{   String id=rs.getString("id");
						String name=rs.getString("dishname");
						String quantity=rs.getString("quantity");
						String price=rs.getString("price");
						String strin2=id+name+quantity+price;
						strin3=strin3+strin2;
						strin4=strin3+"\n";
						
					}
					
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
				
				return strin4;
			}

			
	
		}


