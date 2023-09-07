package WaitNotify;

public class Bank {
	public static double bal=10000;
	public void withDraw(double wdraw_amount) {
		System.out.println("Enter the Amount to withdraw--->"+wdraw_amount);
		if(wdraw_amount<=bal) {
		bal = bal-wdraw_amount;
		System.out.println("Balance Amount--->"+bal);
	}
		else {
			System.out.println("Insuffircient funds");
			synchronized(this) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		
	}
	public void deposit(double deposit_amount) {
		System.out.println("Enter  Deposit Amount"+deposit_amount);
		bal = bal+deposit_amount;
		System.out.println("Total Balance After Deposit"+bal);
		synchronized(this) {
			try {
				notify();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}
}
