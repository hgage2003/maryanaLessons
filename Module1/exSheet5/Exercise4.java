package exSheet5;

import java.util.Scanner;

public class Exercise4 {
	
	public static Boolean isPrime(int num)
	{
		// чтобы не проверять отрицательные делители,
		// делаем все числа положительными
		if (num < 0)
			num *= -1;
		
		// 0, 1 и 2 - простые. Их не проверить в цикле
		if (num <= 2)
			return true;
		
		// цикл от 2 до числа, не включая само число
		for (int i = 2; i < num; i++)
		{
			// если делится без остатка - не простое
			if (num % i == 0)
				return false;
		}
		
		// не поделилось ни на что в цикле - простое
		return true;
	}

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter number:");
		int x = scanner.nextInt();
		
		if (isPrime(x))
			System.out.println(x + " is prime");
		else
			System.out.println(x + " is not prime");
		
		scanner.close();
	}

}
