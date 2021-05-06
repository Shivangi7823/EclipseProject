class Shape {
	
}

class Circle extends Shape{
	
}

class Traingle{
	
}
class A
{
	public Shape test()
	{
		System.out.println("A");
		return null;
		
	}
	
	public void getA()
	{
		System.out.println("calling A");
	}
}



class B extends A
{
	@Override
	public Circle test()
	{
		System.out.println("B");
		return null;
	}
	
	public void getB()
	{
		System.out.println("calling b");
	}
	
}

public class OverridingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.getA();

	}

}
