package EntrySet;

public class Employe {
	
	
	private int eID;
	private String eName;
	private double eSal;
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
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
	public Employe(int eID, String eName, double eSal) {
		super();
		this.eID = eID;
		this.eName = eName;
		this.eSal = eSal;
	}
	@Override
	public String toString() {
		return "eID->" + eID + ", eName->" + eName + ", eSal->" + eSal;
	}
	
	
	
}
