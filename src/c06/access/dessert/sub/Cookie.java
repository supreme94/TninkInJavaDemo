package c06.access.dessert.sub;

public class Cookie {

	public Cookie( int i) {
		System.out.println("cookie constructor");
	}
	
	private void bite() {
		//System.out.println("bite");
		hook();
	}
	
	protected  void hook() {
		System.out.println("static method");
	}
	
	public final void say() {
		System.out.println("say something");
	}
	
	public static void main(String[] args) {
		new Cookie(1).bite();
	}
}
