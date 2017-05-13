package Action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;

import connect.JDBC.Employee;
import connect.JDBC.Insert;
import connect.JDBC.Member;
import connect.JDBC.Search;
import connect.JDBC.Supplier;

public class searchMemberAction {
	private String Mnum;
	private String Mname;

	public void setMnum(String Mnum)
	{
		this.Mnum = Mnum;
	}
	public String getMnum()
	{
		return this.Mnum;
	}
	public void setMname(String Mname)
	{
		this.Mname = Mname;
	}
	public String getMname()
	{
		return this.Mname;
	}
	
	public String execute() 
	{
		ArrayList<Member> p1;
		ArrayList<Member> result=new ArrayList<Member>();
		Member p2;
		System.out.println(Mname + "  "+ Mnum);
		try {
			p1=new Search().searchMemberByName(Mname);
			p2=new Search().searchMemberByNum(Mnum);
			
			
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
					if(p1.get(i).Mnum!=p2.Mnum){
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
		
		ActionContext.getContext().put("search_member" ,result);
		return "success";
	   
	}
}
