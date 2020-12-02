package bonus;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise2_hangman {

	final private static String words[] = {"Apple", "Table", "Hangman", "Packman"};
	
	public static void main(String[] args) 
	{
		// pick a word from array
		int ind = new Random().nextInt(words.length);
		final String answer = words[ind];
		
		// make output char array of '-'
		char guess[] = new char[answer.length()];
		Arrays.fill(guess, '-');
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 1;
		boolean won = false;
		
		while (i <= 15 && !won)
		{	
			System.out.println(guess);
			System.out.print("Attempt " + String.valueOf(i) + ". Please enter letter: ");
			
			// pick only first char -> keep lowercase
			char ch = scanner.next().toLowerCase().charAt(0);
			
			// find first entry
			int index = answer.toLowerCase().indexOf(ch);
			
			// fill every entry in guess
			while (index != -1)
			{
				guess[index] = answer.charAt(index);
				index = answer.toLowerCase().indexOf(ch, index + 1);
			}
			
			if (answer.equals(String.valueOf(guess)))
				won = true;
			
			i++;
		}
		scanner.close();
		
		System.out.println("Hidden word: " + String.valueOf(answer));
		
		if (won)
			System.out.println("Congratulations! You won!");
		else
			System.out.println("You lost");
	}
}
