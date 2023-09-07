
import java.util.*;
public class HighestOccurence {
	
		public static void main(String[] args) {
			String str = "aaabbcddeeaabbbbb";
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
			if(counta>countb && counta>countd && counta>counte) {
				System.out.println(counta+"--->a");
			}
			if(countb>counta && countb>countd && countb>counte) {
				System.out.println(countb+"--->b");
			}
			if(countd>countb && countd>counta && countd>counte) {
				System.out.println(countd+"---d>");
			}
			if(counte>countb && counte>countd && counte>counta) {
				System.out.println(counte+"--->e");
			}
			
			
			
		}
	}
