import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountDownLatch cdl = new CountDownLatch(3);
		System.out.println("Starting .....");
		new MyThread1(cdl, "A");
		try
		{
			cdl.await();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Finished .....");
	}
}
class MyThread1 implements Runnable
{
	CountDownLatch cdl;
	MyThread1(CountDownLatch cb, String n)
	{
		cdl = cb;
		new Thread(this).start();
	}
	public void run()
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i);
				cdl.countDown();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


