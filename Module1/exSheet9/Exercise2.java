package exSheet9;

import java.util.Scanner;

public class Exercise2 {
	public static char[] play(char[] string)
	{
		final String vowels = "aeiou";
		int resSize = string.length;
		
		// вычисляем размер новой строки
		// на каждую гласную нужно +2 символа
		for (int i = 0; i < string.length; i++)
		{
			if (vowels.contains(String.valueOf(string[i])))
					resSize += 2;
		}
		
		char[] res = new char[resSize];
		// индекс будет отличаться из-за дополнительных слогов
		int newIndex = 0;
		for (int i = 0; i < string.length; i++)
		{
			res[newIndex++] = string[i];
			if (vowels.contains(String.valueOf(string[i])))
			{
				res[newIndex++] = 'b';
				res[newIndex++] = string[i];
			}
		}
		
		return res;
	}
	
	public static void main(String[] args)
	{
		System.out.print("Please enter string:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		
		char symbols[] = str.toCharArray();
		String result = String.valueOf(play(symbols));
		System.out.println(result);
	}
}
