package BAL;
import DAL.BuyerD;


public class Buyer {
		public String buyer_register(String n, String e, String p, String c) 
		{
			if(!n.isEmpty() && !e.isEmpty() && !p.isEmpty() && !c.isEmpty() && p.equals(c))
			{
				BuyerD dbuy=new BuyerD();
				String res=dbuy.buyer_register(n, e, p);
				return res;
			}
			else
			{
				return "registeration_failed";
			}	
		}
		
		public String buyer_login(String n, String p) 
		{
			if(!n.isEmpty() && !p.isEmpty())
			{
				BuyerD dbuy=new BuyerD();
				String res=dbuy.buyer_login(n, p);
				return res;
			}
			else
			{
				return "Incorrect_username_or_password!";
			}
		}
		public String see_all()
		{
			BuyerD dbuy=new BuyerD();
			String res1=dbuy.see_all();
			return res1;
		}
		
}