package com.treeMap;
import java.util.*;
public class TreeMapIntro {

	public static void main(String[] args) {
		TreeMap<StudentTreeMap , Integer> tm = new TreeMap<>();
		tm.put(new StudentTreeMap(1001, "Saiprasad", 88.0, "B.tech"), 1);
		tm.put(new StudentTreeMap(1001, "ShivaPrasad", 88.0, "B.tech"), 1);
		tm.put(new StudentTreeMap(1001, "KGF", 88.0, "B.tech"), 1);
		tm.put(new StudentTreeMap(1001, "Rocky", 88.0, "B.tech"), 1);
		
		System.out.println(tm);
	}

}
