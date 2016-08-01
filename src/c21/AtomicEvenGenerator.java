package c21;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenGenerator extends IntGenerator{
	private AtomicInteger i = new AtomicInteger(0);
	@Override
	public int next() {
		// TODO Auto-generated method stub
		return i.addAndGet(2);
	}
	
	public static void main(String[] args) {
		EventChecker.test(new AtomicEvenGenerator());
	}

}
