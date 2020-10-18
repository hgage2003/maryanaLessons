package ExSheet7;

import java.util.Scanner;

public class Exercise3 {
	
	public static int factorial(int n)
	{
		int result = 1;
		for (int i = 1; i<= n; i++)
			result *= i;
		
		return result;
	}

	public static void main(String[] args) {
		System.out.print("Please enter number:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		
		System.out.println(factorial(x));		
	}
}
