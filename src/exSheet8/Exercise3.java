package exSheet8;

import java.util.Scanner;

public class Exercise3 {
	public static double mean(double[] d)
	{
		int size = d.length;
		double res = 0;
		
		for (int i = 0; i < size; i++)
			res += d[i];
		
		res /= size;
		
		return res;
	}
	
	public static double variance(double[] d)
	{
		double m = mean(d);
		int size = d.length;
		double res = 0;
		
		for (int i = 0; i < size; i++)
		{
			res += (d[i] - m) * (d[i] - m);
		}
		
		res = Math.sqrt(res / size);
		
		return res;
	}

	public static void main(String[] args) {
		System.out.print("Please enter number of measurements: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		double[] data = new double[n];
		
		double min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY;
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
			
			data[i - 1] = x;
			
			if (x < min)
				min = x;
			
			if (x > max)
				max = x;
		}
		scanner.close();
		
		System.out.println("Smallest value: " + min);
		System.out.println("Largest value: " + max);
		System.out.println("Arithmetic mean: " + mean(data));
		System.out.println("Variance: " + variance(data));
	}

}
