package UsingExecutors;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test implements Callable<Integer> {
	
	public Integer add() {
		int sum =0;
		for(int i=0;i<=5;i++) {
			sum+=i;
		}
		return sum;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return add();
	}
	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(4);
		Test t =new Test();
		
		
		
		List<Future<Integer>> l = new ArrayList<>();
		for(int i=0;i<4;i++) {
			Future<Integer> v = e.submit(t);
			l.add(v);
		}
		e.shutdown();
		
		for(Future<Integer> k:l) {
			System.out.println(k);
		}
	}
}
