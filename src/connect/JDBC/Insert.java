package connect.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Insert {
	
	public boolean insertDepartment(String dnum,String dname) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from department where dnum='"+dnum+"';");
		if(rs.next()){
			return false;
		}
		stmt.execute("insert into department values('"+dnum+"','"+dname+"');");
		rs = stmt.executeQuery(" select dname from department where dnum='"+dnum+"';");
		if(rs.next()){
			return true;
		}
		return false;
	}
	
	public boolean insertEmployee(String Enum,String ename,
			String sex,String duty,String password,
			String level,String idnum,String Dnum,String SuperEnum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from employee where Enum='"+Enum+"';");
		if(rs.next()){
			return false;
		}
		stmt.execute("insert into employee values('"+Enum+"','"+ename+"','"+sex+"',"
				+ "'"+duty+"','"+password+"','"+level+"','"+idnum+"','"+Dnum+"','"+SuperEnum+"');");
		
		rs = stmt.executeQuery(" select * from employee where Enum='"+Enum+"';");
		if(rs.next()){
			return true;
		}
		return false;
	}
	public boolean insertSupplier(String Snum,String Sname,
			String address,String telephonenum,String contactperson) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");
		
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Supplier where Snum='"+Snum+"';");
		if(rs.next()){
			return false;
		}
		
		stmt.execute("insert into Supplier values('"+Snum+"','"+Sname+"','"+address+"',"
				+ "'"+telephonenum+"','"+contactperson+"');");
		
		rs = stmt.executeQuery(" select * from Supplier where Snum='"+Snum+"';");
		if(rs.next()){
			return true;
		}
		return false;
	}
	
	public boolean insertMember(String Mnum,String Mname,String sex,
			String idnum,float consumption,float integral) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");
		
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Member where Mnum='"+Mnum+"';");
		if(rs.next()){
			return false;
		}
		stmt.execute("insert into Member values('"+Mnum+"','"+Mname+"','"+sex+"',"
				+ "'"+idnum+"','"+consumption+"','"+integral+"');");
		
		rs = stmt.executeQuery(" select * from Member where Mnum='"+Mnum+"';");
		if(rs.next()){
			return true;
		}
		return false;
	}
	
	public boolean insertCommodity(String Cnum,String category,
			int quantity,float price,String Cname) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");
		
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Commodity where Cnum='"+Cnum+"';");
		if(rs.next()){
			return false;
		}
		stmt.execute("insert into Commodity values('"+Cnum+"','"+Cname+"','"+category
				+"','"+quantity+"',"+ "'"+price+"');");
		
		rs = stmt.executeQuery(" select * from Commodity where Cnum='"+Cnum+"';");
		if(rs.next()){
			return true;
		}
		return false;
	}
	public boolean insertWarehouse(String Wnum,String indate,String Cnum,
			String unit,float inprice,float outprice,int quantity,
			float totalamount,String Snum,String Enum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");
		
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Warehouse where Wnum='"+Wnum+"';");
		if(rs.next()){
			return false;
		}
		stmt.execute("insert into Commodity values('"+Wnum+"','"+indate+"','"+Cnum+"',"
				+ "'"+unit+"','"+inprice+"','"+outprice+"','"+quantity+
				"','"+Snum+"','"+Enum+"');");
		
		rs = stmt.executeQuery(" select * from Warehouse where Wnum='"+Wnum+"';");
		if(rs.next()){
			return true;
		}
		return false;
	}
	
	public boolean insertMainShipper(String MSnum,String outdate,
			String ifcash,String ifmember,String Mnum,String Enum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");
		
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from MainShipper where MSnum='"+MSnum+"';");
		if(rs.next()){
			return false;
		}
		System.out.println("insert into mainshipper values('"+MSnum+"','"+outdate+"',"
				+ "'"+ifcash+"','"+ifmember+"','"+Mnum+"','"+Enum+"');");
		stmt.execute("insert into mainshipper values('"+MSnum+"','"+outdate+"',"
				+ "'"+ifcash+"','"+ifmember+"','"+Mnum+"','"+Enum+"');");
		
		rs = stmt.executeQuery(" select * from MainShipper where MSnum='"+MSnum+"';");
		if(rs.next()){
			System.out.println("11111111111111111111");
			return true;
		}
		System.out.println("22222222222222222");
		return false;
	}
	
	public boolean insertSonShipper(String MSnum,String Cnum,int quantity,float price,
			float discount,float money) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");
		
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from sonshipper where MSnum='"+MSnum+"' and Cnum='"+Cnum+"';");
		if(rs.next()){
			
			return false;
		}
		System.out.println("insert into sonshipper values('"+MSnum+"','"+Cnum+"','"+quantity+"',"
				+ "'"+price+"','"+discount+"','"+money+"');");
		stmt.execute("insert into sonshipper values('"+MSnum+"','"+Cnum+"','"+quantity+"',"
				+ "'"+price+"','"+discount+"','"+money+"');");
		
		rs=stmt.executeQuery(" select * from sonshipper where MSnum='"+MSnum+"' and Cnum='"+Cnum+"';");
		System.out.println("222");
		if(rs.next()){
			return true;
		}
		return false;
	}
}
