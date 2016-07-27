package c11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class TestMap {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
	    Random ran = new Random();
		for(int i=0;i<10000;i++) {
			int temp = ran.nextInt(20);
			Integer val = map.get(temp);
			map.put(temp, val==null?1:val+1);
		}
		System.out.println(map);
	}

}
