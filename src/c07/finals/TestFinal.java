package c07.finals;

import java.util.Random;

public class TestFinal {
	private final String s;
	private final People people;
	
	public TestFinal() {
		s = "5";
		people = new People(1);
	}
	private final int i1 = 99;
	private static final int VALUE = 99;
	
	private final int i2 = new Random().nextInt(20);
	static final int i3 = new Random().nextInt(20);
	
	private final People p1 = new People(11);
	private static final People P2 = new People(22);
	private People p3 = new People(33);
	
	private final int[] a = {1,2,3,4,5,6};
	
	public static void main(String[] args) {
		TestFinal t = new TestFinal();
		//t.i1++; cant change vvalue;
		t.p1.j++;
		System.out.println(t.p1.j);
		
		t.p3 = new People(44);
		for(int i=0;i<t.a.length;i++) {
			t.a[i]++;//it works 
			//System.out.println(t.a[i]);
		}
		
		//t.p1 = new People(55); error
		//t.P2 = new People(55); error
		//t.a = new int[3];
		
	}
}
