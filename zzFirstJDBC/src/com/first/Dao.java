package com.first;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	
	Connection con = null;
	static Scanner sc = new Scanner(System.in);
	
	public static Connection getConnection() throws Exception{
		
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentpojo", "root", "root");
		
		return con;
	}
	
	
	
	
	
	public void save() throws Exception {
		con = Dao.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into student()values(?,?,?,?)");
		con.setAutoCommit(true);
		boolean flag = true;
		while(flag) {
			System.out.println("Enter SID");
			int sid  = sc.nextInt();
			ps.setInt(1, sid);
			System.out.println("Enter sname");
			String sname = sc.next();
			ps.setString(2, sname);
			System.out.println("Enter the sage");
			int sage = sc.nextInt();
			ps.setInt(3, sage);
			System.out.println("Enter the squal");
			String squal = sc.next();
			ps.setString(4, squal);
			
			ps.addBatch();
			
			System.out.println("Enter true for data entry if not enter false");
			flag = sc.nextBoolean();
		}
	
		
		int[] row = ps.executeBatch();
		
		System.out.println(row.length);
	
	}
	public void insert() {
		try {
			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentpojo", "root", "root");
			Statement st  =  con.createStatement();
			//int row =st.executeUpdate("insert into student(sid,sname,sage,squal) values (2,'siva',25,'m.tech')");
		    //st.executeUpdate("insert into student(sid,sname,sage,squal) values (3,'fafam',22,'c.tech')");
		    //st.executeUpdate("insert into student(sid,sname,sage,squal) values (4,'pafam',28,'d.tech')");	
			//st.executeUpdate("update student set sname = 'dadada' where sid = 1");
			ResultSet res = st.executeQuery("select * FROM student");
			while(res.next()) {
				System.out.println(res.getInt(1) +" "+ res.getString(2) +" "+ res.getInt(3) +" "+ res.getString(4));
			}
			//System.out.println("rows updated---->" +row );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Dao d  = new Dao();
		d.save();
	}

}
