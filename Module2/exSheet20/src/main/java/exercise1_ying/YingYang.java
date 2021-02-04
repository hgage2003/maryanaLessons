package exercise1_ying;

public class YingYang
{

    public static void main(String[] args) throws InterruptedException
    {
	class IntervalPrinter extends Thread
	{
	    String str;
	    double interval;
	    
	    public IntervalPrinter(String str, double interval)
	    {
		this.str = str;
		this.interval = interval;
	    }
	    
	    @Override
	    public void run()
	    {
		while (true)
		{
		    System.out.println(str);
		    try
		    {
			sleep((int)(interval * 1000));
		    } catch (InterruptedException e)
		    {
			e.printStackTrace();
		    }
		}
	    }
	}
	
	IntervalPrinter yang = new IntervalPrinter("Yang", 0.5);
	yang.start();
	
	while (true)
	{
	    System.out.println("Ying");
	    Thread.sleep(500);
	}

    }

}
