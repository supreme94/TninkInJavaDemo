package c10;

import c10.Sequence.sequenceSlecetor;

public class AnonymousInnerClass {
	private static  String info = "默认值";
		
		public Anonymous get(String s) {
			return new Anonymous(info) {
		String innerInfo = info ;
			@Override
			public void say() {
				// TODO Auto-generated method stub
				System.out.println(s);
				System.out.println(info  );
				System.out.println(innerInfo);
			}
			
		};
		
	}
	public static void main(String[] args) {
	 AnonymousInnerClass a =  new AnonymousInnerClass();
	 Anonymous an=  a.get(a.info);
	 an.say();
	 a.info = "修改了默认值";
	 an.say();
	 Sequence sss = new Sequence(11);
	 sequenceSlecetor ss = new Sequence.sequenceSlecetor();
	 sequenceSlecetor s = new sequenceSlecetor();
	}
}

abstract class Anonymous {
	public Anonymous(String s) {
		
	}
	void say() {
	}
}