package connect.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {
	public boolean deleteEmployee(String Enum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from employee where Enum='"+Enum+"';");
		if(!rs.next()){
			return false;
		}
		
		String sql="delete from employee where enum='"+Enum+"'";
		System.out.println(sql);
		stmt.execute(sql);
		
		rs = stmt.executeQuery(" select * from employee where Enum='"+Enum+"';");
		if(rs.next()){
			return false;
		}
		return true;
	}
	public boolean deletesonshipper(String MSnum,String Cnum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from sonshipper where MSnum='"+MSnum+"' and Cnum='"+Cnum+"';");
		if(!rs.next()){
			return false;
		}
		
		String sql="delete from sonshipper where MSnum='"+MSnum+"' and Cnum='"+Cnum+"';";
		System.out.println(sql);
		stmt.execute(sql);
		
		rs = stmt.executeQuery(" select * from sonshipper where MSnum='"+MSnum+"' and Cnum='"+Cnum+"';");
		if(rs.next()){
			return false;
		}
		return true;
	}
	public boolean deletemainshipper(String MSnum) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");

		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from mainshipper where MSnum='"+MSnum+"';");
		if(!rs.next()){
			return false;
		}
		
		String sql="delete from mainshipper where MSnum='"+MSnum+"';";
		System.out.println(sql);
		stmt.execute(sql);
		
		rs = stmt.executeQuery(" select * from mainshipper where MSnum='"+MSnum+"';");
		if(rs.next()){
			return false;
		}
		return true;
	}
	
	
}
