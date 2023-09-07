package com.cisco;
import java.util.*;
public class customer {
	public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 for Reg---------->1");
	System.out.println("Enter 2 for Update---------->2");
	System.out.println("Enter 3 for Delete---------->3");
	System.out.println("Enter 4 for GetBYID---------->4");
	System.out.println("Enter 5 for GetAll---------->5");
	
	Dao d = new Dao();
	Studentpojo p = new Studentpojo();
	int choice = sc.nextInt();
	
	
	if(choice==1) {
		System.out.println("Please Enter the Student Deatils for Reg");
		System.out.println("Enter Student ID");
		p.setSid(sc.nextInt());
		System.out.println("Enter Student Name");
		p.setSname(sc.next());
		System.out.println("Enter Student Age");
		p.setSage(sc.nextDouble());
		System.out.println("Enter Student Qaulification");
		p.setSqual(sc.next());
	
		//d.save(p);
	}
	else if(choice==2){
	System.out.println("Please Enter the Student Deatils for Updation");
	System.out.println("Enter Student ID");
	p.setSid(sc.nextInt());
	System.out.println("Enter Student Name to Update");
	String nameTobeUpdated = sc.next();
	p.setSname(nameTobeUpdated);
	d.update(p);
	}
	else if(choice==3){
	System.out.println("Please Enter the Student Deatils to delete from DB");
	System.out.println("Please Enter the Student ID to delete from database");
	int idTobeDeleted = sc.nextInt();
	p.setSid(idTobeDeleted);
	d.delete(p.getSid());
	
}
	else if(choice==4){
	System.out.println("Please Enter to get bY ID");
	System.out.println("Please Enter the Student ID to get Data");
	int IDtoGetData =sc.nextInt();
	p.setSid(IDtoGetData);
	Studentpojo pojo = d.getById(IDtoGetData);
	System.out.println(pojo);
	
	
}
	else if(choice==5){
		List<Studentpojo> data = d.getAll();
		for(Studentpojo s:data) {
			System.out.println(data);
		}
}
	else {System.out.println("Please select appropriate Option");
	          }
	
}

}
