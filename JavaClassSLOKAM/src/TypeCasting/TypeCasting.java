package TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//String to Integer if String have numbers
		String s="100";
		int n = Integer.parseInt(s);
		System.out.println(n);
		//--------------------------------------------------//
		
		//String to Double if String have double value
			String str="100.98";
			double q = Double.valueOf(str);
			System.out.println(q);

	
	//double to integer
	double d=123.456;
	int k = (int)d;
	System.out.println(k);

}
	}
