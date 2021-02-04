package lection23;

public class AnonimousClassThread
{
    public static void main(String[] args) throws InterruptedException
    {
	int num = 633910099;
	
	Runnable r = ()->
	{
	    boolean isPrime = true;
	    
	    if (num < 2)
		isPrime = false;
	    
	    for (int div = 2; div < num; div++)
	    {
		if (num % div == 0)
		    isPrime = false;
	    }
	    
	    System.out.println(isPrime);
	};
	
	Thread t = new Thread(r);
	t.start();
	
	t.join();
    }
}
