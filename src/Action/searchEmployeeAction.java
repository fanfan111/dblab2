package Action;
import java.util.ArrayList;
import java.util.List;

import connect.JDBC.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class searchEmployeeAction {

	private String Enum;
	private String ename;
	public void setEnum(String Enum)
	{
		this.Enum = Enum;
	}
	public String getEnum()
	{
		return this.Enum;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public String getEname()
	{
		return this.ename;
	}
	
	public String execute() 
	{
		
		ArrayList<Employee> p1;
		ArrayList<Employee> result=new ArrayList<Employee>();
		Employee p2;
		try {
			p1=new Search().searchEmployeeByName(ename);
			p2=new Search().searchEmployeeByNum(Enum);
			
			
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
					if(p1.get(i).Enum!=p2.Enum){
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
		
		ActionContext.getContext().put("search_employee" ,result);
		return "success";
		
	   
	}
	
}
