package c11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1, 55);
		//list.add(200);
		System.out.println(list);
		
		Collection<Number> collection = new ArrayList<>(Arrays.asList(16,17,18,19,20));
		Integer[] moreInts = {1,2,3,45,4};
		collection.addAll(Arrays.asList(moreInts));
		System.out.println(collection);
		Collections.addAll(collection, (Integer)7);
		Collections.addAll(collection, moreInts);
		System.out.println(collection);
		
		
		
	}
}
