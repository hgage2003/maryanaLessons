package exSheet12;

public class Exercise1 
{
	public static void main(String[] args)
	{
		Clock[] worldClock = new Clock[24];
		
		for (int i = 0; i < 24; i++)
			worldClock[i] = new Clock(i, 23, 07);
		
		for (Clock c: worldClock)
		{
			c.nextSec();
			System.out.println(c);
		}
	}
}
