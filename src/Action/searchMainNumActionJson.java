package Action;


import connect.JDBC.Search;
import connect.JDBC.mainShipper;
import net.sf.json.JSONObject;

public class searchMainNumActionJson {
	
	private String MSnum;
	protected JSONObject result;
	public void setMSnum(String MSnum)
	{
		this.MSnum = MSnum;
	}
	public String getMSnum()
	{
		return this.MSnum;
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
		
		try {
			mainShipper p = new Search().searchMainShipperBYmsnum(MSnum);
			if(p==null){
				result.put("state", "success");
			}else{
				result.put("state", "error");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("state", "error");
			return "success";
		}
		return "success";
		
	   
	}
}
