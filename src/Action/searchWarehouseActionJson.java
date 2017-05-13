package Action;


import connect.JDBC.Search;
import net.sf.json.JSONObject;

public class searchWarehouseActionJson {
	
	private String Wnum;
	protected JSONObject result;
	public void setWnum(String Wnum)
	{
		this.Wnum = Wnum;
	}
	public String getWnum()
	{
		return this.Wnum;
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
			if(new Search().searchWarehouse(Wnum)){
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
