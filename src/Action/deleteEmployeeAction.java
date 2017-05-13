package Action;
import java.util.ArrayList;
import java.util.List;

import connect.JDBC.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class deleteEmployeeAction {

	private String Enum;
	public void setEnum(String Enum)
	{
		this.Enum = Enum;
	}
	public String getEnum()
	{
		return this.Enum;
	}
	
	public String execute() 
	{
		
		boolean flag=false;
		try {
			flag = new Delete().deleteEmployee(Enum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(flag)
			return "success";
		return "error";
	   
	}
	
}
