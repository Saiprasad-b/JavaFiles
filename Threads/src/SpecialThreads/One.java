package SpecialThreads;

public class One{
	
	public static void m1() {
		System.out.println(Thread.currentThread().getName()+"--->M1");
		
	};
	public static void m2() {
		System.out.println(Thread.currentThread().getName()+"--->M2");
		
	};
	public void run() {
		m1();
		m2();
	}
	public static void main(String[] args) {
		
		One o1 = new One();//thread1
		
		Thread t = new Thread() {
			public void run() {
				
				m1();
			}
		};
		Thread t1 = new Thread() {
			public void run() {
				
				m2();
			}
		};
		t.start();
		t.setName("AAAA");
		t1.start();
		t1.setName("BBBB");
	}
	
}
