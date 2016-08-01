package c21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEvenGenerator extends IntGenerator{
	private int value=0;
	private Lock lock = new ReentrantLock();
	@Override
	public int next() {
		lock.lock(); 
		try {
			++value;
			Thread.yield();
			++value;
			return value;
		}finally {
			lock.unlock();
		}
	}
	public static void main(String[] args) {
		EventChecker.test(new LockEvenGenerator());
	}
}
