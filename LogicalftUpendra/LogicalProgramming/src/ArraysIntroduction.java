
public class ArraysIntroduction {
	
	public static void main(String[] args) {
		
	}
	
	
	
	public static void main8(String[] args) {
		//if value is divisible by 5 then replace value with 5 
		
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		for(int i=0;i<=arr.length-1;i++) { 
			if(arr[i]%5==0)	{
				arr[i]=5;
			}
			
	}
		for(int i=0;i<=arr.length-1;i++) { 
			 System.out.println(arr[i]);	
			
			}
	}
	
	
	
	
	public static void main7(String[] args) {
		//replace all even index places with 0 and odd with 1
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		for(int i=0;i<=arr.length-1;i++) { 
			arr[i]=i%2;	//Trick used here
			
			}
		for(int i=0;i<=arr.length-1;i++) { 
			 System.out.println(arr[i]);	
			
			}
		
		}

	
	
	
	public static void main6(String[] args) {
		//index -even and if odd value and odd index then count;
		int count =0;
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		for(int i=0;i<=arr.length-1;i++) { 
			if(i%2==0 ||(i%2==1 && arr[i]%2==1))
				count++;
			
			}
		System.out.println(count);
		}
	
	

	public static void main5(String[] args) {
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		for(int i=0;i<=arr.length-1;i++) { {
				System.out.println(i+":" +arr[i]);
			}
		}
	}
	public static void main4(String[] args) {
		int count =0;
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0 || arr[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	//print if anyone of index and values are even
public static void main3(String[] args) {
	int[] arr= {45,55,90,65,35,22,58,49,90,60};
	for(int i=0;i<=arr.length-1;i++) {
		if(i%2==0 || arr[i]%2==0) {
			System.out.println(i+":" +arr[i]);
		}
	}
}
	


	public static void main2(String[] args) {
	//print both index and values are even
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		for(int i=0;i<=arr.length-1;i++) {
		if(i%2==0 && arr[i]%2==0) {
			System.out.println(i+":" +arr[i]);
		}
	}
}
	
	
	public static void main1(String[] args) {
		//print the values of index values
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
				System.out.println(i+":" +arr[i]);
			}
		}
	}
}
