package Action;
import java.util.ArrayList;
import java.util.List;

import connect.JDBC.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;
public class searchEmployeeActionJson {
	protected JSONObject result;
	private String Enum;
	
	public void setEnum(String Enum)
	{
		this.Enum = Enum;
	}
	public String getEnum()
	{
		return this.Enum;
	}
	 public JSONObject getResult() {
		return result;
	 }
	 public void setResult(JSONObject result) {
		this.result = result;
	 }
		  
	public String execute() 
	{
		
		result = new JSONObject();
		Employee p2;
		try {
			p2=new Search().searchEmployeeByNum(Enum);	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(p2!=null){
			
			result.put("state", "success");
			result.put("Enum", p2.Enum);
			result.put("ename", p2.ename);
			result.put("sex", p2.sex);
			
			
			result.put("duty", p2.duty);
			result.put("password", p2.password);
			result.put("level", p2.level);
			result.put("idnum", p2.idnum);
			result.put("dnum", p2.dnum);

			if(!p2.superEnum.equals("null")){result.put("superEnum", p2.superEnum);}
				
			else{result.put("superEnum", "");}
				
			
		}else{
			result.put("state", "error");
			
		}
		System.out.println(Enum);
		return "success";
		
	   
	}
	
}
