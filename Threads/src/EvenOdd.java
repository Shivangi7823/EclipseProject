public class EvenOdd {
  
	int counter=1;
	static int n;
	boolean flag=true;
	
	public static void main(String[] args) {
		n=10;
		EvenOdd poe=new EvenOdd();
		
		Thread t1=new Thread(new Runnable() {
			public void run() {
				poe.printOddNumber();
			}
		},"Thread-1");
		
		Thread t2=new Thread(new Runnable() {
			public void run() {
				poe.printEvenNumber();
			}
		},"Thread-2");
		
		t1.start();
		t2.start();
		 
	}
	
	public void printOddNumber() {
		synchronized (this) {
		while(counter <n) {
			 while(flag==false) {
				 try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 System.out.println(Thread.currentThread().getName()+"   "+counter);
			 counter++;
			 flag=false;
			 notify();
		}
		}
	}
	
    public void printEvenNumber() {
    	synchronized (this) {
    	while(counter <n) {
			 while(flag==true) {
				 try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 System.out.println(Thread.currentThread().getName()+"   "+(counter));
			 counter++;
			 flag=true;
			 notify();
		}
    	}
	}
}