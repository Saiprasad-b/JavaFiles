package InheritenceTwo;

public class Inherit {
public static void main(String[] args) {
	
	//subclass reference Holding SubClass Object
	SubClass s= new SubClass();
	
	//superclass reference Holding SuperClass Object
	SuperClass sp= new SuperClass();
	
	
	//subclass reference cannot Hold SuperClass Object
	// example of byte and int 8data types
	//SubClass s= new SuperClass();
	
	//superclass reference Holding SubClass Object
	SuperClass s1= new SubClass();
	
	/**NOTE:
	 * but here in this case only SuperClass methods/variables get executed
	 * if there is same method in both classes then the method is called...
	 *  ...from  the subclass method
	 */
	s1.house();
	s1.gold();
	
	
}
}
