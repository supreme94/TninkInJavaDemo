package c21;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{
	
	@Override
	public void run() {
			try {
				while(true) {
					Thread.sleep(100);
					System.out.println(Thread.currentThread() + " " + this);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++) {
			Thread t = new Thread(new SimpleDaemons());
			t.setDaemon(true);
			t.start();
		}
		//System.out.println("----all daemons started----");
		Thread.sleep(175);
	}

}
