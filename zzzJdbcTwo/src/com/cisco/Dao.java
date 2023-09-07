package com.cisco;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	Scanner sc = new Scanner(System.in);
	static Studentpojo p = new Studentpojo();
	static Connection con = null;

	public static Connection getConnection() throws Exception {

		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentpojo", "root", "root");
		return con;

	}

	/*
	 * public void save(Studentpojo p) throws Exception { con = Dao.getConnection();
	 * 
	 * if (con != null && p != null) {
	 * 
	 * PreparedStatement ps = con.
	 * prepareStatement("insert into student(sid,sname,sage,squal) values (?,?,?,?)"
	 * ); ps.setInt(1, p.getSid());
	 * 
	 * boolean flag = Dao.getById(p.getSid());// to check dupilcate primary keys
	 * System.out.println(flag + "----------->"); if (flag = false) {
	 * 
	 * ps.setString(2, p.getSname()); ps.setInt(3, (int) p.getSage());
	 * ps.setString(4, p.getSqual()); int row = ps.executeUpdate();
	 * System.out.println("No.of Rows effectd--->" + row); } else {
	 * System.out.println("Already existed with key"); } } else {
	 * System.out.println("Error in database Connection or Object is null"); }
	 * 
	 * }
	 */
	public void update(Studentpojo p) throws Exception {
		con = Dao.getConnection();
		if (con != null && p != null) {
			PreparedStatement ps = con.prepareStatement("update student set sname = ? where sid = ?");
			ps.setString(1, p.getSname());
			ps.setInt(2, p.getSid());
			int row = ps.executeUpdate();
			System.out.println("No.of Rows effectd--->" + row);

		}

		else {
			System.out.println("Error in database Connection or Object is null");
		}
	}

	public void delete(int sid) throws Exception {

		con = Dao.getConnection();
		if (con != null && p != null) {
			PreparedStatement ps = con.prepareStatement("delete from studentpojo.student where sid = ?");
			ps.setInt(1, sid);
			int del = ps.executeUpdate();
			System.out.println("No of rows deleted--->" + del);

		} else {
			System.out.println("Error in database Connection or Object is null");
		}
	}

	/*
	 * public static boolean getById(int sid) throws Exception { boolean flag =
	 * true; con = Dao.getConnection(); if (con != null && p != null) {
	 * PreparedStatement ps =
	 * con.prepareStatement("select * FROM studentpojo.student where sid  = ?");
	 * ps.setInt(1, sid); ResultSet rs = ps.executeQuery(); while (rs.next()) { flag
	 * = false; System.out.println(rs.getInt("sid") + " " + rs.getString("sname") +
	 * " " + rs.getInt("sage") + " " + rs.getString("squal")); } } else {
	 * System.out.println("Error in database Connection or Object is null"); } //
	 * System.out.println(flag); return flag;
	 */
	public Studentpojo getById(int sid) throws Exception {
		Studentpojo s =new Studentpojo();
		con= Dao.getConnection();
		if (con != null && p != null) {
			
			PreparedStatement ps = con.prepareStatement("select * FROM studentpojo.student where sid  = ?");
			ps.setInt(1, sid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				s.setSid(rs.getInt("sid"));
				s.setSname(rs.getString("sname"));
				s.setSage(rs.getInt("sage"));
				s.setSqual(rs.getString("squal"));
			}
		} 
		else {
			System.out.println("Error in database Connection or Object is null");
		}
		// System.out.println(flag);
		return s;
	}
	/*
	 * public void getAll() throws Exception { con = Dao.getConnection();
	 * if(con!=null && p!=null) { Statement st = con.createStatement(); ResultSet rs
	 * = st.executeQuery("select * from studentpojo.student"); while(rs.next()) {
	 * System.out.println(rs.getInt("sid")+" "+rs.getString("sname")+" "+rs.getInt(
	 * "sage")+" "+rs.getString("squal")); } } if(con!=null && p!=null) { String
	 * query = "select * from studentpojo.student"; PreparedStatement ps =
	 * con.prepareStatement(query ); ResultSet rs = ps.executeQuery();
	 * while(rs.next()) {
	 * System.out.println(rs.getInt("sid")+" "+rs.getString("sname")+" "+rs.getInt(
	 * "sage")+" "+rs.getString("squal")); } } else
	 * {System.out.println("Error in database Connection or Object is null");}
	 * 
	 * }
	 */
	public List<Studentpojo> getAll() throws Exception {
		List<Studentpojo> list= new ArrayList<>();
		con = Dao.getConnection();
		if(con!=null && p!=null) {
		String query = "select * from studentpojo.student";
		PreparedStatement ps  =  con.prepareStatement(query );
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Studentpojo s  = new Studentpojo();
			s.setSid(rs.getInt("sid"));
			s.setSname(rs.getString("sname"));
			s.setSage(rs.getInt("sage"));
			s.setSqual(rs.getString("squal"));
			list.add(s);
		}
	}
		else {System.out.println("Error in database Connection or Object is null");}
		return list;
	}

}
