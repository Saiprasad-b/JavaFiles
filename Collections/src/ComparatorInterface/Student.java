package ComparatorInterface;

import java.util.*;

public class Student implements Comparator<Student> {
	 int sid;
	 String sName;
	 double sMarks;
	 String sQual;
	public int getSid() {
		return sid;
	}
	public Student() {};
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsMarks() {
		return sMarks;
	}
	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}
	public String getsQual() {
		return sQual;
	}
	public void setsQual(String sQual) {
		this.sQual = sQual;
	}
	public Student(int sid, String sName, double sMarks, String sQual) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sMarks = sMarks;
		this.sQual = sQual;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sName=" + sName + ", sMarks=" + sMarks + ", sQual=" + sQual;
	}
	@Override
	public int compare(Student o1, Student o2) {
		
		return 0;
	}

}