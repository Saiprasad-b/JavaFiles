package Throw;

public class ShowBalance extends RuntimeException {
	public  ShowBalance() {
		
	}
	
public ShowBalance(String message) {
		super(message);
	}
}
