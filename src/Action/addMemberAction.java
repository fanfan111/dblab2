package Action;

import connect.JDBC.Insert;

public class addMemberAction {
	private String Mnum;//会员编号
	private String Mname;//姓名
	private String sex;//性别
	private String idnum;//身份证号
	private float consumption;//消费金额
	private float integral;//积分
	
	public void setMnum(String Mnum)
	{
		this.Mnum = Mnum;
	}
	public String getMnum()
	{
		return this.Mnum;
	}
	public void setConsumption(float consumption)
	{
		this.consumption = consumption;
	}
	public float getConsumption()
	{
		return this.consumption;
	}
	public void setIntegral(float integral)
	{
		this.integral = integral;
	}
	public float getIntegral()
	{
		return this.integral;
	}
	public void setIdnum(String idnum)
	{
		this.idnum = idnum;
	}
	public String getIdnum()
	{
		return this.idnum;
	}
	public void setMname(String Mname)
	{
		this.Mname = Mname;
	}
	public String getMname()
	{
		return this.Mname;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getSex()
	{
		return this.sex;
	}
	public String execute() 
	{
		boolean flag=false;
		try {
			flag =new Insert().insertMember(Mnum, Mname, sex, idnum, consumption, integral);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(flag)
			return "success";
		
		return "error";
	   
	}
}
