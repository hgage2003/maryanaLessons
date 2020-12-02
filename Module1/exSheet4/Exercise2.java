package exSheet4;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter hours:");
		int h = scanner.nextInt();
		
		if ( h < 0 || h > 23 )
			System.out.print("Hours must be in [0, 23]");
		else
		{
			System.out.print("Enter minutes:");
			int m = scanner.nextInt();
			
			if ( m < 0 || m > 59 )
				System.out.print("Minutes must be in [0, 59]");
			else
			{
				System.out.print("Enter seconds:");
				int s = scanner.nextInt();
				
				if ( s < 0 || s > 59 )
					System.out.print("Seconds must be in [0, 59]");
				else
					System.out.print(h + ":" + m + ":" + s + " is correct time");
			}
		}
		
		scanner.close();
	}

}
