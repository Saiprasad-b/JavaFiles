package com.exerciseOne;

import java.util.Comparator;

public class BasedOnMarks implements Comparator<StudentPojo> {

	@Override
	public int compare(StudentPojo o1, StudentPojo o2) {
		Double d1 = o1.getsMarks();
		Double d2 = o2.getsMarks();
		return d2.compareTo(d1);
		
	}

	
	
	
}
