package SynchronizationExamples;

public class Two {
	
	public synchronized  void m1() {
		for(int i =1;i<=10;i++) {
			try {
				Thread.sleep(02000);
				System.out.println(Thread.currentThread().getName()+"---->"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}

	public static void main(String[] args) {
		Two g = new Two();
		Two g1 = new Two();
		Thread t = new Thread() {
			
			public void run() {
				g.m1();
				g1.m1();
				
			}
			
		};
		
		t.start();
		}
	}

