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
		Selector sc =new Selector() {
			
			@Override
			public void next() {
				// TODO Auto-generated method stub
				System.out.println("11111");
			}
			
			@Override
			public boolean end() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Object current() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void aiya() {
				System.out.println("1123344");
			}
		};
		
	}
}

interface Selector {
	boolean end();
	void next();
	Object current();
	
}