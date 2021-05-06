import java.util.concurrent.Semaphore;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Semaphore sem=new Semaphore(2);
		new IncThread("A", sem);
		new DecThread("B", sem);
		new IncThread("C", sem);

	}

}

class Share
{
	static int count=0;
}

class IncThread implements Runnable
{
	String name;
	Semaphore sem;
	
   IncThread(String n, Semaphore s)
   {
	   name=n;
	   sem=s;
	   new Thread(this).start();
   }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		System.out.println(name+"is waiting");
		sem.acquire();
		System.out.println(name+"got permission");
		
	
		for(int i=0;i<3;i++)
		{
			Share.count++;
			System.out.println(name + " : "+Share.count);
		Thread.sleep(2000);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		sem.release();
		System.out.println(name +"release permisison");
		
	}
	
}

class DecThread implements Runnable
{
	String name;
	Semaphore sem;
	
   DecThread(String n, Semaphore s)
   {
	   name=n;
	   sem=s;
	   new Thread(this).start();
   }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		System.out.println(name+"is waiting");
		sem.acquire();
		System.out.println(name+"got permission");
		
		
		for(int i=0;i<3;i++)
		{
			Share.count--;
			System.out.println(name + " : "+Share.count);
		Thread.sleep(2000);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		sem.release();
		System.out.println(name +"release permisison");
		
	}
	
}