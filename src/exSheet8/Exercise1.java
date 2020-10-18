package exSheet8;

import java.util.Scanner;

public class Exercise1 
{
	
	static public double power(double x, int n)
	{
		if (n < 0)
		{
			System.out.println("Error: negative power");
			return 0;
		}
		
		if (n == 0)
			return 1;
		
		if (n == 1)
			return x;
		
		return x * power(x, n - 1);
	}

	public static void main(String[] args) {
		System.out.print("Please enter number:");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.print("Please enter power:");
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println(x + " times " + n + " is " + power(x,n));
	}
}
