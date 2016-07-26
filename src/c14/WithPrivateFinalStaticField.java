package c14;

import java.lang.reflect.Field;

public class WithPrivateFinalStaticField {
	public static void main(String[] args) throws Exception {
		TestFields tf = new TestFields();
		System.out.println(tf);
		Field f = tf.getClass().getDeclaredField("i");
		f.setAccessible(true);
		f.setInt(tf, 15);
		System.out.println(tf);
		 f = tf.getClass().getDeclaredField("s");
		 f.setAccessible(true);
		 f.set(tf, "no u r not!");
		 System.out.println(tf);
		 f = tf.getClass().getDeclaredField("s2");
		 f.setAccessible(true);
		 f.set(tf, "no u r not!");
		 System.out.println(tf);
	}
}


class TestFields {
	private static int i=1;
	private final String s = "totally safe";
	protected String s2 = "am i safe";
	
	public String toString() {
		return "i =" + i + " s = " + s + " s2= " +s2;
	}
}