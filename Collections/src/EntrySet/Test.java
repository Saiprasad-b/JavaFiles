package EntrySet;


import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1,"abc");
		hs.put(2,"xyz");
		hs.put(3,"mnc");
		hs.put(4,"TCS");
		
		
		
		
		
		
		// 1.->using EntrySet
		Set<Map.Entry<Integer, String>> b = hs.entrySet();
		for(Map.Entry<Integer, String> j:b) {
			System.out.println(j);
		}
		
		
		System.out.println("--------------------------------------------------------");
		
		//--------------------------------------------------------------------------//
		
		LinkedHashMap<Employe , Department> lh = new LinkedHashMap<>();
		lh.put(new Employe(101,"Saiprasad",12000.00), new Department(101, "IT"));
		lh.put(new Employe(102,"Shivaprasad",13000.00), new Department(101, "PE"));
		lh.put(new Employe(103,"Srinivas",14000.00), new Department(101, "SE"));
		lh.put(new Employe(104,"Sai",15000.00), new Department(105, "IT"));
		lh.put(new Employe(105,"Shiva",16000.00), new Department(105, "IT"));
		
		
		
		//System.out.println(lh.isEmpty());
		
		System.out.println("//1.-> using EntrySet");
		//1.-> using EntrySet
		Set<Map.Entry<Employe, Department>> s = lh.entrySet();
		for(Map.Entry<Employe,Department> k :s) {
			System.out.println(k.getKey()+"---->"+k.getValue());
		}
		
		System.out.println("------------------------------------------------------------------");
		//2.-> Using Set of Keys
		System.out.println("//2.-> Using Set of Keys");
		
		Set<Employe> d= lh.keySet();
		for(Employe e :d) {
			System.out.println(e+"----->"+lh.get(e));
		}
		
		
		//Using Iterator ,Map doesnt have Iterators so we use Set and Iterate them.
		//----------------------------------------------------------------------------
		System.out.println("//----------------------------------------------------------------------------");
		Set<Integer> q = new HashSet<>();
		q.add(12);
		q.add(45);
		
		Iterator<Integer>  c = q.iterator();
		while(c.hasNext()) {
			Integer z = (Integer) c.next();
			System.out.println(z);
		}
		//simillarly,
		System.out.println("-----------simillarly--------------");
		
		Set<Map.Entry<Employe, Department>> p = lh.entrySet();
		Iterator<Map.Entry<Employe, Department>> it = p.iterator();
		while(it.hasNext()) {
			Map.Entry<Employe, Department> v = it.next();
			System.out.println(v);
		}
	
	}

}
