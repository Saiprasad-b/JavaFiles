package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList s = new ArrayList();
		Emp e = new Emp(104,"AK",40000.222);
		
		  s.add(new Emp(101,"Sai",10001.5));
		  s.add(new Emp(102,"Siva",20000.90));
		  s.add(new Emp(103,"ram",30000.60));
		
		s.add(e);
		//s.add(new Dep(1,"SE"));
		//System.out.println(s);
		// so to iterate the array to display separately
		Iterator k = s.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
	}

}
