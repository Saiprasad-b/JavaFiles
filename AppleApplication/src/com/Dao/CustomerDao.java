package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pojo.CustomerPojo;

public class CustomerDao {
	
	static Connection con = null;
	
	CustomerPojo customerpojo = new CustomerPojo();
	public void RaiseBug() throws Exception {
	 con = LoginDao.getConnection();
	 String query = "insert into apple.customer (id ,cname ,cloc,cbug) values(?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(query );
	ps.setInt(1, customerpojo.getCid());
	ps.setString(2, customerpojo.getCname());
	ps.setString(3, customerpojo.getCloc());
	ps.setString(4, customerpojo.getCbug());

	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
	    customerpojo.setCid(rs.getInt("cid"));
	    customerpojo.setCname(rs.getString("cname"));
	 	customerpojo.setCloc(rs.getString("cloc"));
		customerpojo.setCbug(rs.getString("cbug"));
	   }
	}
}
