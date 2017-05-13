package Action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;

import connect.JDBC.Commodity;
import connect.JDBC.Employee;
import connect.JDBC.Insert;
import connect.JDBC.Member;
import connect.JDBC.Search;
import connect.JDBC.Supplier;

public class searchCommodityAction {
	private String Cnum;
	private String Cname;

	public void setCnum(String Cnum)
	{
		this.Cnum = Cnum;
	}
	public String getCnum()
	{
		return this.Cnum;
	}
	public void setCname(String Cname)
	{
		this.Cname = Cname;
	}
	public String getCname()
	{
		return this.Cname;
	}
	
	public String execute() 
	{
		ArrayList<Commodity> p1;
		ArrayList<Commodity> result=new ArrayList<Commodity>();
		Commodity p2;
		try {
			p1=new Search().searchCommodityByName(Cname);
			p2=new Search().searchCommodityByNum(Cnum);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(p2 != null){
			result.add(p2);
			System.out.println("1");
		}
		if(p1!=null){
			System.out.println("2");
			if(p2!=null){
				for(int i =0 ;i<p1.size();i++){
					if(p1.get(i).Cnum!=p2.Cnum){
						result.add(p1.get(i));
					}
				}
			}else{
				for(int i =0 ;i<p1.size();i++){
					result.add(p1.get(i));
				}
			}
			
		}
		if(result.size()==0){
			return "error";
		}
		
		ActionContext.getContext().put("search_commodity" ,result);
		return "success";
	   
	}
}
