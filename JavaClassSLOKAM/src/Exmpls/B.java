package Exmpls;
public class B {
	//Scanner s =new Scanner(System.in);
	
	
	int a =10;//instance variable(create object)
	public int Sai() {//instance method(create object)
		System.out.println("Sai--Instance");
		return 10;
	}
	
	
	static int k =80;
	public static void Siva() {
		System.out.println("Siva--static");
	}
	public static void main(String[] args) {
		System.out.println(k);
		k=60;
		Siva();
		System.out.println(k);

}
	}
