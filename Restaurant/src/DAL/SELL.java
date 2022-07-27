package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELL{
	Dbhelper db=new Dbhelper();

		public String seller_register(String name, String email, String pwd,String type, String status) 
		{
			String s = "";
			try {
				
				Connection con=db.getconnection();
				Statement stmt=con.createStatement();
				String sql="Select * from loginr where username='"+name+"' and email='"+email+"' and type='"+type+"'";
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next())
				{
					db.closeconnection(con);
					s="Account already exist";
					return s;
				}
				else
				{
					String sql1 = "INSERT INTO loginr (username,email,password,type,status) VALUES ('"+name+"', '"+email+"', '"+pwd+"', '"+type+"', '"+status+"')";
					stmt.executeUpdate(sql1);
					db.closeconnection(con);
					s="Account created successfully";
					return s;
				}
			}catch(Exception e1) {System.out.print(e1);}
			return s;
		}
		
		public String seller_login(String name, String pwd) 
		{;
			String s = "";
			try {
				Connection con=db.getconnection();
				Statement stmt=con.createStatement();
				String sql="Select * from loginr where username='"+name+"' and password='"+pwd+"'" ;
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next())
				{
					db.closeconnection(con);
					s="Login_successfully";
					return s;
				}
				else
				{
					db.closeconnection(con);
					s="Incorrect username or password!";
					return s;
				}
			}catch(Exception e1) {System.out.print(e1);}
			return s;
		}
		public String add_dishes(String dname,double price, double ratings,String type ,String restname, String branch)
		{
			String s="";
			try {
				Connection con=db.getconnection();
				Statement stmt=con.createStatement();
				String sql="Select * from dishesr where dishname='"+dname+"' and restname='"+restname+"' and branch='"+branch+"'" ;
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next())
				{
					db.closeconnection(con);
					s="Dish already present";
					return s;
				}
				else
				{
					String sql1 = "INSERT INTO dishesr (dishname,price,rating,type,restname,branch) VALUES ('"+dname+"', '"+price+"', '"+ratings+"', '"+type+"', '"+restname+"', '"+branch+"')";
					stmt.executeUpdate(sql1);
					db.closeconnection(con);
					s="Dish added successfully";
					return s;
				}
			}catch(Exception e1) {System.out.print(e1);}
			return s;	
			}
		public String delete_dishes(String dname,String restname, String branch)
		{
			String s="";
			try {
				Connection con=db.getconnection();
				Statement stmt=con.createStatement();
				String sql="Select * from dishesr where dishname='"+dname+"' and restname='"+restname+"' and branch='"+branch+"'" ;
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next())
				{
					String sql1 = "DELETE FROM dishesr WHERE dishname='"+dname+"' and restname='"+restname+"' and branch='"+branch+"'";
					stmt.executeUpdate(sql1);
					db.closeconnection(con);
					s="Dish deleted successfully";
					return s;
					
				}
				else
				{
					db.closeconnection(con);
					s="Dish not present";
					return s;
				}
			}catch(Exception e1) {System.out.print(e1);}
			return s;
			}
		public String update_price(String dname,String restname, String branch, double newprice)
		{
			String s="";
			try {
				Connection con=db.getconnection();
				Statement stmt=con.createStatement();
				String sql="Select * from dishesr where dishname='"+dname+"' and restname='"+restname+"' and branch='"+branch+"'";
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next())
				{
					String sql1 = "UPDATE dishesr SET price ='"+newprice+"' WHERE dishname='"+dname+"' and restname='"+restname+"'";
					stmt.executeUpdate(sql1);
					db.closeconnection(con);
					s="price updated successfully";
					return s;
					
				}
				else
				{
					db.closeconnection(con);
					s="Price not updated dish not found";
					return s;
				}
			}catch(Exception e1) {System.out.print(e1);}
			return s;
				
				
			}
		
		public String see_all()
		{
			String strn1 = "";
			
			try {
				Connection con=db.getconnection();
				Statement stmt=con.createStatement();
				String sql="Select * from dishesr";
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next())
				{   String id=rs.getString("id");
					String name=rs.getString("dishname");
					Double price=rs.getDouble("price");
					String p=price.toString();
					Double rating=rs.getDouble("rating");
					String rat=rating.toString();
					String type=rs.getString("type");
					String resname=rs.getString("restname");
					String branch=rs.getString("branch");
					String strn=id+"   "+name+"   "+price+"   "+rating+"   "+type+"   "+resname+"   "+branch+"        ";
					strn1=strn1+strn;
					
					
				}
				
				db.closeconnection(con);
			}catch(Exception e1) {System.out.print(e1);}
			
			return strn1;
		}
		public String seeDishesOf(String restname)
		{String strn1="";
			Connection con;
			try {
				con = db.getconnection();
				Statement stmt=con.createStatement();
				String sql="Select * from dishesr WHERE restname='"+restname+"'";
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next())
				{   String id=rs.getString("id");
					String name=rs.getString("dishname");
					Double price=rs.getDouble("price");
					String p=price.toString();
					Double rating=rs.getDouble("rating");
					String rat=rating.toString();
					String strn=id+" "+name+" "+price+" "+rating;
					strn1 = strn1+strn;
				
				}
				db.closeconnection(con);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return strn1;
			
		}
		public String seeRestaurantOf(String dishname)
		{String strn1="";
			Connection con;
			try {
				con = db.getconnection();
				Statement stmt=con.createStatement();
				String sql="Select * from dishesr WHERE dishname='"+dishname+"'";
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next())
				{   String id=rs.getString("id");
					String name=rs.getString("dishname");
					Double price=rs.getDouble("price");
					String p=price.toString();
					Double rating=rs.getDouble("rating");
					String rat=rating.toString();
					String resname=rs.getString("restname");
					String branch=rs.getString("branch");
					String strn=id+" "+name+" "+price+" "+rating+" "+resname+" "+branch;
					strn1 = strn1+strn;
				
				}
				db.closeconnection(con);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return strn1;
			
		}
}


