package Action;
import java.util.ArrayList;
import java.util.List;

import connect.JDBC.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class insertEmployeeAction {

	private String Enum;
	private String ename;
	private String sex;
	private String duty;
	private String password;
	private String level;
	private String idnum;
	private String dnum;
	private String superEnum;
	
	public void setEnum(String Enum)
	{
		this.Enum = Enum;
	}
	public String getEnum()
	{
		return this.Enum;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public String getEname()
	{
		return this.ename;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getSex()
	{
		return this.sex;
	}
	public void setDuty(String duty)
	{
		this.duty = duty;
	}
	public String getDuty()
	{
		return this.duty;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setLevel(String level)
	{
		this.level = level;
	}
	public String getLevel()
	{
		return this.level;
	}
	public void setIdnum(String idnum)
	{
		this.idnum = idnum;
	}
	public String getIdnum()
	{
		return this.idnum;
	}
	public void setDnum(String dnum)
	{
		this.dnum = dnum;
	}
	public String getDnum()
	{
		return this.dnum;
	}
	public void setSuperEnum(String superEnum)
	{
		this.superEnum = superEnum;
	}
	public String getSuperEnum()
	{
		return this.superEnum;
	}
	
	
	public String execute() 
	{
		boolean flag=false;
		
		try {
			flag =new Insert().insertEmployee(Enum, ename, sex, duty, password, level, idnum, dnum, superEnum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
		if(flag)
			return "success";
		return "error";
	   
	}
	
}
