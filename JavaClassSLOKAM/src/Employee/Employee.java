package Employee;

public class Employee {
	
	int eid;
	String ename;
	double esalary;
	String edesgn;

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eid=1001;
		e1.ename="Sai";
		e1.esalary=40000.905;
		e1.edesgn="Developer";
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		System.out.println(e1.esalary);
		System.out.println(e1.edesgn);
		
		
		System.out.println("-------------------NEXT---------------------");
		Employee e2=new Employee();
		e2.eid=1002;
		e2.ename="Siva";
		e2.esalary=50000.905;
		e2.edesgn="Analyst";
		System.out.println(e2.eid);
		System.out.println(e2.ename);
		System.out.println(e2.esalary);
		System.out.println(e2.edesgn);

	}

}
