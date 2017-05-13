package connect.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {
	public boolean updateEmployee(String Enum,String ename,
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
		
		String sql="update employee set ename='"+ename+"',sex='"+sex+"',"
				+ "duty='"+duty+"',password='"+password+"',level='"+level
				+"',idnum='"+idnum+"',Dnum='"+Dnum+"',SuperEnum='"+SuperEnum
				+"' where Enum='"+Enum+"';";
		
		System.out.println(sql);
		stmt.execute(sql);
		
		return true;
		
	}
	public boolean updateSupplier(String Snum,String Sname,
			String address,String telephonenum,String contactperson) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");
		Statement stmt = connect.createStatement();
		
		String sql="update supplier set Sname='"+Sname+"',address='"+address+"',"
				+ "telephonenum='"+telephonenum+"',contactperson='"+contactperson+"'"
				+" where Snum='"+Snum+"';";
		
		System.out.println(sql);
		stmt.execute(sql);
		
		return true;
		
	}
	public boolean updateMember(String Mnum,float price) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection connect = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/supermarket","root","123456");
		Statement stmt = connect.createStatement();
		
		ResultSet rs = stmt.executeQuery(" select * from Member where Mnum='"+Mnum+"';");
		float consumption=0,integral=0;
		if(rs.next()){
			consumption=Float.parseFloat(rs.getString("consumption"))+price;
			integral=Float.parseFloat(rs.getString("integral"))+price;
		}else{
			return false;
		}
		
		String sql="update member set consumption='"+consumption+"',integral='"
				+integral+"' where Mnum='"+Mnum+"';";
		
		System.out.println(sql);
		stmt.execute(sql);
		
		return true;
		
	}
}
