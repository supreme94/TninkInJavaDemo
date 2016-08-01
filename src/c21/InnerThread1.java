package c21;

public class InnerThread1 {
	private int count =5;
	private Inner inner;
	private class Inner extends Thread {
		public Inner(String name) {
			super(name);
			start();
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					System.out.println(this);
					if(--count ==0) return;
					sleep(10);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public String toString() {
			return getName() + " " + count;
		}
	}
	
	public InnerThread1(String name) {
		inner = this.new Inner(name);
	}
	
	public static void main(String[] args) {
		new InnerThread1("pppppp");
	}
}
