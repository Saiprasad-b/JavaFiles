package LinkedListIntro;

import java.util.Iterator;
import java.util.LinkedList;

public class Introd {

	public static void main(String[] args) {
		LinkedList ll=  new LinkedList();
		ll.add("Sai");
		ll.add(12);
		ll.add(true);
		ll.add("Siva");
		ll.add(99.90);
		System.out.println(ll);
		ll.addFirst(10 );
		
		System.out.println(ll.get(2));
		Iterator i = ll.iterator();
		while(i.hasNext()) {
	
			System.out.println(i.next());
		}
		

	}

}
