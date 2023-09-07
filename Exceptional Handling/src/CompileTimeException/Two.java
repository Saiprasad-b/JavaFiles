package CompileTimeException;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter the class name ");
		String s =sc.next();
		try {
			Class.forName(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
