
public class StringDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="S&P Globals";
		String s2= new String ("S&P Globals");
		String s3= new String ("S&P Globals");
		String s4= new String ("Hyderabad");
		
		String s5= s1+"Hyderabad";
		String s6="S&P Globals"+"Hyderabad";
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode()+" "+s4.hashCode()+" "+s5.hashCode()+" "+s6.hashCode());
		System.out.println(s1==s2);


	}
	
	interface A 
	{
		void display();
		default void move()
		{
			System.out.println("default");
		}
	}

}
