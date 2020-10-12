package exSheet4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year:");
		int y = scanner.nextInt();
		scanner.close();
		
		if (y % 4 != 0)
			System.out.print(y + " is not a leap year because it cannot be divided by 4 without reminder");
		else
		{
			if (y % 100 != 0)
				System.out.print(y + " is a leap year because it can be divided by 4 without reminder");
			else
			{
				if (y % 400 != 0)
					System.out.print(y + " is not a leap year because it can be divided by 4 and 100 without reminder, but not by 400");
				else
					System.out.print(y + " is a leap year because it can be divided by 400 without reminder");
			}
		}
	}

}
