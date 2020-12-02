package exSheet4;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first char:");
		char c1 = scanner.nextLine().charAt(0);

		
		if (c1 != 't' && c1 != 'f')
			System.out.print("Char must be t or f");
		else
		{
			System.out.print("Enter second char:");
			char c2 = scanner.nextLine().charAt(0);
		
			if (c2 != 't' && c2 != 'f')
				System.out.print("Char must be t or f");
			else
			{
				int result = 0;
				if (c1 == 't')
					result += 2;
				if (c2 == 't')
					result += 1;
				
				System.out.print(result);
			}
		}
		
		scanner.close();
	}

}
