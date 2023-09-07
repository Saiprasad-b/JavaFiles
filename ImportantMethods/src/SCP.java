
public class SCP {
public static void main(String[] args) {
	String s  =  new String("sai");//String object this are created in Heap
	String s1 = new String("sai");
	
	String h ="sai";//String literal this are created in SCP,no duplicates allowed
	String h1 = "sai";// as no duplicates allowed h1 is pointed to h refernece only
	
	
	System.out.println(s==s1);//reference Comparision
	System.out.println(s==h);//reference Comparision
	
	System.out.println(h==h1);//here the reference is same(content is not checked only ref) so true is returned 
	
	
	System.out.println(s.equals(s1));//content comparision
	System.out.println(s.equals(h));//content comparision
}
}
