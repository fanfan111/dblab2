package Action;
import java.util.ArrayList;
import java.util.Iterator;
import antlr.collections.List;
import connect.JDBC.*;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class addShipperActionJson {

	  protected String params;
	  protected JSONObject result;
	  public String getParams() {
	    return params;
	  }
	  public void setParams(String params) {
	    this.params = params;
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
		System.out.println(params);
		int allNum=0;
		JSONObject paramsJson = JSONObject.fromObject(params);
		JSONArray pdoJsonArray = paramsJson.getJSONArray("commoditys");
		ArrayList<JSONObject> commoditysStrings = new ArrayList<JSONObject>();
		Iterator<?> it = pdoJsonArray.iterator();
		while (it.hasNext()) {
			commoditysStrings.add((JSONObject) it.next());
		}
		
		mainShipper q= new mainShipper();
		q.Enum=paramsJson.getString("Enum");
		q.ifcash=paramsJson.getString("ifcash");
		q.ifmember=paramsJson.getString("ifmember");
		q.Mnum=paramsJson.getString("Mnum");
		q.outdate=paramsJson.getString("outdate");
		q.MSnum=paramsJson.getString("MSnum");
		try {
			if(!(new Insert().insertMainShipper(q.MSnum, q.outdate,  q.ifcash, q.ifmember, q.Mnum, q.Enum))){
				result.put("state", "error");
				return "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "error");
			return "success";
		}
		
		
		ArrayList<subshipper> com = new ArrayList<subshipper>();
		for(int i=0;i<commoditysStrings.size();i++){
			JSONObject commodity1 =commoditysStrings.get(i);
			subshipper p=new subshipper();
			p.Cnum=commodity1.getString("Cnum");
			p.discount=Float.parseFloat(commodity1.getString("discount"));
			p.MSnum=paramsJson.getString("MSnum");
			p.monery=Float.parseFloat(commodity1.getString("money"));
			p.price=Float.parseFloat(commodity1.getString("price"));
			p.quantity=Integer.parseInt(commodity1.getString("quantity"));
			allNum+=p.price*p.quantity*p.discount;
			com.add(p);
			try {
				boolean flag =new Insert().insertSonShipper(p.MSnum, p.Cnum, p.quantity, p.price, p.discount, p.monery);
				
				if(!flag){
					for(int j=0;j<i;j++){
						try {
							new Delete().deletesonshipper(com.get(j).MSnum,com.get(j).Cnum);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					try {
						new Delete().deletemainshipper(p.MSnum);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					result.put("state", "error");
					return "success";	
				}
			} catch (Exception e) {
				
				for(int j=0;j<i;j++){
					try {
						new Delete().deletesonshipper(com.get(j).MSnum,com.get(j).Cnum);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				try {
					new Delete().deletemainshipper(p.MSnum);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
				result.put("state", "error");
				return "success";	
			}
		}
		if(q.ifmember.equals("1")){
			try {
				new Update().updateMember(q.Mnum, allNum);
			} catch (Exception e) {
				for(int j=0;j<com.size();j++){
					try {
						new Delete().deletesonshipper(com.get(j).MSnum,com.get(j).Cnum);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				try {
					new Delete().deletemainshipper(q.MSnum);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				result.put("state", "error");
				return "success";
			}
		}
		
		result.put("state", "success");
		return "success";
		
	   
	}
}
