package com.stdcontroller;
import com.stdpojo.*;
import com.stdservice.*;
public class stdcontroller {
	
	private stdservice ss = new stdservice();
	
		public void save(stdpojo p) {
			System.out.println("-------Student Controller started----------");
			System.out.println(p);
			ss.save(p);
			System.out.println("-------Student Controller Ended----------");
		}
		
		
}
