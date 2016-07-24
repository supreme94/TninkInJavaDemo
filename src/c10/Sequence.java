package c10;

public class Sequence {
	private static Object[] items;
	private int i = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	
	private void add(Object o) {
		if(i < items.length) {
			items[i++] = o; 
		}
	}
	
	public static class sequenceSlecetor implements Selector {
		
//		public Sequence getSequence() {
//			return Sequence.this;
//		}
		
		private int j = 0 ;
		@Override
		public boolean end() {
			return j == items.length;
		}

		@Override
		public void next() {
			if(j < items.length) j++;
		}

		@Override
		public Object current() {
			return items[j];
		}
		
	}
	
	 Selector selector() {
		return new sequenceSlecetor();
	}
	
	public static void main(String[] args) {
		Sequence s = new Sequence(10);
		for(int i=0;i<s.items.length;i++) 
			s.add(Integer.toString(i));
		sequenceSlecetor selector = new sequenceSlecetor();
		//Selector selector = s.selector();
		while(!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}
}


interface Selector {
	boolean end();
	void next();
	Object current();
	
}