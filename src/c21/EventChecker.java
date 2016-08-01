package c21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventChecker implements Runnable{
	private IntGenerator generator;
	private final int id;
	public EventChecker(IntGenerator g, int ident) {
		this.generator = g;
		this.id =ident;
	}
	
	@Override
	public void run() {
		while(!generator.isCanceled()) {
			int val = generator.next();
			if(val % 2 !=0) {
				System.out.println(val  + " not even!");
				generator.cancel();
			}
				
		}
	}
	
	public static void test(IntGenerator g ,int count) {
		System.out.println("press ctrl + c");
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<count;i++) {
			exec.execute(new EventChecker(g, i));
		}
		exec.shutdown();
	}
	
	public static void test(IntGenerator i) {
		test(i, 10);
	}
}
