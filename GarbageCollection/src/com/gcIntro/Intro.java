package com.gcIntro;

public class Intro {
	
	
	public void finalize() {
		System.out.println("GC is Invoked");
	}
	public void Fun() {
		Intro i3 = new Intro();//fourth type
	}

	public static void main(String[] args) {
		Intro i = new Intro();
		// ways of Removing refernece
		/*/
		 * 1.giving Null value to object
		 * 2.Chanigng ref of object to a existing object
		 * 3.Anonymous class
		 * 4.Exiting after the Method
		 */
		
		Intro i1 = new Intro();
		i=i1;//second type
		i = null;//first type
		new Intro();//third type
		
		
		
		System.out.println(i);
		System.out.println(i1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.gc();
				
		
	}

}
