package ListInterface;

public class Dep {
private int dId;
private String dName;
public int getdId() {
	return dId;
}
public void setdId(int dId) {
	this.dId = dId;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public Dep(int dId, String dName) {
	super();
	this.dId = dId;
	this.dName = dName;
}
@Override
public String toString() {
	return "dId=" + dId + ", dName=" + dName;
}



}
