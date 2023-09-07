package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.LoginPojo;


public class LoginDao {
	public static Connection con = null;

	public static Connection getConnection() throws Exception {

		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple", "root", "root");
		return con;

	}
	public String getRole(LoginPojo logindata) {
		
		String role = null ;
		
		
		try {
			con =LoginDao.getConnection();
			String query = "SELECT role FROM apple.login where username = ? and pwd = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, logindata.getUsername());
			ps.setString(2, logindata.getPwd());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				role = rs.getString("role");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return role;
	}
}
