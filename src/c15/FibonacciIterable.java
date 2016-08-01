package c15;

import java.util.Iterator;

public class FibonacciIterable extends Fibonacci {
	private int count = 0;
	
	public FibonacciIterable(int c) {
		this.count = c;
	}
	
	private Iterable<Integer> it = new Iterable<Integer>() {
		@Override
		public Iterator<Integer> iterator() {
			return new Iterator<Integer>() {

				@Override
				public boolean hasNext() {
					return count >0;
				}

				@Override
				public Integer next() {
					count -- ;
					return FibonacciIterable.this.next();
				}
			};
		}
	};
	
	
	
	public static void main(String[] args) {
		FibonacciIterable fi = new FibonacciIterable(18);
		for(int i : fi.it) {
			System.out.println(i);
		}
	}

}
