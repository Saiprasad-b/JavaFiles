package Throws;
//object class
//threads
//collections
//String bf rds
//Serialization


public class Introduction {
	public void m1 () throws ArithmeticException {
		System.out.println(10/0);//exception
		// unckecked Exception
	}
	
	public void m2() {// here we given tryb catch to the exception
		try {
		System.out.println(10/0);
	}catch(Exception e) {
		System.out.println(e);
	}
	}
	
	
	public void chkdn() throws ClassNotFoundException  {
		Class.forName("dbbab.Introduction");//exception occured(checked exception)
		
	}
	
	public static void main(String[] args) throws ArithmeticException {
		Introduction i = new Introduction();
	   i.m1();//no error for Runtime Exception
	   //i.chkdn();// in calling method we should give the throws Exception
		i.m2();
		
		
	}
}
