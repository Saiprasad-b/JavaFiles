package com.TreemapComparator;

import java.util.Comparator;

public class BasedOnID implements Comparator<StudentTreeMap> {

	@Override
	public int compare(StudentTreeMap o1, StudentTreeMap o2) {
		Integer i1 = o1.getSid();
		Integer i2 = o2.getSid();
		return i1.compareTo(i2);
	}
	
}
