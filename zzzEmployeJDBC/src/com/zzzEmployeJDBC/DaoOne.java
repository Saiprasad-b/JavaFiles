package com.zzzEmployeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoOne {

	static Connection con  =null;
	
	public static Connection getConnection() throws Exception {
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	return con;
	}
	
	
	public void getEmpData(String name)throws Exception {
		
		con = DaoOne.getConnection();
		String query  ="select ename , esalary, depname FROM employee.employee inner join employee.department where eid = fkeid and ename =?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("ename")+rs.getDouble("esalary")+rs.getString("depname"));		
		}
		
	}
	public static void main(String[] args) throws Exception {
		DaoOne d = new DaoOne();
		d.getEmpData("siva");
	}
}
