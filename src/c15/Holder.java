package c15;

public class Holder {
	public Holder(int i) {
		// TODO Auto-generated constructor stub
	}
	private static int count = 0;
	private final long id = count++;
	public long id() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getName() + " " + id;
	}
	
	public static void main(String[] args) {
		Generator<Holder> g =  BasicGenerator.create(Holder.class);
		for(int i =0;i<5;i++)
			System.out.println(g.next());
		
	}
}


//class Holder2<A,B, T> extends Holder<T> {
//	
//}