package BAL;

import DAL.SELL;
public class SELLB {
	public String seller_register(String n, String e, String p, String c,String t,String sts) 
	{
		 if((p.length()>6) &&(p.length()<=2))
		{
			return "invalid password length valid length is 3-6";
			
		}
		 else if( p.equals(c))
		{
			SELL dsel=new SELL();
			String res=dsel.seller_register(n,e,p,t,sts);
			System.out.println(res);
			return res;
			
		}
		else
		{
			return "registration failure reconfirm your password";
		}	
	}
	public String seller_login(String n, String p) 
	{
		if(!n.isEmpty() && !p.isEmpty())
		{
			SELL dsel=new SELL();
			String res=dsel.seller_login(n,p);
			return res;
		}
		else
		{
			return "username or password missing!";
		}
	}
	public String add_dishes(String dname,double price,double rating,String type, String restname,String branch) 
	{
		if((branch.equals("Islamabad") || branch.equals("islamabad")) && (type.equals("Fastfood") || type.equals("fastfood")) && (restname.equals("royal restaurant")))
		{
			return "You can't enter fastfood type food in Islamabad branch of royal restaurant";	
		}
		else if((branch.equals("rawalpindi") || branch.equals("Rawalpindi")) && (type.equals("chinesefood") || type.equals("Chinesefood")) && (restname.equals("gateway restaurant") || (restname.contentEquals("Gateway restaurant"))))
		{
			return "You can't enter chinese type food in rawalpindi branch of gateway_restaurant";	
		}
		else
		{
			SELL dsel=new SELL();
			String res1=dsel.add_dishes(dname, price, rating, type, restname, branch);
			return res1;
			
		}
	}
	public String delete_dishes(String dname,String restname, String branch) 
	{
			SELL dsel=new SELL();
			String res1=dsel.delete_dishes(dname, restname, branch);
			return res1;
	}
	public String update_price(String dname,String restname, String branch, double newprice) 
	{
		if(newprice>0.0)
		{
			SELL dsel=new SELL();
			String res1=dsel.update_price(dname, restname, branch, newprice);
			return res1;
		}
		else
		{
			return "you have entered negative value";
		}
		
	}
	public String see_all()
	{
		SELL dsel=new SELL();
		String res1=dsel.see_all();
		return res1;
	}
	public String seeDishesOf(String rn)
	{
		SELL dsel=new SELL();
		String res=dsel.seeDishesOf(rn);
		return res;
	}
	public String seeRestaurantOf(String dn)
	{
		SELL dsel=new SELL();
		String res=dsel.seeRestaurantOf(dn);
		return res;
	}
	

}

