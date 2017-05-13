package Action;

import connect.JDBC.Delete;
import connect.JDBC.Insert;
import connect.JDBC.Update;

public class insertInputHouseAction {
	private String Wnum;
	private String indate;
	private String Cnum;
	private String unit;
	private float inprice;
	private float outprice;
	private int quantity;
	private String Snum;
	private String Enum;
		
	public void setWnum(String Wnum)
	{
		this.Wnum = Wnum;
	}
	public String getWnum()
	{
		return this.Wnum;
	}
	public void setIndate(String indate)
	{
		this.indate = indate;
	}
	public String getIndate()
	{
		return this.indate;
	}
	public void setCnum(String Cnum)
	{
		this.Cnum = Cnum;
	}
	public String getCnum()
	{
		return this.Cnum;
	}
	
	public void setUnit(String unit)
	{
		this.unit = unit;
	}
	public String getUnit()
	{
		return this.unit;
	}
	public void setInprice(float inprice)
	{
		this.inprice = inprice;
	}
	public float getInprice()
	{
		return this.inprice;
	}
	public void setOutprice(float outprice)
	{
		this.outprice = outprice;
	}
	public float getOutprice()
	{
		return this.outprice;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public void setSnum(String Snum)
	{
		this.Snum = Snum;
	}
	public String getSnum()
	{
		return this.Snum;
	}
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
			flag =new Insert().insertWarehouse(Wnum, indate, Cnum, unit, inprice, outprice, quantity, Snum, Enum);
			System.out.println("111111111111");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(!flag){
			return "error";
		}
		System.out.println("22222222222");
		try {
			flag = new Update().updateComodity(Cnum, this.quantity);
		} catch (Exception e) {
			try {
				new Delete().deletewarehouse(this.Wnum);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return "error";
			}
			e.printStackTrace();
			return "error";
		}
		System.out.println("333333333333333");
		if(!flag){
			try {
				new Delete().deletewarehouse(this.Wnum);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return "error";
			}
			return "error";
		}
		return "success";
		
		
	   
	}
	
	
}
