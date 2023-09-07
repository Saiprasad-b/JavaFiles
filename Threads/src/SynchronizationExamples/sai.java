package SynchronizationExamples;

//in this case there is no  parallel Thread Operation bcz we usd synchronized method

public class sai {

			public synchronized void m1() {
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
				sai s = new sai();
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
				Thread t2 = new Thread() {
					public void run() {
						s.m1();
					}
				};
				t.start();
				t1.start();
				t2.start();


			}



	}

