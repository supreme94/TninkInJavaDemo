package c06.access.dessert.sub;

public class Chip extends Cookie{
	public Chip() {
		super(1);
	System.out.println("chip constructor");
	}
	
	public void chomp() {
		//bite();
	}
	
	
	@Override
	public void hook() {
		// TODO Auto-generated method stub
		System.out.println("templete method");
	}
	
	public static void main(String[] args) {
		//PackagedClass p = new PackagedClass();
		Chip c = new Chip();
		c.chomp();
	}
}
