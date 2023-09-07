package FinallyBlock;
//Finally block will be executed irrespect of Exceptions.
public class Introduction {
public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("final block");
		}
}
}
