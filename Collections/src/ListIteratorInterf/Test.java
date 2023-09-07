package ListIteratorInterf;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("suresh");
		al.add("Ramesh");
		al.add("Five");
		al.add("Star");

		
		ListIterator l  =al.listIterator();
		
		
		while(l.hasNext()) {
			
		if(l.next().equals("Five")){
			l.set("Five star add");
		}
		}
		while(l.hasNext()) {
			
				System.out.println(l.next());}
		
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		
		System.out.println(al);
	}
		
}
