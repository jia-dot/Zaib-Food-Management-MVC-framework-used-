package def;
import BAL.Admin;
import BAL.SELLB;
import DAL.AdminD;

public class Controller {
	
		public String Register(String n, String e, String p, String c,String t,String sts)
		{
			
				SELLB se1= new SELLB();
				String result=se1.seller_register(n, e, p, c,t,sts);
				return result;
		
			
		}
		public String Login(String n,String p)
		{
			SELLB se1= new SELLB();
			String res=se1.seller_login(n, p);
			return res;
		}
		public String addDish(String dname,double price,double rating,String type, String restname,String branch)
		{
			SELLB se1= new SELLB();
			String res=se1.add_dishes(dname, price, rating,type, restname,branch);
			return res;
		}
		public String delete_dish(String n, String r, String b )
		{
			SELLB sel= new SELLB();
			String res=sel.delete_dishes(n, r,b);
			return res;
			
		}
		public String update_price(String n, String resn, String b,double np )
		{
			SELLB sel= new SELLB();
			String res=sel.update_price(n,resn,b,np);
			return res;
			
		}
		public String see_all() {
			SELLB sel= new SELLB();
			String res=sel.see_all();
			return res;
		}
		public String seeDishesOf(String rn)
		{
			SELLB sel= new SELLB();
			String res=sel.seeDishesOf(rn);
			return res;
		}
		public String seeRestaurantOf(String dn)
		{
			SELLB sel= new SELLB();
			String res=sel.seeRestaurantOf(dn);
			return res;
		}
	//Admin
		
		public String admin_register(String n, String e, String p, String c,String t,String sts) 
		{
			if( p.equals(c))
			{
				AdminD dad=new AdminD();
				String res=dad.admin_register(n,e,p,t,sts);
				return res;
			}
			else
			{
				return "registration failure reconfirm tour password";
			}	
			
		}
		public String admin_login(String n, String p) 
		{
			
			Admin dad=new Admin();
			String res=dad.admin_login(n,p);
			return res;
			
		}
		public String see_allUsers()
		{
			Admin dad=new Admin();
			String res1=dad.see_allUsers();
			return res1;
		}
		public String see_allDishes()
		{
			Admin dad=new Admin();
			String res1=dad.see_allDishes();
			return res1;
		}
		public String blockUser(String name,String type) {
		
			Admin dad=new Admin();
			String res1=dad.blockUser(name,type);
			return res1;		
				
		}
		public String allowUser(String name,String type) {
			Admin dad=new Admin();
			String res1=dad.allowUser(name,type);
			return res1;
		}
		public String update_rating(String dname, String resname, String branch,double nrating)
		{
			Admin dad= new Admin();
			String res=dad.update_rating(dname,resname,branch,nrating);
			return res;
		}
		public String addRestaurant(String resname,String branch ,String foodtypenotsold, int sellerid)
		{
			Admin dad=new Admin();
			String res1=dad.addRestaurant(resname, branch, foodtypenotsold,sellerid);
			return res1;
		}
		public String deleteRestaurant(String resname, String branch)
		{
			Admin dad=new Admin();
			String res1=dad.deleteRestaurant(resname, branch);
			return res1;
		}
		}


