package CloneMethod;

public class Display implements Cloneable  {

	private String sName;
	private int sId;
	private double sMarks;
	private Location loc;
	
	
	public Display(String sName, int sId, double sMarks, Location loc) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.sMarks = sMarks;
		this.loc = loc;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	public Display (){}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public double getsMarks() {
		return sMarks;
	}
	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}

	public Object clone() throws CloneNotSupportedException {
		Display k = (Display) super.clone();//here normal shallow Clone
		k.loc = (Location) k.loc.clone();
		return k;
	}

	@Override
	public String toString() {
		return "Display [sName=" + sName + ", sId=" + sId + ", sMarks=" + sMarks + ", loc=" + loc + "]";
	}
	public static void main(String[] args) {
		
		
		Display s1 = new Display("sai", 1001, 99.99,new Location("Hyd",505001));
		
		
		try {
			Display k =(Display) s1.clone();
			System.out.println("o->"+s1);
			System.out.println("C->"+k);
			
			
			s1.setsId(1003);
			s1.loc.setLocName("Karimnagar");
			System.out.println("-------------------------------------------");
			System.out.println("ch->"+s1);
			System.out.println("cs->"+k);
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
