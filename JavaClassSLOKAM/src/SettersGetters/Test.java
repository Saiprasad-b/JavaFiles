package SettersGetters;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid(1012);
		e.setEname("Sai");
		e.setEsal(8989.89);
		e.setLocation("Hyderabad");
		e.setDepart("Dev");
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getEsal());
		System.out.println(e.getLocation());
		System.out.println(e.getDepart());
		
		
		
		
	}

}
