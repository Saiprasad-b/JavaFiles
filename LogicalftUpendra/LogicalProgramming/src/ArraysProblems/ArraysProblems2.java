package ArraysProblems;

public class ArraysProblems2 {
public static void main(String[] args) {
		
		
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
  //desired output {55,90,65,35,22,58,49,90,60,45}
		//circular Shifting of an array(left to Right )...
		int temp = arr[0];
		for(int i=0;i<=arr.length-2;i++) {
			arr[i]=arr[i+1];
		}
		arr[9]=temp;
		
		
		for(int i=0;i<=arr.length-1;i++) { 
			 System.out.print(arr[i]+"  ");	
		}
	}
	
	
	
	
	
	
	
	//-----------------------------------------------------------//
	public static void main4(String[] args) {
		
		
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
  //desired output {60,45,55,90,65,35,22,58,49,90}
		//circular Shifting of an array(Right to left)...
		int temp = arr[9];
		for(int i=arr.length-1;i>=1;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
		
		for(int i=0;i<=arr.length-1;i++) { 
			 System.out.print(arr[i]+"  ");	
		}
	}
	
	
	//--------------------------------------------------//
	public static void main3(String[] args) {
		//Swapping (1st and last element)
		
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		//0th index-->1st index value
		//1st index-->2nd index value
		//2nd index-->0th index value
		int temp = arr[2];
		arr[2]=arr[1];
		arr[1]=arr[0];
		arr[0]=temp;
		
		for(int i=0;i<=arr.length-1;i++) { 
			 System.out.print(arr[i]+"  ");	
		}
	}
	
	
	
	
//---------------------------------------------------------------//
	public static void main2(String[] args) {
		//Swapping (1st and last element)
		
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
	int temp=	arr[0];
	    arr[0]=arr[1];
	     arr[1]=temp;
				
		
		for(int i=0;i<=arr.length-1;i++) { 
			 System.out.print(arr[i]+"  ");	
		}
	}
			
//--------------------------------------------------------------//	
			 
	public static void main1(String[] args) {
		//Swapping (1st and last element)
		
		int[] arr= {45,55,90,65,35,22,58,49,90,60};
		arr[9]=arr[0]+arr[9];//arr[9]=45+60=105
		arr[0]=arr[9]-arr[0];//arr[0] = 105-45 = 60
		arr[9]=arr[9]-arr[0];
		
				
		
		for(int i=0;i<=arr.length-1;i++) { 
			 System.out.print(arr[i]+"  ");	
			
			}
	}
}
	