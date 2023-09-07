package com.Controllers;

import com.Dao.LoginDao;
import com.pojo.LoginPojo;

public class LoginContoller {
	LoginDao logindao = new LoginDao();
	
	
	public String  Authorization(LoginPojo logindata) {
	
		String role = null;
		role = logindao.getRole(logindata);
		return role;
		
	}
}
