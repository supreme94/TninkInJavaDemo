package c11;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueneDemo implements Collection<String>{
	public static void printQ(Queue queue) {
		if(queue.isEmpty()) {
			queue.peek();
			//queue.remove(); throw java.util.NoSuchElementException
		}else {
			while(queue.peek()!=null)
			System.out.println(queue.remove());
		}
		System.out.println(queue);
	}
	
	
	public static void printQ(Iterator it) {
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Random ran = new Random(19);
		for(int i=0;i<10;i++) {
			queue.offer(ran.nextInt(i+10));
		}
		printQ(queue);
		queue.removeAll(queue);
		System.out.println(queue.isEmpty());
		printQ(queue);
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
