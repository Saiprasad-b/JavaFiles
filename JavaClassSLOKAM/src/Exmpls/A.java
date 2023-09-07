package Exmpls;

public class A {
	int a1 =10;//inst var
	public void Sai() {//instnce method
		System.out.println("Sai ----instance ");
	}
	public static void Siva() {
		System.out.println("siv ----static ");
	}
public static void main(String[] args) {
	Siva();
	A a = new A();
	a.Sai();
	System.out.println(a.a1);
	
}
}
