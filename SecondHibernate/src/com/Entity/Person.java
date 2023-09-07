package com.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;


@Entity
public class Person {
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int page;
	private String pqual;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpassid")
	private Passport pass;
	
	
	  @OneToMany(cascade = CascadeType.ALL)
	  @JoinColumn(name ="fkpid")// here the fkpid is in person table 
	  private List<Mobile> mob;
	  
	  
	  @ManyToMany(cascade = CascadeType.ALL)
	  @JoinTable(name ="JoinTable", joinColumns  =@JoinColumn(name = "fkcid"),
	  inverseJoinColumns = @JoinColumn(name = "fkpid"))
	private List<Course> cou;
	  public List<Course> getCou() {
		return cou;
	}

	public void setCou(List<Course> cou) {
		this.cou = cou;
	}

	  
	  
	  
	  public List<Mobile> getMob() {
		  return mob; 
		  }
	  
	  public void setMob(List<Mobile> mob) {
		  this.mob = mob;
		  }
	 
	public Passport getPass() {
		return pass;
	}
	public void setPass(Passport pass) {
		this.pass = pass;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPqual() {
		return pqual;
	}
	public void setPqual(String pqual) {
		this.pqual = pqual;
	}
	

	public Person(int pid, String pname, int page, String pqual, Passport pass, List<Mobile> mob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pqual = pqual;
		this.pass = pass;
		this.mob = mob;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pqual=" + pqual + ", pass=" + pass
				+ ", mob=" + mob + "]";
	}
	
	
	
	
	

}
