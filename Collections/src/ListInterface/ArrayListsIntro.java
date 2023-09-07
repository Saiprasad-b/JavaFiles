
package ListInterface;

import java.util.ArrayList;

public class ArrayListsIntro {
//this allows duplicate values and null values
//insertion order is preserved
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k = new ArrayList();
		k.add(90);
		k.add("Sai");
		k.add(90.90);
		k.add(true);
		k.add("Sai");
		
		
		System.out.println(k.toString());
		ArrayList i = new ArrayList<>();
		i.add("SIVA");
		i.add("Sai");
		
		
		//i.add(45);
		k.addAll(i);
		System.out.println(k);
		System.out.println(k.remove(5));
		System.out.println(k);
		//to remove integer value.. we have to create the Integer value for that
		Integer e = new Integer(90);
		System.out.println(k.remove(e));//returns boolean value
		
		System.out.println(k.contains("Sai"));
		k.add(1 ,"SIVA");//here the value is added and elemnts get shifted
		
		k.set(1, "SaiPrasad");// here the value is cahngd r modified in that particular index
		System.out.println(k);
		System.out.println(i.equals(k));
		System.out.println(k.contains("Sai")+" --->contains Condition");
		
		System.out.println(k.lastIndexOf("Sai"));
		System.out.println(k.hashCode());
		System.out.println(k.isEmpty());
		k.clear();
		System.out.println(k);
		
	
	}

}
