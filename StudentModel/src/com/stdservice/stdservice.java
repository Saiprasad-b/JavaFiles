package com.stdservice;
import com.srddao.*;
import com.stdpojo.stdpojo;

public class stdservice {
	
	stddao std = new stddao();
	public void save(stdpojo p) {
		System.out.println("-------Student Service started----------");
		System.out.println(p);
		std.save(p);
		System.out.println("-------Student Service Ended----------");
	}
}
