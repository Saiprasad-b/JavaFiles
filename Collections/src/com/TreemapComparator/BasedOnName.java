package com.TreemapComparator;

import java.util.Comparator;

public class BasedOnName implements Comparator<StudentTreeMap> {

	@Override
	public int compare(StudentTreeMap o1, StudentTreeMap o2) {
		String s1 = o1.getsName();
		String s2 = o1.getsName();
		return s1.compareTo(s2);
	}
	
}
