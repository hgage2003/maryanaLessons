package exSheet5;

import java.util.Scanner;

public class Exercise1 
{
	static final double g = 9.80665;
	
	public static double distance(double time)
	{
		return 0.5 * g * time * time;
	}

	public static void main(String[] args)
	{
		// Free fall
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter time in seconds:");
		int x = scanner.nextInt();
		
		for (int i = 1; i <= x ; i += 1) // i++)
		{
			System.out.println("Time: " + i + " seconds: Distance: " + distance(i) + " m");
		}
		
		scanner.close();
	}
}
