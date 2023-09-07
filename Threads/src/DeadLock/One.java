package DeadLock;
public class One {

	final static String name1="Sandeep";
	final static String name2="Amar";
	public void m1() {
		synchronized (name1) {
			System.out.println("m1---->"+name1);
			synchronized (name2) {
				System.out.println("m1---->"+name2);	
		 }
		}
	}
	public void m2() {
		synchronized (name2) {
			System.out.println("m2---->"+name2);
			synchronized (name1) {
				System.out.println("m2---->"+name1);		
			}
		}	
	}
		
	public static void main(String[] args) {
		One o = new One();
		Thread t = new Thread() {
			public void run() {
				o.m1();
			}
		};
		
		
		
		Thread t1 =  new Thread() {
			public void run() {
				o.m2();
			}
		};
		
		
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t.start();
	}

}
