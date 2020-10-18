package exSheet8;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		System.out.print("Please enter number of measurements: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		double min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY, mean = 0;
		for (int i = 1; i <= n; i++)
		{
			System.out.print("Please input measurement #" + i + ": ");
			double x = scanner.nextDouble();
			if (x <= 0)
			{
				System.out.println("Error: non-positive measurement");
				// выход из программы
				scanner.close();
				return;
			}
			
			// пока храним здесь сумму измерений
			mean += x;
			
			if (x < min)
				min = x;
			
			if (x > max)
				max = x;
		}
		scanner.close();
		
		// делим на количество
		mean /= n;

		System.out.println("Smallest value: " + min);
		System.out.println("Largest value: " + max);
		System.out.println("Arithmetic mean: " + mean);
	}

}
