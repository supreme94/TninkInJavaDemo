package c14.hidden;

import c14.A;

public interface HiddenC {
   public static   A getA() {
	 return new C();
 }
 
 public static A getAByAnonymous() {
	 return new A() {
		 @Override
			public void f() {
				System.out.println("public f()");
			}
			
			public void g() { System.out.println("public g()");}
			
			void u() { System.out.println("package u()");}
			
			protected void v() { System.out.println("protected v()");}
			
			private void w() {System.out.println("private w()");}
	 };
 }
 
 public static class innerA implements A {
	 @Override
		public void f() {
			System.out.println("public f()");
		}
		
		public void g() { System.out.println("public g()");}
		
		void u() { System.out.println("package u()");}
		
		protected void v() { System.out.println("protected v()");}
		
		private void w() {System.out.println("private w()");}
		private static void s() {System.out.println("static s()");}
 }
 
 public static A getAbyInner() {
	 return new innerA();
 }
}


class C implements A {

	@Override
	public void f() {
		System.out.println("public f()");
	}
	
	public void g() { System.out.println("public g()");}
	
	void u() { System.out.println("package u()");}
	
	protected void v() { System.out.println("protected v()");}
	
	private void w() {System.out.println("private w()");}
	
}