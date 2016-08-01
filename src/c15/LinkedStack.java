package c15;

public class LinkedStack<T> {
	private static class Node<U> {
		U item;
		Node next;
		Node() {
			item = null;
			next = null;		
		}
		Node(U item,Node<U> next) {
			this.item = item;
			this.next = next;		
		}
		
		boolean end() {return item ==null && next ==null;}
		@Override
		public String toString() {
			return "item = " + item;
		}
	}
	private  Node<T> top = new Node<T>();
	public void push(T t) {
		//System.out.println(t);
		top = new Node<T>(t, top);
	}
	public T pop() {
		T result = top.item;
		System.out.println(result);
		if(!top.end())
			{top = top.next;}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
		System.out.println("I,am,a,java,engineering".split(",").length);
		for(String s : "I,am,a,java,engineering".split(",")) {
			stack.push(s);
		}
		while(stack.pop()!= null) {
			System.out.println(stack.pop() + " !!!");;
		}
	}
}
