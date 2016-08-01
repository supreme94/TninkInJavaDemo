package c15;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public  void setName(Person p) {
		p.setName("lp");
		p = new Person();
		p.setName("hp");
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName(p);
		System.out.println(p.getName());
	}
}
