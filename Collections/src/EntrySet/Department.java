package EntrySet;

public class Department {
	private int dID;
	private String dName;
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public Department(int dID, String dName) {
		super();
		this.dID = dID;
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "dID->" + dID + ", dName->" + dName;
	}
	
	
}
