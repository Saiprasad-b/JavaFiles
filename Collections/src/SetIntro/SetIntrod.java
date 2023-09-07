package SetIntro;

import java.util.*;

//set doesn't allow Duplicates
//Insertion order is not preserved
public class SetIntrod {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		Emp e1 =new Emp(101,"sai",100010.00);
		Emp e2 =new Emp(102,"siva",200010.00);
		Emp e3 =new Emp(103,"suppy",300010.00);
		Emp e4 =new Emp(101,"sai",100010.00);// this is duplicate Element
		// adding Employe objects to the hashSet.
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		
		Iterator i =hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
