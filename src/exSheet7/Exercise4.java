package exSheet7;

import java.util.Scanner;

public class Exercise4 {
	
	public static void drawSimpleTriangle(int lines)
	{
		for (int i = 1; i <= lines; i++)
		{
			String line = "";
			for (int j = 0; j < i; j++)
			{
				line += "* ";
			}
			System.out.println(line);
		}
	}

	public static void drawTriangle(int lines)
	{
		String line;
		for (int i = 1; i <= lines; i++)
		{		
			int prependSpaces = lines - i;
			line = String.valueOf(' ').repeat(prependSpaces);
			for (int j = 0; j < i; j++)
			{
				line += "* ";
			}
			System.out.println(line);
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Please enter number of lines:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		
		drawSimpleTriangle(x);
		System.out.println();
		drawTriangle(x);
	}

}
