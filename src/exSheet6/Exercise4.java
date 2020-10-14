package exSheet6;

import java.util.Scanner;

public class Exercise4 {
	
	public static double positivePower(double base, int exp)
	{
		if (exp <= 0)
		{
			System.out.print("ERROR: exponent must be positive");
			return 0;
		}
			
		double result = 1;
		for (int i = 0; i < exp; i++)
		{
			result *= base;
		}
		return result;
	}

	public static void main(String[] args) 
	{
		System.out.print ("Please enter base:");
		
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		
		System.out.print ("Please enter exponent:");
		int b = scanner.nextInt();
		scanner.close();
		
		// для b == 0 останется единица
		double result = 1;
		
		if (b > 0)
			result = positivePower(a, b);
		else if (b < 0)
			result = (double) 1 / positivePower(a, -b);
		
		System.out.print (a + "^" +  b + " = " + result);
	}

}
