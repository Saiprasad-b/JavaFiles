package com.empController;
import java.util.ArrayList;
import java.util.List;
import com.empDao.*;
import com.empPojo.Employee;


public class empController {
private empDao ed = new empDao();
	
	public List<Employee> getdata()  {
		System.out.println("---Controller Started---");
		List<Employee> data = ed.getdata();
		System.out.println("---Controller ENded---");
		return data;
		
	}
//get by Id--single Pojo
//getby Name--
//getby Id Nd Name
public Employee getByID(int eid){
	return ed.getById(eid);
	
		}
public List<Employee> getDataByName(String eName) {
	
	return ed.getDataByName(eName);
}
public Employee getDataByIdAndName(String eName, int eid) {
	// TODO Auto-generated method stub
	return ed.getDataByIdAndName(eName,eid);
}
}