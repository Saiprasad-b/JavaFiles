package MethodOverLoading;

public class Example {
	
	/*
	 * final , static , Private methods can be overloaded 
	 * // Comple-Timeb polymorphsim 
	 * static poly morphism 
	 * null always gives priority to String class
	 */

	public void searchButton(String name) {
		System.out.println("Searching by the name "+name);
	}
	public void searchButton(String name,String date) {
		System.out.println("Searching by the name and date "+name +date);
	}
	public void searchButton(String name,String date,int number) {
		System.out.println("Searching by the name and date and Number  "+name+" "+date +" "+number);
	}

	
	
	public static void main(String[] args) {
		Example e = new Example();
		e.searchButton("Sai");
		e.searchButton("Saiprasad", "28-02");
		e.searchButton("Bowroju", "28/05/2023", 271);
	}

}
