interface Functionaldemo
{
	abstract int func(int x);
	default void normal(int y)
	{
		System.out.println("normal");
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functionaldemo obj=(int x)->{
			return x*10;
		};
		System.out.println(obj.func(2));

	}

}
