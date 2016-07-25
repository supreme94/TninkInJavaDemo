package c14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;

class Initable1 {

	static final int staticNonFinal = 47;
	static final int sttaicFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Tnitable1");
	}
}

class Initable2 {
	static  int staticNonFinal = 147;
	static {
		System.out.println("Initializing Tnitable2");
	}
}
class Initable3 {
	public Initable3(int i) {
		// TODO Auto-generated constructor stub
	}
	static  int staticNonFinal =55;
	static {
		System.out.println("Initializing Tnitable3");
	}
}

public class ClassInitialization {
	public static Random rand  = new Random(47);
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		Initable1 ii = new Initable1();
		Class<?> intClass = int.class;
		Class intClass2 = int.class;
		Class i1 = Initable1.class;
		System.out.println("after creating initable1 ");
		//does not trigger initialaztion
		System.out.println(Initable1.staticNonFinal);
		//trigger initialaztion
		System.out.println(Initable1.sttaicFinal2);
		//trigger initialization
		System.out.println(Initable2.staticNonFinal);
		Class i3 = Class.forName("c14.Initable3");
		System.out.println("after creating initable3");
		System.out.println(Initable3.staticNonFinal);
//		Method[] methods = i1.getMethods();
//		for(Method method : methods) {
//			System.out.println(method.toString());
//			System.out.println(method.toGenericString());
//			//System.out.println(method.toString().replaceAll(""));
//		}
		
		Constructor[] constructors =i3.getConstructors();
		System.out.println(constructors.length);
		for(Constructor constructor : constructors) {
			System.out.println(constructor.toString() + "a");
			System.out.println("-----------");
			System.out.println(constructor.toGenericString());
			//System.out.println(method.toString().replaceAll(""));
		}
	}
}
