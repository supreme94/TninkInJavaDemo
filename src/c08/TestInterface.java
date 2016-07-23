package c08;

public class TestInterface extends Test implements Fight{
	
	static {
		 d = 9+10;
		 System.out.println(TestInterface.d);
	}
	
	static int d ;
    @Override
    public void fight() {
    	// TODO Auto-generated method stub
    	super.fight();
    	System.out.println("1112233");
    	
    }
    
    public static void main(String[] args) {
		new TestInterface().fight();
	}
}

class Test {
	public void fight() {
		System.out.println("1111");
	}
}

interface Fight {
	void fight();
}