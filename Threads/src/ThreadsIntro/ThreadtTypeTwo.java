package ThreadsIntro;

public class ThreadtTypeTwo extends Thread {
	
	
	public void run() {
		System.out.println("run---->"+Thread.currentThread().getName());
	}
	public void start() {
		System.out.println("run---->"+Thread.currentThread().getName());
		super.start();// here when we give super.start we goes to parrent start method
		//which will create a thread for us.
		//so when we overide the start method we must give thee super to crate a thread
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadtTypeTwo t  = new ThreadtTypeTwo();
		t.start();
		t.run();
		t.setName("Sai Thread");
		
		
	}

}
