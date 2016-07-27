package c11;

import java.util.Iterator;

public class NonCollectionsSequence extends InterDequence{
	public static Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < ints.length;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return ints[index++];
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		QueneDemo.printQ(iterator());
	}
}

class InterDequence {
	protected static int[] ints = {1,2,3,4,5,6,7,8,9,0};
}
