package Action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;

import connect.JDBC.Employee;
import connect.JDBC.Insert;
import connect.JDBC.Search;
import connect.JDBC.Supplier;

public class searchSupplierAction {
	private String Snum;
	private String Sname;

	public void setSname(String Sname)
	{
		this.Sname = Sname;
	}
	public String getSname()
	{
		return this.Sname;
	}
	public void setSnum(String Snum)
	{
		this.Snum = Snum;
	}
	public String getSnum()
	{
		return this.Snum;
	}
	
	public String execute() 
	{
		ArrayList<Supplier> p1;
		ArrayList<Supplier> result=new ArrayList<Supplier>();
		Supplier p2;
		try {
			p1=new Search().searchSupplierByName(Sname);
			p2=new Search().searchSupplierByNum(Snum);
			
			
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
					if(p1.get(i).Snum!=p2.Snum){
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
		
		ActionContext.getContext().put("search_supplier" ,result);
		return "success";
	   
	}
}

