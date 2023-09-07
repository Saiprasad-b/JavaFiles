package com.cisco;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	Scanner sc = new Scanner(System.in);
	static Studentpojo p = new Studentpojo();
	static Connection con = null;
	public static Connection getConnection() throws Exception {
		
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentpojo", "root", "root");
		return con;
	
	}
	public void save(Studentpojo p ) throws Exception {
		con  =Dao.getConnection();
		if(con!=null && p!=null ) {
			PreparedStatement ps = con.prepareStatement("insert into student(sid,sname,sage,squal) values (?,?,?,?)");
			ps.setInt(1, p.getSid());
			ps.setString(2, p.getSname());
			ps.setInt(3, (int) p.getSage());
			ps.setString(4, p.getSqual());
			int row = ps.executeUpdate();
			System.out.println("No.of Rows effectd--->"+row);
			if(row!=0) {
				FileWriter fw =  new FileWriter("C:\\Users\\kranthi\\Desktop\\studentpojo.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(p.getSid()+","+p.getSname()+","+p.getSage()+","+p.getSqual());
				bw.newLine();
				bw.close();
				fw.close();
			}
			
		}
		else {System.out.println("Error in database Connection or Object is null");}
	}
	
	
	
	public void  update(Studentpojo p) throws Exception {
		if(con!=null && p!=null ) {
			PreparedStatement ps = con.prepareStatement("update student set sname = ? where sid = ?");
			ps.setInt(1, p.getSid());
			ps.setString(2, p.getSname());
			int row = ps.executeUpdate();
			System.out.println("No.of Rows effectd--->"+row);
			
			
		}
		else {System.out.println("Error in database Connection or Object is null");}
	}
	public void delete() {}
	public void getById() {}
	public void getAll() {}
	
	
	
}
