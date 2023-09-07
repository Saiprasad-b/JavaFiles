package DeadLock;

public class Test {
	final static String name1="Sandeep";
	final static String name2="Amar";
	public void m1(String n1) {
		System.out.println("M1---->"+n1);
		System.out.println("M1---->"+name2);
		
		
		
	}
	public void m2(String n2) {
		System.out.println("M2---->"+n2);
		System.out.println("M2---->"+name1);
		
		
	}
	public static void main(String[] args) {
		Test o = new Test();
		Thread t = new Thread() {
			public void run() {
				o.m1(name1);
			}
		};t.start();
		
		
		Thread t1 =  new Thread() {
			public void run() {
				o.m2(name2);
			}
		};t1.start();
	}
}


