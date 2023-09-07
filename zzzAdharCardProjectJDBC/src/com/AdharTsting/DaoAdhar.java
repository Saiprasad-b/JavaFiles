package com.AdharTsting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoAdhar{//(one to one) 
	static Connection con = null;
	public static Connection getConnection() throws Exception {

		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adharproject", "root", "root");
		return con;

	}
	
	
	public void getAdharDetails(String pname) throws Exception {
		con  =DaoAdhar.getConnection();
		String query = "SELECT * FROM adharproject.adhar Inner join adharproject.person where pid = fkpid and pname = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, pname);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("anum"));
		}
	}
	
	
	public void getPersonDetails(String anum) throws Exception {
		
		con  =DaoAdhar.getConnection();
		String query = "SELECT * FROM adharproject.adhar Inner join adharproject.person where pid = fkpid and anum = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, anum);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("pname")+"----->"+rs.getInt("page"));
		}
	}
public static void main(String[] args) throws Exception {
	DaoAdhar d = new DaoAdhar();
	d.getAdharDetails("siva");
	
	d.getPersonDetails("234b");
	}
}
