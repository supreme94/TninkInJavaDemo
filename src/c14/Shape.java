package c14;

public  abstract class Shape  implements Action{
	public static int i = 1;
	
	public void draw() {
		System.out.println(this + "draw()");
	}
	
	
	public static void main(String[] args) {
		System.out.println();
	}
//	@Override
//    public String toString();
}

interface Action {
	int i =10;
}