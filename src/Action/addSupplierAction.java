package Action;

import connect.JDBC.Insert;

public class addSupplierAction {
	private String Snum;
	private String Sname;
	private String address;
	private String telephonenum;
	private String contactperson;
	
	public void setSname(String Sname)
	{
		this.Sname = Sname;
	}
	public String getSname()
	{
		return this.Sname;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setTelephonenum(String telephonenum)
	{
		this.telephonenum = telephonenum;
	}
	public String getTelephonenum()
	{
		return this.telephonenum;
	}
	public void setContactperson(String contactperson)
	{
		this.contactperson = contactperson;
	}
	public String getContactperson()
	{
		return this.contactperson;
	}
	public void setSnum(String Snum)
	{
		this.Snum = Snum;
	}
	public String getSnum()
	{
		return this.Snum;
	}
	
	public String execute() 
	{
		boolean flag=false;
		try {
			flag =new Insert().insertSupplier(Snum, Sname, address, telephonenum, contactperson);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(flag)
			return "success";
		
		return "error";
	   
	}
}
