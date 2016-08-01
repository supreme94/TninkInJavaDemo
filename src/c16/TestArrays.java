package c16;

import java.util.Arrays;

public class TestArrays {
		
		public static void main(String[] args) {
			int[] i = new int[10];
			int[] j = new int[7];
			Arrays.fill(i, 47);
			Arrays.fill(j, 100);
			System.out.println(Arrays.toString(i));
			System.out.println(Arrays.toString(j));
			
			System.arraycopy(j, 0, i, 0, j.length);
			System.out.println(Arrays.toString(i));
			
			Integer[] x = new Integer[10];
			Integer[] y = new Integer[7];
			Arrays.fill(x,12);
			Arrays.fill(y,9);
			
			System.arraycopy(y, 0, x, 0, y.length);
			System.out.println(Arrays.toString(x));
			
		}
}
