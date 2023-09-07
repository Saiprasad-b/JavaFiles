package com.empDao;
import com.empPojo.*;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.empPojo.Employee;

public class empDao {
	private Employee emp = new Employee();
	FileReader fr = null;
	BufferedReader br = null;
	

	public List<Employee> getdata(){
		
		System.out.println("----Started DAO Layer---");
		List<Employee> data = new ArrayList<>();
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Employee.txt");
			br =new BufferedReader(fr);
			for(String h = br.readLine();h!=null; h = br.readLine()) {
				String[] k = h.split(",");
				Employee  e = new Employee(Integer.parseInt(k[0]), k[1], Double.valueOf(k[2]), k[3]);
				data.add(e);
			}
			System.out.println("----Ended DAO Layer---");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return data;
	}
	
	public Employee getById(int eid){ 
		
	Employee dataById = null;
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Employee.txt");
			br =new BufferedReader(fr);
			for(String h = br.readLine();h!=null; h = br.readLine()) {
				String[] k = h.split(",");
				int a = Integer.parseInt(k[0]);
				if(a==eid){
					dataById = new Employee(Integer.parseInt(k[0]), k[1], Double.valueOf(k[2]), k[3]);
					
				}
				
			}
	
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		return  dataById;
	
	}

	public List<Employee> getDataByName(String eName) {
		List<Employee> dataByName = new ArrayList<>();
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Employee.txt");
			br =new BufferedReader(fr);
			for(String h = br.readLine();h!=null; h = br.readLine()) {
				String[] k = h.split(",");
				
				if(k[1].equals(eName)) {
					dataByName.add(new Employee(Integer.parseInt(k[0]), k[1], Double.valueOf(k[2]), k[3]));
				}
				
			}
			
				
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return dataByName;
		
	}

	public Employee getDataByIdAndName(String eName ,int eid) {
		Employee dataByIdAndName = null;
		try {
			fr = new FileReader("C:\\Users\\kranthi\\Desktop\\Employee.txt");
			br =new BufferedReader(fr);
			for(String h = br.readLine();h!=null; h = br.readLine()) {
				String[] k = h.split(",");
				int d = Integer.parseInt(k[0]);
				if(k[1].equals(eName)&& d==eid ) {
					dataByIdAndName=(new Employee(Integer.parseInt(k[0]), k[1], Double.valueOf(k[2]), k[3]));
				}
				
			}
			
				
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return dataByIdAndName;
		
	}
}
