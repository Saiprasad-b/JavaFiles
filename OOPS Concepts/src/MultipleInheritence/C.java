package MultipleInheritence;

public class C implements B{

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj = new C();
		obj.a();
		obj.add();
		obj.b();
		obj.d();
		//now when we call variable it leads to ambiguity so we need to
		// call by its interface name
		
		System.out.println(A.cons);
		System.out.println(B.cons);}

	public void add() {
		System.out.println("Add method in both interface");
		}
		
	public void b() {
		System.out.println("method b in B Interface");
		
	}
	
	public void a() {
		System.out.println("Method a in A interface");
	}
	public void d() {
		System.out.println("Method a in A interface");
	}

}
