package c21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id) {
		this.id = id;
	}
	@Override
	public String call() throws Exception {
		return "result of Taskwithresult " + id ;
	}
	
	public static void main(String[] args) {
		System.out.println("111");
		CallableDemo.mains(args);
	}
}

class CallableDemo {
	public static void mains(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Future<String>> results = new ArrayList<>();
		for(int i=0 ;i<10;i++) {
			results.add(exec.submit(new TaskWithResult(i)));
		}
		
		for(Future<String> fs: results) {
			System.out.println(fs.isDone());
			try {
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				exec.shutdown();
			}
		}
	}
}