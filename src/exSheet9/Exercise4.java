package exSheet9;

import java.util.Scanner;

public class Exercise4 {
	
	public static int factorial(int n)
	{
		int result = 1;
		for (int i = 1; i<= n; i++)
			result *= i;
		
		return result;
	}
	
	static public double power(double x, int n)
	{
		if (n < 0)
		{
			return 1.0 / power(x, -n);
		}
		
		if (n == 0)
			return 1;
		
		if (n == 1)
			return x;
		
		return x * power(x, n - 1);
	}
	
	// расчет одного слагаемого в ряде синуса
	public static double sinTerm(double x, int index)
	{
		double res = 1.;
		if (index % 2 == 1)
			res = -1.;
		
		res *= power(x, 2 * index + 1);
		res /= factorial(2 * index + 1);
		
		// первые 5 слагаемых выводим на экран
		if (index < 5)
			System.out.println(String.valueOf(res));
		
		return res;
	}
	
	
	public static double sin(double x)
	{
		final double delta = 0.01;
		double result = 0.;
		double term = 1.;
		int k = 0;
		
		while (term < -delta || term > delta) 
		{
			term = sinTerm(x, k++);
			result += term;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.print("Please enter x:");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		scanner.close();

		System.out.println(sin(x));
	}

}
