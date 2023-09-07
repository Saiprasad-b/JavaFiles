package Interfaces;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bank e = new EduLoan();
		e.docs();
		e.ROI();
		
		Bank p = new PersonalLoan();
		p.docs();
		p.ROI();
		
		
		Bank a = new AgriLoan();
		a.docs();
		a.ROI();
		
	}

}
