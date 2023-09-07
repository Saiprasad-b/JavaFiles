package SynchronizationExamples;

public class Three {

		public  void m1() {
			for(int i=1;i<=20;i++) {
				try {
					Thread.sleep(2000);
					System.out.println(Thread.currentThread().getName()+"----->"+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		}
		public static void m2() {
			for(int i=1;i<=20;i++) {
				try {
					Thread.sleep(2000);
					System.out.println(Thread.currentThread().getName()+"----->"+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		}
		public synchronized void m3() {
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
		public static synchronized void m4() {
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
			Three s = new Three();
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
			Thread t2 = new Thread() {
				public void run() {
					s.m3();
				}
			};
			Thread t3 = new Thread() {
				public void run() {
					s.m4();
				}
			};
			t.start();
			t1.start();
			t2.start();
			t3.start();

		}


	}

