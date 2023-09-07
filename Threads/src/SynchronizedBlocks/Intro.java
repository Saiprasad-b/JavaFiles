package SynchronizedBlocks;


public class Intro {
	public  void m1() {
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"---for1-->"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		synchronized (this) {
			
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"---for2-->"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}
		}
		}
	public static void main(String[] args) {
		Intro s = new Intro();
		Thread t = new Thread() {
			public void run() {
				s.m1();
				
			}
		};
		Thread t1 = new Thread() {
			public void run() {
				s.m1();
				
			}
		};
		
		t.start();
		t1.start();


	}



	

}
