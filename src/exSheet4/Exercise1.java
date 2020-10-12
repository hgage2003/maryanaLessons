package exSheet4;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter id:");
		int x = scanner.nextInt();
		
		if (x < 1000000 || x > 9999999)
			System.out.print ("Wrong id, it must be 7 digits");
		else
		{
			int code = x / 100000;
			
			if (code != 50 && code != 51 && code != 61)
				System.out.print ("Wrong id, it must start with 50, 51 or 61");
			else
				System.out.print ("The id is valid");
		}
		
		scanner.close();
	}

}
