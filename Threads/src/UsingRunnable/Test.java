package UsingRunnable;

public class Test implements Runnable {
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("run---->"+Thread.currentThread().getName()+"---->"+i);	
	}
	}
    
	public static void main(String[] args) {
		//thread//
		Runnable t2 = new Test();
		Test t1 = new Test();
		Thread t = new Thread(t1); 
		Thread t3 = new Thread(t2);
	
		
		
		//here Thread constructor is of argumented so we should give the parameter
		//so the Test is child of Runnable Interface,so it can hold its reference.
		//
		t.start();//created thread
		t.setName("SAI");
		t3.start();
		t3.setName("SHIVA");
		
		
	}

}
