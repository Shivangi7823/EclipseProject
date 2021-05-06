
class B1
{
	private int a=10;
	protected int b=20;
	
	public B1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	protected void sum(int a,int b)
	{
		new B1(a,b).get();
	}
	
	private void get()
	{
		System.out.println(a+b);
	}
}

class B2 extends B1
{
	B2(int a,int b)
	{
		super(a,b);
	}
	protected int c=10;
	protected void add()
	{
		sum(10,20);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B2(2,3).add();

	}

}
