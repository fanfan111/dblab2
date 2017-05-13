package Action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;

import connect.JDBC.*;

public class searchShipperAction {
	
	private String MSnum;

	public void setMSnum(String MSnum)
	{
		this.MSnum = MSnum;
	}
	public String getMSnum()
	{
		return this.MSnum;
	}

	public String execute() 
	{
		mainShipper mains=new mainShipper();
		ArrayList<subshipper> sub=new ArrayList<subshipper>();
		try {
			mains=new Search().searchMainShipperBYmsnum(MSnum);
			sub=new Search().searchSubShipperBYmsnum(MSnum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		if(mains==null){
			return "error";
		}
		
		ActionContext.getContext().put("search_main" ,mains);
		ActionContext.getContext().put("search_sub" ,sub);
		return "success";
	   
	}
}
