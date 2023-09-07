
public class Problem1 {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		while(a<=25) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println("===========================");
		int total=0;
		for(int i=1;i<=10;i++) {
			total+=i;
			
		}
		System.out.println("Total is "+total);
		System.out.println("===========================");
		
		int res=1;
		for(int j=1;j<=5;j++) {
			res*=j;
		}
		System.out.println(res);
	}

}
