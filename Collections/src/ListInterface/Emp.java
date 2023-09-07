package ListInterface;

public class Emp {
	private int eId;
	private String eName;
	private double eSal;
	
	
	public Emp() {}
	public Emp(int eId, String eName, double eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	@Override
	public String toString() {
		return "eId=" + eId + ", eName=" + eName + ", eSal=" + eSal;
	}
	

}
