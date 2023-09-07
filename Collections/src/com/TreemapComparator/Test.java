package com.TreemapComparator;

import java.util.TreeMap;

public class Test {
	
		public static void main(String[] args) {
			TreeMap<StudentTreeMap , Integer> tm = new TreeMap<>(new BasedOnID());
			tm.put(new StudentTreeMap(1001, "Saiprasad", 88.0, "B.tech"), 101);
			tm.put(new StudentTreeMap(1002, "Sai", 88.0, "B.tech"), 102);
			tm.put(new StudentTreeMap(1004, "KGF", 88.0, "B.tech"), 101);
			tm.put(new StudentTreeMap(1003, "Rocky", 88.0, "B.tech"), 103);
			
			System.out.println(tm);
			
		}

	}

