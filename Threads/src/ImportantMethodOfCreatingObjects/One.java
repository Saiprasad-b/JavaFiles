package ImportantMethodOfCreatingObjects;

public class One  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the anonymous subclass for interface
		Slokam s= new Slokam() {

			@Override
			public void m1() {
				System.out.println("Called by Subclass creation by complier---->Anonymous class for INterface");
				
			}
			};
			
		Two t = new Two() {

			@Override
			public void m2() {
				System.out.println("Called by Subclass creation by complier---->Anonymous class for abstract");
				
			}
		}
		;
			
			
			Four f = new Four() {
				public void m5() {	
					System.out.println("M5 in One class");
				}
				
			};
			s.m1();
			System.out.println(s.getClass().getName());
			t.m2();
			System.out.println(t.getClass().getName());
			t.m3();
			f.m5();
			System.out.println(f.getClass().getName());

	}

}
