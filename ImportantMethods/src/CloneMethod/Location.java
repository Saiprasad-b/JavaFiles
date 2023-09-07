package CloneMethod;

public class Location implements Cloneable {
	private String locName;
	private int locPin;
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public int getLocPin() {
		return locPin;
	}
	public void setLocPin(int locPin) {
		this.locPin = locPin;
	}
	public Location(String locName, int locPin) {
		super();
		this.locName = locName;
		this.locPin = locPin;
	}
	@Override
	public String toString() {
		return "Location [locName=" + locName + ", locPin=" + locPin + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		Location c;
		c = (Location) super.clone();
		return c;
		
	}
	
	
	
}
	