package ObjectMethods;

public class One {
	public static void main(String[] args) {
		One o = new One();
		One o1 = new One();
		System.out.println(0==01);//ref is checked
		System.out.println(o.equals(o1));
//		Here ref is checked as the Object class is parent
//		to the classes and in object class .equals() gives the ref 
//		comparision
		
//		but in String it gives content Comparision it is done by overRiding
//		the equals method in String Class from Object class method
		
		System.out.println(o.hashCode());// this gives the adress
		
		System.out.println(o.getClass());// this gives package.class name
		System.out.println(o.toString());//gives packagename.class @ adress in hexcode
	}
	

}
