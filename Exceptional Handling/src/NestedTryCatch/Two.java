package NestedTryCatch;

public class Two {

	public static void main(String[] args) {
		String j ="sai";
		try {
			System.out.println(j.charAt(9));
		}catch(Exception e) {
			System.out.println("exception printed in main catch "+ e);
			try {
				System.out.println(10/0);
			}catch(Exception e1){
				System.out.println("exc insdie nested catch  "+ e1);
			}
		}

	}

}
