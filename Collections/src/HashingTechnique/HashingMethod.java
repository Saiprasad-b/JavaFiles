package HashingTechnique;
import java.util.*;

public class HashingMethod {
/*
 * All Wrapper classes OverRide hashcode method and it generates hashcode based on content
 *.equal method is also overrided for content comparision
 
 *---------------------------------------------------------------------------*
 
 *Object class hashcode -->  returns the adress of the object in heap memory
 *.equals in Object --> Content Comparision 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add("sai");
		hs.add(12);
		System.out.println(hs);
		
		hs.add(new Student(1,"SaiPrasad",90.90,"B.tech"));
		hs.add(new Student(1,"SaiPrasad",90.90,"B.tech"));
		System.out.println(hs);
		
		
	}

}
