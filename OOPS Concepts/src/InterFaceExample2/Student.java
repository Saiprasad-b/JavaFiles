package InterFaceExample2;

public class Student {
	public static void main(String[] args) {
	
	Fee n;
	n = new Narayana();
	if(n.Marks(650)){
		double cfee= n.Cfee(70000);
		System.out.println("Narayana---------"+cfee);
	}
	else {
		System.out.println("Please Check your Score");
	}
	
	
	Fee sr = new SR();
	
	if(sr.Marks(650)){
		double cfee= sr.Cfee(50000);
		System.out.println("SR---------"+cfee);
	}
	else {
		System.out.println("Please Check your Score");
	}
	
   Fee sree = new Sreech();
	
	if(sree.Marks(650)){
		double cfee= sr.Cfee(60000);
		System.out.println("SREE---------"+cfee);
	}
	else {
		System.out.println("Please Check your Score");
	}
	
}
}
