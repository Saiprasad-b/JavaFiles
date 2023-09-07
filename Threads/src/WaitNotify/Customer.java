package WaitNotify;

public class Customer {

	public static void main(String[] args) {
		Bank b= new Bank();
		Thread t = new Thread() {
			public void run() {
				b.withDraw(5000);
			}
		};
		
		t.start();
		
		Thread t1 = new Thread() {
			public void run() {
				b.deposit(10000);
			}
		};
		
		t1.start();
		

	}

}
