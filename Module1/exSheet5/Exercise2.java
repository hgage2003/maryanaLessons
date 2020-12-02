package exSheet5;

public class Exercise2 {

	public static double link(int k)
	{
		return (double)6 / (k * k);
	}
	
	public static void main(String[] args) 
	{
		double sum = 0;
		double l = 1;
		
		for (int k = 1; l > 1E-5; k++)
		{
			l = link(k);
			sum += l;
			
			if (k <= 5)
				System.out.println("Link " + k + " = " + l);
		}
		
		System.out.println("Sum = " + sum);
	}

}
