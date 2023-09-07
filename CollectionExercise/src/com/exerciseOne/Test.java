package com.exerciseOne;

import java.util.*;


public class Test {

	public static void main(String[] args) {
		HashSet<StudentPojo> hs = new HashSet<>();
		hs.add(new StudentPojo("Sai", 101, 70.23));
		hs.add(new StudentPojo("Siva", 102, 98.90));
		hs.add(new StudentPojo("Siva", 102, 98.90));
		
		
		Iterator ihs = hs.iterator();
		System.out.println("HashSet----->");
		while(ihs.hasNext()) {
			System.out.println(ihs.next());
		}
		System.out.println("------------------------------------------------------------------");
		//------------------------------------------------------------------//
		
		//TREE SET
		// comapring on sName with Comparable Interface in StudentPojo Class
		
		TreeSet<StudentPojo> ts =  new TreeSet<>();
		ts.add(new StudentPojo("sai", 101, 98.99));
		ts.add(new StudentPojo("ram", 102, 78.99));
		ts.add(new StudentPojo("abhimanyu", 100, 99.99));
		ts.add(new StudentPojo("vishAL", 105, 99.98));
		
		System.out.println("TreeSet----->");
		System.out.println("------------------------------------------------------------------");
		
		Iterator its = ts.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
		System.out.println("------------------------------------------------------------------");
//--------------------------------------------------------------------------------------//
		
		//Treeset based on Marks with BasedOnMarks class with Comparator Class
		TreeSet<StudentPojo> mts =  new TreeSet<>(new BasedOnMarks());
		mts.add(new StudentPojo("Sai", 101, 98.99));
		mts.add(new StudentPojo("Siva", 102, 78.99));
		mts.add(new StudentPojo("abhimanyu", 100, 99.99));
		mts.add(new StudentPojo("Jatayu", 105, 99.98));
		System.out.println("TreeSet Based On Marks----->");
		System.out.println("------------------------------------------------------------------");
		Iterator<StudentPojo> mits = mts.iterator();
		while(mits.hasNext()) {
			System.out.println(mits.next());
		}
		
		
		System.out.println("------------------------------------------------------------------");
//--------------------------------------------------------------------------------------//
		
		
		//HashMap
		
		HashMap<StudentPojo, String> hm = new HashMap<>();
		hm.put(new StudentPojo("abhimanyu", 101, 99.99), "B.tech");
		hm.put(new StudentPojo("jatayu", 102, 98.99), "Bsc");
		hm.put(new StudentPojo("Krishna", 107, 97.99), "B arch");
		hm.put(new StudentPojo("Mahi", 777, 77.77), "B.tech");
		System.out.println("HashMap----->");
		System.out.println("------------------------------------------------------------------");
		Set<Map.Entry<StudentPojo, String>> hms =hm.entrySet();
	Iterator<Map.Entry<StudentPojo, String>> ihms =	hms.iterator();
	while(ihms.hasNext()) {
		System.out.println(ihms.next());
	}
	
	System.out.println("------------------------------------------------------------------");
	//----------------------------------------------------------------------------------------//4
	
	TreeMap<StudentPojo, String> tm = new TreeMap<>(new BasedOnName());
	tm.put(new StudentPojo("abhimanyu", 101, 99.99), "B.tech");
	tm.put(new StudentPojo("jatayu", 102, 98.99), "Bsc");
	tm.put(new StudentPojo("krishna", 107, 97.99), "B arch");
	tm.put(new StudentPojo("mahi", 777, 77.77), "B.tech");
	System.out.println("TMap basd on name----->");
	System.out.println("------------------------------------------------------------------");
	
	
	Set<Map.Entry<StudentPojo, String>> tms =tm.entrySet();
	Iterator<Map.Entry<StudentPojo, String>> itms =	tms.iterator();
	while(itms.hasNext()) {
		System.out.println(itms.next());

	}
	System.out.println("------------------------------------------------------------------");
	//----------------------------------------------------------------------------------------//
	

	TreeMap<StudentPojo, String> tmc = new TreeMap<>(new BasedOnMarks());
	tmc.put(new StudentPojo("abhimanyu", 101, 99.99), "B.tech");
	tmc.put(new StudentPojo("jatayu", 102, 98.99), "Bsc");
	tmc.put(new StudentPojo("Krishna", 107, 97.99), "B arch");
	tmc.put(new StudentPojo("Mahi", 777, 77.77), "B.tech");
	System.out.println("TMap based On Marks----->");
	
	System.out.println("------------------------------------------------------------------");
	//1.-> Using Entry Set
	System.out.println("//1.-> Using ENtry Set");
	
	
	Set<Map.Entry<StudentPojo, String>> a =tmc.entrySet();
	for(Map.Entry<StudentPojo, String> k:a) {
		System.out.println(k.getKey()+"------>"+k.getValue());
	}
	
	// 2 .using Iterator
	System.out.println("------------------------------------------------------------------");
	
	System.out.println("//2.-> Using Iterator");
	System.out.println("------------------------------------------------------------------");
	
	Set<Map.Entry<StudentPojo, String>> tmcs =tmc.entrySet();
	Iterator<Map.Entry<StudentPojo, String>> itmcs =tmcs.iterator();
	while(itmcs.hasNext()) {
		System.out.println(itmcs.next());

	}
	
	//Keyset
	System.out.println("------------------------------------------------------------------");
	//3.-> Using Set of Keys
	System.out.println("//3.-> Using Set of Keys");
	System.out.println("------------------------------------------------------------------");
	
	Set<StudentPojo> d= tmc.keySet();
	for(StudentPojo e :d) {
		System.out.println(e+"----->"+tmc.get(e));
	}
	
	}	
}
