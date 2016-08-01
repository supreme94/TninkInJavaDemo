package c15;

import java.util.ArrayList;
import java.util.List;

public class TestArrays {
	public static <T> List<T> asList(T... args) {
		List<T> list = new ArrayList<T>();
		for(T item : args)
			list.add(item);
		return list;
	}
	
	public static void main(String[] args) {
		List<String> list = asList("A");
		System.out.println(list);
		list = asList("a","b","c");
		System.out.println(list);
		list = asList("a b c d f g h j k l".split(" "));
		System.out.println(list);
	}
}
