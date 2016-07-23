package c07.finals.init;

public class Beetle extends Insect{
	private int k = printInit("beetle.k init");
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = printInit("x2 init");
	
	public static void main(String[] args) {
		System.out.println("main start");
		Beetle b = new Beetle();
		Insect i = new Insect();
		
	}
	
	public void say() {
		
	}
}




class Insect {
	private int i = 9;
	protected int j;
	public Insect() {
		System.out.println("i = " + i + "j = " + j);
		j= 39;
	}
	
	private static int xi =printInit("x1 init ");
			
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
