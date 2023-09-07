package ThrowsExmp;

public class Example {

	public static void m1() throws ArithmeticException {
		System.out.println(10 / 0);
	}

	public static void m2() throws ClassNotFoundException {
		Class.forName("hvjhvvv.fjvw.k");
	}

	public static void main(String[] args) {
		try{m1();}
		catch(ArithmeticException e) {
			System.out.println(e);
			}
		try{
			m2();}
		
		catch(Exception e1) 
		{
			System.out.println(e1);
		}
		
		
		
		
		
	}
}
