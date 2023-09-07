package com.exerciseOne;

import java.util.Comparator;

public class BasedOnName implements Comparator<StudentPojo>{

	@Override
	public int compare(StudentPojo o1, StudentPojo o2) {
		String s1 = o1.getsName();
		String s2 = o2.getsName();
		return s1.compareTo(s2);
	}
	

}
