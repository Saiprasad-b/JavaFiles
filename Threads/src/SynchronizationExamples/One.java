package SynchronizationExamples;
// in this case also there is parallel operation
public class One {

//	public  synchronized void m1() {
//		for(int i=1;i<=20;i++) {
//			try {
//				Thread.sleep(1000);
//				System.out.println(Thread.currentThread().getName()+"----->"+i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//	}
//	}
//	public void m2() {
//		for(int i=1;i<=20;i++) {
//			try {
//				Thread.sleep(1000);
//				System.out.println(Thread.currentThread().getName()+"----->"+i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//	}
//	}
	public static synchronized void m1() {
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"----->"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}
	public static synchronized void m2() {
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"----->"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}
	public static void main(String[] args) {
		One s = new One();
		Thread t = new Thread() {
			public void run() {
				s.m1();
				
			}
		};
		Thread t1 = new Thread() {
			public void run() {
				s.m2();
				
			}
		};
	
		t.start();
		t1.start();
		


	}



}