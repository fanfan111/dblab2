package connect.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Search {
	public ArrayList<Employee> searchEmployeeByName(String Ename) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from employee_view where Ename='"+Ename+"';");
		ArrayList<Employee> result=new ArrayList<Employee>();
		boolean flag=false;
		while(rs.next()){
			flag=true;
			Employee p =new Employee();
			p.dnum=rs.getString("dname");
			p.duty=rs.getString("duty");
			p.ename=rs.getString("ename");
			p.Enum=rs.getString("enum");
			p.sex=rs.getString("sex");
			p.password=rs.getString("password");
			p.idnum=rs.getString("idnum");
			p.superEnum=rs.getString("superEnum");
			p.level=rs.getString("level");
			result.add(p);
		}
		
		if(!flag)
			return null;
		return result;
		
	}
	
	public Employee searchEmployeeByNum(String Enum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from employee_view where Enum='"+Enum+"';");
		Employee result=new Employee();
		
		if(rs.next()){
			result.dnum=rs.getString("dname");
			result.duty=rs.getString("duty");
			result.ename=rs.getString("ename");
			result.Enum=rs.getString("enum");
			result.sex=rs.getString("sex");
			result.password=rs.getString("password");
			result.idnum=rs.getString("idnum");
			result.superEnum=rs.getString("superEnum");
			result.level=rs.getString("level");
		}else{
			return null;
		}
		
		
			
		return result;
		
	}
	public boolean searchWarehouse(String Wnum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Warehouse where Wnum='"+Wnum+"';");
		
		
		if(rs.next()){
			return true;
		}else{
			return false;
		}		
	}
	public boolean searchSupplier(String Snum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Supplier where Snum='"+Snum+"';");
		
		
		if(rs.next()){
			return true;
		}else{
			return false;
		}		
	}
	public boolean searchCommodity(String Cnum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Commodity where Cnum='"+Cnum+"';");
		
		
		if(rs.next()){
			return true;
		}else{
			return false;
		}		
	}
	public Commodity searchCommodityByNum(String Cnum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Commodity where Cnum='"+Cnum+"';");
		
		Commodity result =new Commodity();
		
		if(rs.next()){
			result.category=rs.getString("category");
			result.Cname=rs.getString("Cname");
			result.Cnum=rs.getString("Cnum");
			result.price=Float.parseFloat(rs.getString("price"));
			result.quantity=Integer.parseInt(rs.getString("quantity"));
		}else{
			return null;
		}
		return result;
	}
	public ArrayList<Commodity> searchCommodityByName(String Cname) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Commodity where Cname='"+Cname+"';");
		
		ArrayList<Commodity> result =new ArrayList<Commodity>();
		boolean flag=false;
		while(rs.next()){
			flag=true;
			Commodity p =new Commodity();
			p.category=rs.getString("category");
			p.Cname=rs.getString("Cname");
			p.Cnum=rs.getString("Cnum");
			p.price=Float.parseFloat(rs.getString("price"));
			p.quantity=Integer.parseInt(rs.getString("quantity"));
			result.add(p);
		}
	
	
		if(!flag)
			return null;
		return result;
	}
	
	public ArrayList<Supplier> searchSupplierByName(String Sname) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Supplier where Sname='"+Sname+"';");
		ArrayList<Supplier> result=new ArrayList<Supplier>();
		boolean flag=false;
		while(rs.next()){
			flag=true;
			Supplier p =new Supplier();
			p.Snum=rs.getString("Snum");
			p.Sname=rs.getString("Sname");
			p.address=rs.getString("address");
			p.telephonenum=rs.getString("telephonenum");
			p.contactperson=rs.getString("contactperson");
			
			result.add(p);
		}
		if(!flag)
			return null;
		return result;
		
	}
	
	public Supplier searchSupplierByNum(String Snum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Supplier where Snum='"+Snum+"';");
		Supplier result =new Supplier();
		
		if(rs.next()){
			result.Snum=rs.getString("Snum");
			result.Sname=rs.getString("Sname");
			result.address=rs.getString("address");
			result.telephonenum=rs.getString("telephonenum");
			result.contactperson=rs.getString("contactperson");
		}else{
			return null;
		}
		return result;
		
	}
	
	public ArrayList<Member> searchMemberByName(String Mname) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Member where Mname='"+Mname+"';");
		ArrayList<Member> result=new ArrayList<Member>();
		boolean flag=false;
		while(rs.next()){
			flag=true;
			Member p =new Member();
			p.consumption=Float.parseFloat(rs.getString("consumption"));
			p.idnum=rs.getString("idnum");
			p.integral=Float.parseFloat(rs.getString("integral"));
			p.Mname=rs.getString("Mname");
			p.Mnum=rs.getString("Mnum");
			p.sex=rs.getString("sex");	
			result.add(p);
		}
		
		if(!flag)
			return null;
		return result;
	}
	
	public Member searchMemberByNum(String Mnum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from Member where Mnum='"+Mnum+"';");
		Member result=new Member();
		
		if(rs.next()){
			result.consumption=Float.parseFloat(rs.getString("consumption"));
			result.idnum=rs.getString("idnum");
			result.integral=Float.parseFloat(rs.getString("integral"));
			result.Mname=rs.getString("Mname");
			result.Mnum=rs.getString("Mnum");
			result.sex=rs.getString("sex");	
		}else{
			return null;
		}	
		return result;
	}
	public mainShipper searchMainShipperBYmsnum(String MSnum) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from mainshipper where MSnum='"+MSnum+"';");
		mainShipper result =new mainShipper();
		
		if(rs.next()){
			result.Enum=rs.getString("Enum");
			result.ifcash=rs.getString("ifcash");
			result.ifmember=rs.getString("ifmember");
			result.MSnum=rs.getString("MSnum");
			result.Mnum=rs.getString("Mnum");
			result.outdate=rs.getString("outdate");	
		}else{
			return null;
		}
		return result;
	}
	public ArrayList<subshipper> searchSubShipperBYmsnum(String MSnum) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from sonshipper where MSnum='"+MSnum+"';");
		ArrayList<subshipper> result=new ArrayList<subshipper>();
		boolean flag=false;
		while(rs.next()){
			flag=true;
			subshipper p =new subshipper();
			p.Cnum=rs.getString("Cnum");
			p.discount=rs.getFloat("discount");
			p.monery=Float.parseFloat(rs.getString("monery"));
			p.MSnum=rs.getString("MSnum");
			p.price=rs.getFloat("price");
			p.quantity=rs.getInt("quantity");	
			result.add(p);
		}
		if(!flag)
			return null;
		return result;
	}
}
