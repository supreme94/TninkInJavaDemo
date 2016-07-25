package c14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyDemo implements InvocationHandler{
	private Object obj;
	public DynamicProxyDemo(Object obj) {
		this.obj = obj;
	}
	
	public  Object getProxy() {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(proxy.getClass().getName() + " method = " + method.getName() + " args = " + args);
		return method.invoke(obj, args);
	}
	
	public static void main(String[] args) {
		DynamicProxyDemo dp = new DynamicProxyDemo(new RealClient());
		Interface proxy = (Interface) dp.getProxy();
		proxy.doSomething();
		proxy.somethingElse("aaaaa");
	}

}

interface Interface {
	void doSomething();
	void somethingElse(String s);
}

class RealClient implements Interface {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("do some.....");
	}

	@Override
	public void somethingElse(String s) {
		// TODO Auto-generated method stub
		System.out.println("something else= " + s);
	}
	
}