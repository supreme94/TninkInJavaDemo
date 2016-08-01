package c21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LifeOff implements Runnable{
	protected int countDown = 10;
	private static int  count=0;
	private final int id = count++;
	
	public void status() {
		System.out.print(id +":(" + (countDown > 0 ?countDown : "lifeoff") +") ");
	}
	
	@Override
	public void run() {
		while(countDown-->0)
		status();
		//Thread.yield();
	}
	
	public static void main(String[] args) {
		//LifeOff l = new LifeOff();
//		l.run();
//		l.run();
//		for(int i=0;i<3;i++) {
//			Thread t = new Thread(new LifeOff());
//			t.start();
//			System.out.println("-------");
//		}
		
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++) {
			exec.execute(new LifeOff());
		}
		exec.shutdown();
		
	}

}
