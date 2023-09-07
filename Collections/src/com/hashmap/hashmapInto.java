package com.hashmap;
import java.util.*;
public class hashmapInto {

	public static void main(String[] args) {
		//HashMap<key ,value> hm = new HashMap<>();
		
		
		LinkedHashMap<Integer, String>lh = new LinkedHashMap<>();
		
		HashMap hm =  new HashMap<>();
		hm.put(101, "Sai");
		hm.put(102, "Siva");
		hm.put(new Student(1001, "Saiprasad", 99.90, "B.tech"), "Saiprasad");
		hm.put(new Student(1002, "Saiprasad", 99.90, "B.tech"), "Saiprasad");
		
		
		System.out.println(hm);
		
		
	}

}
