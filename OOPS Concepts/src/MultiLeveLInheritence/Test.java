package MultiLeveLInheritence;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//subclass reference Holding SubClass Object
		Child c= new Child();// 
		
		//superclass reference Holding SuperClass Object
		Parent p= new Parent(); //
		
		//superclass reference Holding SuperClass Object
		GrandParent gp= new GrandParent();
		
		
		
		//superclass reference Holding SubClass Object
		System.out.println("-----------next--------");
		
		//superclass reference Holding SubClass Object
		GrandParent gpp1= new Parent();
		//gpp1 is the reference and Parent object is created and
		//...only GrandParent methods are executed for Parent Values
		gpp1.house();
		gpp1.Land();
		
		
		System.out.println("-----------next--------");
		
		
		GrandParent gpc = new Child();
		//only GrandParent methods are executed
		gpc.house();
		gpc.Land();
		
		//superclass reference Holding SubClass Object
		Parent P1= new Child();//[child object created but Parent methods are called]
		//only parent methods are executed
		P1.gold();//this is from parent
		P1.house();//this is from child
		P1.Land(); // this is from grandParent.(as GrandParent extends Parent
		// the properties of grand parent is inherited to parent.)
				
		
	}
	

}
