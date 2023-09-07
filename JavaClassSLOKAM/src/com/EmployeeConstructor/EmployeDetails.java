package com.EmployeeConstructor;

public class EmployeDetails {

	public static void main(String[] args) {
		
		
		
		Location L = new Location("RR", "Hyd", 505001);
		department d1 = new department(1001,"IT","Manager");
		department d2 = new department(1002, "BPO", "TeamLeader");
		department[] d= {d1,d2};
		Employee e =new Employee(101, "Saiprasad", L, d);
		
		
		
		System.out.println(e.geteId());
		System.out.println(e.geteName());
		System.out.println(e.geteLoc());
		System.out.println(L.getCity());//same output as below line
		System.out.println(e.geteLoc().getCity());//----///
		for(int i =0;i<=d.length-1;i++) {
			System.out.println(d[i].getdId()+"-----"+d[i].getdName()+"-----"+d[i].getdRole());
		}
	}
//
}
