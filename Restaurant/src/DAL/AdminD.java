package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminD {
	Dbhelper db=new Dbhelper();
	
	public String admin_register(String name, String email, String pwd,String type, String status) 
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
	
	public String admin_login(String name, String pwd) 
	{String s = "";
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
	public String see_allDishes()
	{String strn1 = "";
	
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
	public String see_allUsers()
	{
		String strn1 = "";
		
		try {
			Connection con=db.getconnection();
			Statement stmt=con.createStatement();
			String sql="Select * from loginr";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{   String id=rs.getString("id");
				String name=rs.getString("username");
				String email=rs.getString("email");
				String type=rs.getString("type");
				String strn=id+"  "+name+"  "+email+"  "+type+"     ";
				strn1=strn1+strn;
				
			}
			
		db.closeconnection(con);
		}catch(Exception e1) {System.out.print(e1);}
		
		return strn1;
	}
public String blockUser(String name,String type) {
	String s="";
	String block="blocked";
	try {
		Connection con=db.getconnection();
		Statement stmt=con.createStatement();
		String sql="Select * from loginr where username='"+name+"' and type='"+type+"'";
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			String sql1 = "UPDATE loginr SET status ='"+block+"' where username='"+name+"' and type='"+type+"'";
			stmt.executeUpdate(sql1);
			db.closeconnection(con);
			s="user blocked successfully";
			return s;
			
		}
		else
		{
			db.closeconnection(con);
			s="failure in blocking user";
			return s;
		}
	}catch(Exception e1) {System.out.print(e1);}
	return s;
		
		
}
public String allowUser(String name,String type) {
	String s="";
	String allowed="Allowed";
	try {
		Connection con=db.getconnection();
		Statement stmt=con.createStatement();
		String sql="Select * from loginr where username='"+name+"' and type='"+type+"'";
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			String sql1 = "UPDATE loginr SET status ='"+allowed+"' where username='"+name+"' and type='"+type+"'";
			stmt.executeUpdate(sql1);
			db.closeconnection(con);
			s="user unblocked successfully";
			return s;
			
		}
		else
		{
			db.closeconnection(con);
			s="failure in unblocking user";
			return s;
		}
	}catch(Exception e1) {System.out.print(e1);}
	return s;
}
public String update_rating(String dname,String restname, String branch, double ratings)
{
	String s="";
	try {
		Connection con=db.getconnection();
		Statement stmt=con.createStatement();
		String sql="Select * from dishesr where dishname='"+dname+"' and restname='"+restname+"'";
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			String sql1 = "UPDATE dishesr SET rating ='"+ratings+"' WHERE dishname='"+dname+"' and restname='"+restname+"'";
			stmt.executeUpdate(sql1);
			db.closeconnection(con);
			s="ratings updated successfully";
			return s;
			
		}
		else
		{
			db.closeconnection(con);
			s="Ratings not updated dish not found";
			return s;
		}
	}catch(Exception e1) {System.out.print(e1);}
	return s;
		
		
}
public String addRestaurant(String resname,String branch ,String foodtypenotsold, int sellerid)
{
	String s="";
	try {
		Connection con=db.getconnection();
		Statement stmt=con.createStatement();
		String sql="Select * from restaurants where restaurantname='"+resname+"' and branch='"+branch+"'" ;
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			db.closeconnection(con);
			s="Restaurant already present";
			return s;
		}
		else
		{
			String sql1 = "INSERT INTO restaurants (restaurantname,branch,foodnotsold,sellerid) VALUES ('"+resname+"', '"+branch+"', '"+foodtypenotsold+"', '"+sellerid+"')";
			stmt.executeUpdate(sql1);
			db.closeconnection(con);
			s="Restaurant added successfully";
			return s;
		}
	}catch(Exception e1) {System.out.print(e1);}
	return s;	
	}
public String deleteRestaurant(String restname, String branch)
{
	String s="";
	try {
		Connection con=db.getconnection();
		Statement stmt=con.createStatement();
		String sql="Select * from restaurants where restaurantname='"+restname+"' and branch='"+branch+"'" ;
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			String sql1 = "DELETE FROM restaurants where restaurantname='"+restname+"' and branch='"+branch+"'";
			stmt.executeUpdate(sql1);
			db.closeconnection(con);
			s="Restaurant deleted successfully";
			return s;
			
		}
		else
		{
			db.closeconnection(con);
			s="Restaurant not present";
			return s;
		}
	}catch(Exception e1) {System.out.print(e1);}
	return s;
	}
}

