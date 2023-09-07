package SetIntro;

public class Emp {
	private int eId;
	private String eName;
	private double eSal;
	
	// default constructor
	public Emp() {}
	
	// Constructor using fields.
	public Emp(int eId, String eName, double eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
	//setter methods to inject the data.
	public void seteId(int eId) {
		this.eId = eId;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	// Overiding the toString method to print the values.
	@Override
	public String toString() {
		return "eId=" + eId + ", eName=" + eName + ", eSal=" + eSal;
	}
	

}
