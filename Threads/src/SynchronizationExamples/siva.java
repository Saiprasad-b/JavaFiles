package SynchronizationExamples;

// in this case there is parallel Thread Operation

public class siva {

			public static void m1() {
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
				siva s = new siva();
				Thread t = new Thread() {
					public void run() {
						m1();
						
					}
				};
				Thread t1 = new Thread() {
					public void run() {
						m1();
						
					}
				};
				Thread t2 = new Thread() {
					public void run() {
						m1();
					}
				};
				t.start();
				t1.start();
				t2.start();


			}



	}
