package c11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext())
			System.out.println(it.next() + "--" + it.nextIndex() + "--" + it.previousIndex());
		
		System.out.println();
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		System.out.println(list);
		it = list.listIterator(3);
		System.out.println(it.next());
		while(it.hasNext()){
			it.next();
			it.set(10);
		}
		System.out.println(list);
		
	}

}
