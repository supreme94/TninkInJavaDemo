package c14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import c14.hidden.HiddenC;

public class HiddenImplementation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//A a = HiddenC.getA();
		//A a = HiddenC.getAByAnonymous();
		A a = HiddenC.getAbyInner();
		a.f();
		System.out.println(a.getClass().getName());
//		callHiddenMethod(a, "g");
//		callHiddenMethod(a, "u");
//		callHiddenMethod(a, "v");
//		callHiddenMethod(a, "w");
		callHiddenMethod(a, "s");
	}
	
	static void callHiddenMethod(Object o,String method) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 Method m = o.getClass().getDeclaredMethod(method);
		 m.setAccessible(true);
		 m.invoke(o);
	}
}
