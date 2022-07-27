package BAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import DAL.AdminD;
import DAL.SELL;



public class Admin {
	private boolean executed=false;
	public synchronized String admin_register(String n, String e, String p, String c,String t,String sts) 
	{
		if(!(executed))
		{
			return "there is only one admin";
		}
		else if((p.length()>6) &&(p.length()<=2))
		{
			return "invalid password length valid length is 3-6";
			
		}
		else if( p.equals(c))
		{
			AdminD dad=new AdminD();
			String res=dad.admin_register(n,e,p,t,sts);
			executed=true;
			return res;
			
		} 
		else
		{
			return "registration failure reconfirm your password";
		}	
		
	}
	public String admin_login(String n, String p) 
	{
		if(!n.isEmpty() && !p.isEmpty())
		{
			AdminD dad=new AdminD();
			String res=dad.admin_login(n,p);
			return res;
		}
		else
		{
			return "Incorrect_username_or_password!";
		}
	}
	public String see_allUsers()
	{
		AdminD dad=new AdminD();
		String res1=dad.see_allUsers();
		return res1;
	}
	public String see_allDishes()
	{
		AdminD dad=new AdminD();
		String res1=dad.see_allDishes();
		return res1;
	}
	public String blockUser(String name,String type) {
	
		AdminD dad=new AdminD();
		String res1=dad.blockUser(name,type);
		return res1;		
			
	}
	public String allowUser(String name,String type) {
		AdminD dad=new AdminD();
		String res1=dad.allowUser(name,type);
		return res1;
	}
	public String update_rating(String dname,String restname,String branch, double rating) 
	{
		if(rating<0.0)
		{
		return "You have entered negative value for ratings";	
		}
		else if(rating>5.0){
			return "You have entered greater value for ratings";
		}
		else
		{
			AdminD dad=new AdminD();
			String res1=dad.update_rating(dname, restname, branch, rating);
			return res1;
		}
	}
	public String addRestaurant(String resname,String branch ,String foodtypenotsold, int sellerid)
	{
		AdminD dad=new AdminD();
		String res1=dad.addRestaurant(resname, branch, foodtypenotsold,sellerid);
		return res1;
	}
	public String deleteRestaurant(String resname, String branch)
	{
		AdminD dad=new AdminD();
		String res1=dad.deleteRestaurant(resname, branch);
		return res1;
	}
}
