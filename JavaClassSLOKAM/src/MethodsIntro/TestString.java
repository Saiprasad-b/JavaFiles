package MethodsIntro;

public class TestString {
     public String display(String name , String Greet) {
    	 return (name+Greet);
     }
	public static void main(String[] args) {
		TestString ts = new TestString();
		
		String msg = ts.display("Sai ,", "Good Morning");
		System.out.println("Hello "+msg+" ,Have a nice Day");
	}

}
