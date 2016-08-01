package c21;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class AtomicIntegerTest  implements Runnable{
	private AtomicInteger i = new AtomicInteger(0);
	public int getValue() {
		return i.get();
	}
	public void evenIncrement() {
		i.addAndGet(2);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			evenIncrement();
	}
	
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("aborting");
				System.exit(0);
			}
		}, 5000);
		
		AtomicIntegerTest at = new AtomicIntegerTest();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(at);
		while(true) {
			int val = at.getValue();
			System.out.println(val);
			if(val % 2 !=0) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}

}
