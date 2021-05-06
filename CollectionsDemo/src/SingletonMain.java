
 class Singleton {
	
	private static Singleton instance=null;
	
	public String s;
	private Singleton()
	{
		s="Hello";
		
	}
	
	public static Singleton getInstance()
	{
		if(instance==null)
		instance=new Singleton();
		
		return instance;
	}
	

}


public class SingletonMain {
	public static void main(String[] args) {
		
		Singleton ob=Singleton.getInstance();

		Singleton ob1=Singleton.getInstance();

		Singleton ob2=Singleton.getInstance();

		Singleton ob3=Singleton.getInstance();
		System.out.println(ob+" "+ob1+" "+ob2+" "+ob3);
		
	}
	
}