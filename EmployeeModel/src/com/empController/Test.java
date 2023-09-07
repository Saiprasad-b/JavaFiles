package com.empController;
import java.util.*;

import com.empPojo.Employee;

public class Test {

	public static void main(String[] args)  {
		empController emp =  new empController();
		List<Employee> data =  new ArrayList<>();
		data =emp.getdata();
		
		Iterator<Employee> i =data.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

		Employee dataById = emp.getByID(101);
		
		System.out.println(dataById);
		
		
		
		List<Employee> dataByName = new ArrayList<>();
		dataByName = emp.getDataByName("Sai");
		System.out.println(dataByName);
		
		
		
		Employee dataByIdAndName = emp.getDataByIdAndName("Jatayu",103);
		System.out.println(dataByIdAndName);
		
	}

}
