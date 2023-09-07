package com.AdharTsting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class oneToMany {


		static Connection con = null;
		public static Connection getConnection() throws Exception {

			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adharproject", "root", "root");
			return con;

		}
		public void getMobileNumbers(String pname) throws Exception {
			con =oneToMany.getConnection();//here below left and right join is taken
			String query = "SELECT mnum,msim FROM   adharproject.mobile INNER JOIN adharproject.person where person.pid = mobile.fkpid and pname = ?";
			PreparedStatement ps =con.prepareStatement(query);
			ps.setString(1, pname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("mnum")+"------>"+rs.getString("msim"));
			}
			
		}
		
		public void getPersonData(String msim) throws Exception {
			con =oneToMany.getConnection();//here below left and right join is taken
			String query = "SELECT pname,mnum FROM   adharproject.mobile INNER JOIN adharproject.person where person.pid = mobile.fkpid and msim = ?";
			PreparedStatement ps =con.prepareStatement(query);
			ps.setString(1, msim);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("pname")+"----->"+rs.getString("mnum"));
			}
			
		}
		
		
		//many to many(name(input)--->courses(Output)input person name-->output courses
		public void getPersonsByCourses(String pname) throws Exception {

			con =oneToMany.getConnection();//here below left and right join is taken
			String query = "SELECT cname ,cduration FROM adharproject.course Inner join adharproject.pcoursedct ,adharproject.person  where person.pid = pcoursedct.fkpid and course.cid = fkcid and pname= ?";			
			PreparedStatement ps =con.prepareStatement(query);
			ps.setString(1, pname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("cname")+"------>"+rs.getInt("cduration"));
			}
			
		
		}
		//input-->course name --->op (person names + age)
		
		public void getCoursesByPersons(String cname) throws Exception {

			con =oneToMany.getConnection();//here below left and right join is taken
			String query = "SELECT pname ,page FROM adharproject.course Inner join "
					+ "adharproject.pcoursedct INNER JOIN  adharproject.person  "
					+ " where person.pid = pcoursedct.fkpid  "
					+ "and course.cid = fkcid and cname= ?";			
			PreparedStatement ps =con.prepareStatement(query);
			ps.setString(1, cname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("pname")+"------>"+rs.getInt("page"));
			}
			
		
		}

	public static void main(String[] args)throws Exception {
		
		oneToMany om  = new oneToMany();
		//om.getMobileNumbers("mahi");
		//om.getPersonData("airtel");
		om.getPersonsByCourses("siva");
		//om.getCoursesByPersons("cjava");
	}
	
	
}

