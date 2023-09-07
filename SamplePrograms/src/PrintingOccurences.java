
import java.util.*;
public class PrintingOccurences {
	public static void main(String[] args) {
		String str = "aaabbeddee";
		int countb=0;
		int counte=0;
		int countd=0;
		int counta=0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='b') {
				countb++;
			}
			else if (str.charAt(i)=='a') {
				counta++;
				
			}
			else if (str.charAt(i)=='e') {
				counte++;
				
			}
			else {
				countd++;

			}
		}
		
		
		ArrayList al = new ArrayList();
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='b') {
				al.add(str.charAt(i));
			}
			else if (str.charAt(i)=='a') {
				counta++;
				
			}
			else if (str.charAt(i)=='e') {
				counte++;
				
			}
			else {
				countd++;

			}
		}
		
		
		System.out.println("a---->"+counta);
		System.out.println("b---->"+countb);
		System.out.println("d---->"+countd);
		System.out.println("e---->"+counte);
	}
}
