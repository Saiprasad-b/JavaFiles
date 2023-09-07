package MultipleTicketBooking;

public class Ticket {
	 public static int tickets=100;
     public synchronized void book(int booked) {
    	 tickets = tickets-booked;
    	 System.out.println(Thread.currentThread().getName()+"----->"+tickets);
	
}
	public static void main(String[] args) {
		Ticket tk = new Ticket();
		Thread t = new Thread() {
			public void run() {
				tk.book(40);
			}
		};
		Thread t1 = new Thread() {
			public void run() {
				tk.book(20);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				tk.book(10);
			}
		};
		t.start();
		t1.start();
		t2.start();


	}

}
