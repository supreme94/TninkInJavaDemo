package c21;

public class SynchronizedEvenGenerator extends IntGenerator{
	private int value=0;
	@Override
	public synchronized int next() {
		++value;
		Thread.yield();
		++value;
		return value;
	}
	
	public synchronized void test() {
		System.out.println("nerver print!");
	}
	
	public static void main(String[] args) {
		SynchronizedEvenGenerator s = new SynchronizedEvenGenerator();
		SynchronizedEvenGenerator s1 = new SynchronizedEvenGenerator();
		EventChecker.test(s);
		s1.test();
		
	}
}
