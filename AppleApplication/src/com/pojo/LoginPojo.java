package com.pojo;

public class LoginPojo {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String username;
	private String pwd ;
	private String role;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "username=" + username + ", pwd=" + pwd + ", role=" + role + "id=" + id;
	}
	public LoginPojo(int id,String username, String pwd, String role) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.role = role;
	}
	public LoginPojo() {
		// TODO Auto-generated constructor stub
	}
	
	
}
