package RuntimeExceptions;


public class One {

	public static void main(String[] args) {
		int a =10;
		//System.out.println(10/0);// no error while compilation(saving code).
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		int arr[]= {1,2,3};
		try {
			System.out.println(arr[4]);
		}catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}

}
