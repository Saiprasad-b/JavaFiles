package com.AdharTsting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class subquery {


	static Connection con = null;
	public static Connection getConnection() throws Exception {

		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adharproject", "root", "root");
		return con;

	}
	public void getMobileNumbers(String pname) throws Exception {
		con =subquery.getConnection();//here below left and right join is taken
		String query = "select mnum , msim from adharproject.mobile where fkpid in (select pid from adharproject.person where pname = ?)";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, pname);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("mnum")+"     "+rs.getString("msim"));
		}
		
	}
	
	public void getPersonData(String msim) throws Exception {
		con =subquery.getConnection();//here below left and right join is taken
		String query = "select pname from adharproject.person where pid in( select fkpid from adharproject.mobile where msim=?)";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, msim);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("pname"));
		}
		
	}
	//many to many(name(input)--->courses(Output)input person name-->output courses
	public void getPersonsByCourses(String pname) throws Exception {

		con =subquery.getConnection();//here below left and right join is taken
		String query =  "select cname ,cduration from adharproject.course"
				+ " where cid in (select fkcid from adharproject.pcoursedct"
				+ " where fkpid in (select pid from adharproject.person "
				+ "where pname =?))";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, pname);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("cname")+"------>"+rs.getInt("cduration"));
		}
		
	
	}
	//input-->course name --->op (person names + age)
	
	public void getCoursesByPersons(String cname) throws Exception {

		con =subquery.getConnection();//here below left and right join is taken
		String query = "select pname,page  from adharproject.person \r\n"
				+ "where pid in (select fkpid from adharproject.pcoursedct where  pcoursedct.fkcid  in\r\n"
				+ " (select cid from adharproject.course where cname =?))";			
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, cname);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("pname")+"    "+rs.getInt("page"));
		}
		
	
	}

public static void main(String[] args)throws Exception {
	
	subquery om  = new subquery();
	//om.getMobileNumbers("mahi");
	om.getPersonData("airtel");
	//om.getPersonsByCourses("mahi");
	//om.getCoursesByPersons("cjava");
}


}

