package com.Controllers;
import java.util.*;
import com.pojo.LoginPojo;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		LoginPojo logindata = new LoginPojo();
		LoginContoller lc  = new LoginContoller();
		
		System.out.println("Please enter the UserName");
		String username =sc.next();
		logindata.setUsername(username);
	

		
		System.out.println("Please enter the Password");
		String password =sc.next();
		logindata.setPwd(password);
		String role = lc.Authorization(logindata);
		if(role==(null)) {
			System.out.println("Ivalid Passsword Or Username");
		}
		else {
		if(role.equals("admin")) {
			System.out.println("Admin ---> you can Manage any data");
		}
		else {
			System.out.println("Customer---> Please Raise any Bug");
		}
	}
  }

}
