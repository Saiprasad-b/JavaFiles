package ThreadStates;

public class One extends Thread{
	public void run() {
		for(int i =0;i<=10;i++) {
		System.out.println(Thread.currentThread().getName()+"-------"+i);
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		}
	public static void main(String[] args) {
		One o = new One();
		Thread t = new Thread(o);
		t.start();
		t.setName("ABC");
		
		Thread t1 = new Thread(o);
		t1.start();
		t1.setName("XYZ");

	}

}
