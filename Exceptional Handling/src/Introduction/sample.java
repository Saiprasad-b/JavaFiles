package Introduction;

public class sample {
	public static void main(String[] args) {
		System.out.println("JVM called main method and main started");
		sample s = new sample();
		s.m1();
		System.out.println("Stack memory is deletd and JVM ends here");
	}
public void m1() {
	System.out.println("m1 started");
	try {m2();}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("m1 ended");
}
public void m2() {
	String s =null;
	System.out.println(s.length());
	System.out.println("m2 started");
	m3();
	System.out.println("m2 ended");
}
public void m3() {
	System.out.println("m3 started");
	System.out.println("m3 ended");
}
}
