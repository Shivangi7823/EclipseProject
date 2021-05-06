import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

		System.out.println("Starting ....");
		for(int i=1; i<=10; i++)
		{
			new MyThread(cb, "Thread "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class MyThread implements Runnable
{
	CyclicBarrier cbar;
	String name;
	MyThread(CyclicBarrier cb, String n)
	{
		cbar = cb;
		name = n;
		new Thread(this).start();
	}
	public void run()
	{
		try
		{
			System.out.println(name);
			cbar.await();
			System.out.println(name+" : Just for Demo");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class BarAction implements Runnable
{
	public void run()
	{
		System.out.println("Finished ....");
	}	
}
