package LaptopStore;

public class Customer {

	public static void main(String[] args) {
	Store s  = new Store();
	Thread t = new Thread() {
		public void run() {
			try {
				s.customerOrder(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	t.start();
	Thread t1 = new Thread() {
		public void run() {
			try {
				s.customerOrder(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};t1.start();
	Thread t2 = new Thread() {
		public void run() {
			try {
				s.customerOrder(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};t2.start();
	Thread t3 = new Thread() {
		public void run() {
			try {
				s.storeOrder(20);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};t3.start();
	
	
}
	}
