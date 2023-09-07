package Throw;

public class ATM {
	
	
		static double bal =20000;
		static double wdraw  =5000;
		static boolean server =true;
		

	public static void main(String[] args) throws ServerDown,ShowBalance {
		// TODO Auto-generated method stub
		if(wdraw<=bal && server) {
			bal = bal-wdraw;
			String money = String.valueOf(bal);
			throw new ShowBalance(money);
		}
		else if(wdraw>=bal && server) {
			System.out.println("Insufficient Balance");
		}
		else {
			// throw key word is used to throw the custom Exception
			throw new ServerDown("NO server");
			
		}
			
				
			}
	}

