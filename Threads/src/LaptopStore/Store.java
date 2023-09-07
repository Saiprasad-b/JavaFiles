package LaptopStore;

public class Store {
	public static int lapCount=30;
	public void customerOrder(int order_count) throws InterruptedException {
		if(order_count <=lapCount && lapCount>=10) {
			System.out.println("Order has been delivered--->" +order_count);
		}
		else {
			System.out.println("Please wait for Store Order");
			synchronized(this) {
				System.out.println("in wait mode");
			wait();
			System.out.println("in notify mode");
			}
		}
		
	}
	
	public void storeOrder(int store_order){
		System.out.println("Order has been placed for the store"+store_order);
		lapCount +=store_order;
		System.out.println("total lap in store  --->"+lapCount);
		synchronized (this) {
		try {
		notifyAll();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
}
