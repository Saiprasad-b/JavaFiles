package com.MobileNumbers;

public class PersonDetails {

	public static void main(String[] args) {
		
		SimDetails sim1 = new SimDetails();
		sim1.setSimNumber(9955995599l);
		sim1.setSimComp("Airtel");
		sim1.setSimState("TS");
		
		SimDetails sim2 = new SimDetails();
		sim2.setSimNumber(778899665544l);
		sim2.setSimComp("jio");
		sim2.setSimState("AP");
		
		SimDetails simArr[] = {sim1,sim2};
		
		
		Person Sai = new Person();
		Sai.setPname("Saiprasad");
		Sai.setPadress("KNR");
		System.out.println(Sai.getPname());
		System.out.println(Sai.getPadress());
		
		for(int i=0;i<=simArr.length-1;i++) {
			System.out.println(simArr[i].getSimNumber()+"---"+simArr[i].getSimComp()+"---"+simArr[i].getSimState());
		}
		

	}

}
