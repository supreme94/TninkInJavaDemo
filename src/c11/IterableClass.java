package c11;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{
	    private String[] s = {"a","b","c"};
	
		
		public static void main(String[] args) {
			for(String s : new IterableClass()) 
				System.out.println(s);
		}
		@Override
		public Iterator<String> iterator() {
			return new Iterator<String>() {
				private int index = 0;
				
				@Override
				public boolean hasNext() {
					// TODO Auto-generated method stub
					return index < s.length;
				}
				@Override
				public String next() {
					// TODO Auto-generated method stub
					return s[index++];
				}
				@Override
				public void remove() {
					// TODO Auto-generated method stub
					throw new UnsupportedOperationException();
				}
			};
		}

}
