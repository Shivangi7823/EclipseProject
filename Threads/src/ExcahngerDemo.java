import java.util.concurrent.Exchanger;

public class ExcahngerDemo {


	public static void main(String args[])
	{
		Exchanger<String> ex = new Exchanger<String>();
		
		new MakeString(ex);
		new UseString(ex);
	}
}
class MakeString implements Runnable
{
	String str;
	Exchanger<String> ex;
	MakeString(Exchanger<String> e)
	{
		ex = e;
		new Thread(this).start();
	}
	public void run()
	{
		try
		{
			String names[] = { "Rajesh", "Suresh", "Ganesh", "Mahesh", "Dinesh" };
			for(int i=0; i<names.length; i++)
			{
				String str = ex.exchange(names[i]);
				System.out.println("From Make String : "+str);
				//Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class UseString implements Runnable
{
	String str;
	Exchanger<String> ex;
	UseString(Exchanger<String> e)
	{
		ex = e;
		new Thread(this).start();
	}
	public void run()
	{
		try
		{
			for(int i=0; i<5; i++)
			{
				str = ex.exchange("Demo");
				System.out.println("Received : "+str);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
