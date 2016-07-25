package c10;

public class TestInnerClass  {
	private  class Constents {
		private int i =11;
		public int value() {
			return i;
		}
	}
	
	public  class Destination {
		private String label;
		public Destination(String whereto) {
			label = whereto;
		}
		String readLabel(){ return label;}
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Constents contents() {
		return new Constents();
	}
	
	public void ship(String dest) {
		Constents c  = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		TestInnerClass t = new TestInnerClass();
		t.ship("apple");
		
		TestInnerClass t2 = new TestInnerClass();
		Constents c2 = t2.new Constents();
		Destination d2 = t2.to("china");
		System.out.println(d2.readLabel());
	}
}
