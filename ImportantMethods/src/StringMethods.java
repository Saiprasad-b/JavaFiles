
public class StringMethods {

	public static void main(String[] args) {
		String s= "Saiprasad";
		String Us = s.toUpperCase();
		System.out.println(Us);
		System.out.println(s.toLowerCase());
		
		
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.concat(" Bowroju"));
		System.out.println(s);
		System.out.println(s.contains("Sai"));//only sequence is allowed
		System.out.println(s.contains("ia"));
		
	}

}
