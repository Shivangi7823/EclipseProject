
class Parent
{
	String s="P";
	static void m1() {
		System.out.println("m1");
	}
}

class Child extends Parent
{
	 String s="C";
	static void m1() {
		System.out.println("child");
	}
	void m2() {
		System.out.println("m2");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.m1();
		
		System.out.println(p.s);
          
		
	}

}
