
class T extends Thread {
	static int count = 0;
	static int count1=0;

	public void run() {
		demo();
		nostatic();

	}

	    public synchronized static void demo()
	    {
	    	try {
	    	for(int i=0;i<3;i++)
	    	{
	    	System.out.println("static " +Thread.currentThread().getName()+": "+ count++);
	    	
					Thread.sleep(2000);
					
	    	}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    }
	    
	    public synchronized void nostatic()
	    {   try {
	    	 for(int i=0;i<3;i++)
	    	 {
	    	System.out.println("non static : "+Thread.currentThread().getName()+": "+count1++);
	    	   
				Thread.sleep(2000);
	    	 }
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 }
	    }


public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T o1 = new T();
		T o2 =new T();
		
		Thread t1 = new Thread(o1, "T1");
		Thread t2 = new Thread(o1, "T2");
		Thread t3=new Thread(o2,"T3");

		t1.start();
		t2.start();
		t3.start();

	}

}
