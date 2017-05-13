package Action;

import connect.JDBC.Insert;

public class addCommodityAction {
	private String Cnum;
	private String category;
	private int quantity;
	private String Cname;
	
	public void setCnum(String Cnum)
	{
		this.Cnum = Cnum;
	}
	public String getCnum()
	{
		return this.Cnum;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getCategory()
	{
		return this.category;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getQuantity()
	{
		return this.quantity;
	}
	public void setCname(String Cname)
	{
		this.Cname = Cname;
	}
	public String getCname()
	{
		return this.Cname;
	}
	public String execute() 
	{
		boolean flag=false;
		try {
			flag =new Insert().insertCommodity(Cnum, category, quantity, Cname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(flag)
			return "success";
		
		return "error";
	   
	}
	
	
}
