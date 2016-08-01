package c21;

public class EvenGenerator extends IntGenerator{
	private int value=0;
	@Override
	public int next() {
		++value;
		Thread.yield();
		++value;
		return value;
	}
	public static void main(String[] args) {
		EventChecker.test(new EvenGenerator());
	}
}
