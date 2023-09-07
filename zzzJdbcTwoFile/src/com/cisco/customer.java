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
	
	
	switch(choice) {
	case 1:{
		System.out.println("Please Enter the Student Deatils for Reg");
		System.out.println("Enter Student ID");
		p.setSid(sc.nextInt());
		System.out.println("Enter Student Name");
		p.setSname(sc.next());
		System.out.println("Enter Student Age");
		p.setSage(sc.nextDouble());
		System.out.println("Enter Student Qaulification");
		p.setSqual(sc.next());
	
		d.save(p);
	}
	case 2:{
	System.out.println("Please Enter the Student Deatils for Updation");
	System.out.println("Enter Student ID");
	p.setSid(sc.nextInt());
	System.out.println("Enter Student Name to Update");
	p.setSname(sc.next());
	d.update(p);
	}
		case 3:{
	System.out.println("Please Enter the Student Deatils to delete from DB");
}
		case 4:{
	System.out.println("Please Enter to get bY ID");
}
		case 5:{
	System.out.println("Please Enter to get all the data");
}
	          }
	
}

}
