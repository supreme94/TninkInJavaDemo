package c21;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;


public class TryLocking {
	private ReentrantLock lock = new ReentrantLock();
	public void untimed() {
		boolean captured = lock.tryLock();
		try {
			System.out.println("trylock(): " + captured);
		}finally {
			if(captured)
			lock.unlock();
		}
	}
	
	public void timed() {
		boolean captured = false ;
		try {
			System.out.println(lock.isLocked());
			captured = lock.tryLock(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("trylock2: " + captured);
		}finally {
			if(captured)
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		final TryLocking t = new TryLocking();
		t.untimed();
		t.timed();
		new Thread() {
			{setDaemon(true);}
			public void run() {
				t.lock.lock();
				System.out.println(t.lock.isHeldByCurrentThread());
				System.out.println("-----------" + t.lock.isLocked());
			}
		}.start();
		//Thread.yield();
		System.out.println(t.lock.isHeldByCurrentThread());
		t.untimed();
		t.timed();
	}
}
