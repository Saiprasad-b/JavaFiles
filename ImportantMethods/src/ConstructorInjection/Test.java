package ConstructorInjection;

public class Test {

	public static void main(String[] args) {
		Location loc1 =  new Location("Hyd",500043);
		Location loc2 =  new Location("BLR",500044);	
		Location loc3 =  new Location("CHN",50005);
		
		Location [] loc =  {loc1,loc2,loc3};
		Employe e1 = new Employe("SAI", 1001, new Department("IT",101),loc);
		Employe e2 = new Employe("Siva", 10012, new Department("IT",101),loc);
		
		

		Employe[] e = {e1,e2};
		for(Employe k:e) {
			System.out.println(k);
		}
	}

}
