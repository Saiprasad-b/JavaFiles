package SynchronizedBlocks;
// same as the static synchronized when two objects call the same method,we use here Class_name.class 
public class TwoObjects {
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
		synchronized (TwoObjects.class){
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
		TwoObjects s = new TwoObjects();//object1
		
		TwoObjects i = new TwoObjects();//object 2
		
		Thread t = new Thread() {
			public void run() {
				s.m1();
				
			}
		};t.start();
		
		Thread t1 = new Thread() {
			public void run() {
				i.m1();
				
			}
		};t1.start();

	}

	
}
