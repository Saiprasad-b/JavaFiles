package ThreadsIntro;

public class ThreadsIntro extends Thread {

	//thread creation we need start method and run method
	// basically we need to extend the thread class to create thread
	//in thread class there is start method which creates thread
	// and start method calls run method 
	// we need to override that run method in our custom class
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		m1();
		m2();
	}
	public static void m2() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static  void m1() {
		for(int i=1;i<=10;i++) {
			System.out.println("m1----->" +Thread.currentThread().getName() +i);
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadsIntro t= new ThreadsIntro();
		t.start();
		m2();
		m1();
		
	}
}
