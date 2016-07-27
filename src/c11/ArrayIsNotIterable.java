package c11;

import java.util.Arrays;

public class ArrayIsNotIterable {
	static <T> void tets(Iterable<T> it) {
		System.out.println(it);
	}
	
	public static void main(String[] args) {
		tets(Arrays.asList(1,2,3,4));
	}
}
