package Action;
import connect.JDBC.Search;
import connect.JDBC.Supplier;
import net.sf.json.JSONObject;

public class searchSupplierActionJson {
	private String Snum;
	protected JSONObject result;
	public void setSnum(String Snum)
	{
		this.Snum = Snum;
	}
	public String getSnum()
	{
		return this.Snum;
	}
	public JSONObject getResult() {
			return result;
	}
	public void setResult(JSONObject result) {
		this.result = result;
	}
		 
		 
	public String execute() 
	{
		System.out.println(Snum);
		result = new JSONObject();
		Supplier p2;
		try {
			p2=new Search().searchSupplierByNum(Snum);	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(p2!=null){
			result.put("state", "success");
			result.put("Snum", p2.Snum);
			result.put("Sname", p2.Sname);
			result.put("telephonenum", p2.telephonenum);
			result.put("contactperson", p2.contactperson);
			result.put("address", p2.address);
						
		}else{
			result.put("state", "error");
			
		}
		return "success";
		
	   
	}
}
