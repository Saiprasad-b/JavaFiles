package ConstructorInjection;

import java.util.Arrays;

public class Employe {
private String ename;
private int eid;
private Department dept;
private Location[]loc;
public Location[] getLoc() {
	return loc;
}
public void setLoc(Location[] loc) {
	this.loc = loc;
}
public void setEname(String ename) {
	this.ename = ename;
}
public void setEid(int eid) {
	this.eid = eid;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public Employe(String ename, int eid, Department dept,Location[] loc) {
	super();
	this.ename = ename;
	this.eid = eid;
	this.dept = dept;
	this.loc = loc;
}
@Override
public String toString() {
	return "Employe [ename=" + ename + ", eid=" + eid + ", dept=" + dept + ", loc=" + Arrays.toString(loc) + "]";
}

}
