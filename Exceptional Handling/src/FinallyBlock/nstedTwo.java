package FinallyBlock;
//System.exit(0);----> this is will exit the program there itself
public class nstedTwo {

		public static void main(String[] args) {
			try {
				System.out.println(10/2);
			
				try {
					System.out.println(10/0);
				}catch(ArithmeticException e1) {
					System.out.println("Inner Catch Block------- "+e1);
				}finally {
					System.out.println("Inner Finally Block");
				}
			}
			catch(Exception e) {
				System.out.println("Outer Catch Block------- "+e);
				
			}
			finally {
				System.out.println("Outer Finally Block");
			}
		}
		}

