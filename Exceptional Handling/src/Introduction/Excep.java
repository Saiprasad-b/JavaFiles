package Introduction;

public class Excep {
 public static void main(String[] args) {
	int arr[] = {19,3,45};
	String s = null;
	try{
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[3]);
	System.out.println(arr[2]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}catch (Exception e) {
		System.out.println(e);
	}
	
	 
	 
	 
	 
}
}
