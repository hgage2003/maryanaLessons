package exSheet6;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) 
	{
		System.out.print ("Please enter number:");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		
		if (x < 0 || x > 1E6)
		{
			System.out.print ("ERROR: number is invalid");
			return;
		}
		
		// превращаем число в строку, а ее в массив символов
		char[] digits = String.valueOf(x).toCharArray();
		
		int result = 1;
		for (int i = 0; i < digits.length; i++)
		{
			// char - уже целочисленный тип. Чтобы получить значения цифр,
			// можем преобразовать char в string, а его в int
			int digit = Integer.valueOf(String.valueOf(digits[i]));
			
			// или воспользоваться тем, что в таблице символов цифры лежат 
			// последовательно
			// int digit = digits[i] - '0';
			
			result *= digit;
		}
		
		System.out.print("The cross product of number " + x + " is " + result);
	}

}
