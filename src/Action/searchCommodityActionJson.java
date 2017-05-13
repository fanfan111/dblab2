package Action;


import connect.JDBC.Search;
import net.sf.json.JSONObject;

public class searchCommodityActionJson {
	private String Cnum;
	protected JSONObject result;
	public void setCnum(String Cnum)
	{
		this.Cnum = Cnum;
	}
	public String getCnum()
	{
		return this.Cnum;
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
			if(new Search().searchCommodity(Cnum)){
				result.put("state", "success");
			}else{
				result.put("state", "error");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result.put("state", "error");
			return "success";
		}
		return "success";
		
	   
	}
}
