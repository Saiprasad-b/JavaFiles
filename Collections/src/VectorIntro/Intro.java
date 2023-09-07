package VectorIntro;

import java.util.*;

public class Intro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector k = new Vector();
		k.add(90);
		k.add("Sai");
		k.add(90.90);
		k.add(true);
		k.add("Sai");
		System.out.println(k);
		
		Enumeration e  = k.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
}
}
