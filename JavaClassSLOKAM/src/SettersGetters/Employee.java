package SettersGetters;


public class Employee {
	private int eid;
	private String ename;
	private double esal;
	private String Location;
	private String depart;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
	
}

