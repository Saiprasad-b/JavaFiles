package TreeSet;
import java.util.*;
public class Introd {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		

		Student s1 = new Student(101 ,"Saiprasad",99.09,"B.tech");
		Student s2 = new Student(102 ,"Saiprasad",99.09,"B.tech");
		Student s3 = new Student(103 ,"Shiva",98.09,"B.tech");
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		
		
		
		Iterator e = t.iterator();
		while(e.hasNext()){
			System.out.println(e.next());	
		}
		//System.out.println(t);
	}

}
