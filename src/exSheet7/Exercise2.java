package exSheet7;

public class Exercise2 {
	public static int round(double x)
	{
		return (int)(x + 0.5);
	}
	
	public static double round(double x, int digits)
	{
		if (digits < 0) {
			System.out.println("Error: negative nber of decimal places");
			return 0;
		}
		
		int mult = 1;
		for (int i = 0; i < digits; i++)
			mult *= 10;
		
		return (double)round( x * mult ) / mult;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(round(3.2));
		System.out.println(round(3.5));
		System.out.println(round(4.55555, 4));
		System.out.println(round(4.55552, 4));
	}
}
