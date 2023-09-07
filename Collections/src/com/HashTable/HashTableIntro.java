package com.HashTable;

import java.util.Hashtable;

public class HashTableIntro {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(110, "abc");
		ht.put(102, "fgh");
		ht.put(102, "fgh");
		ht.put(103, "fgh");
		
	
		System.out.println(ht);
		
		//in this HashTable , it will not allows the null valurs for both keys and values
		// no duplicates allowed
	}
}
