package exercise3_hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman
{
    final private static String words[] = {"Apple", "Table", "Hangman", "Packman"};
	
    private String answer;
    private char[] guess;
    private int tries = 1;
    
    public Hangman()
    {
	int ind = new Random().nextInt(words.length);
	answer = words[ind];
	
	guess = new char[answer.length()];
	Arrays.fill(guess, '-');
    }
    
    public boolean isWon()
    {
	if (answer.equalsIgnoreCase(getGuess()))
	    return true;
	
	return false;
    }
    
    public boolean end()
    {
	if (tries >= 15)
	    return true;
	
	return isWon();
    }
    
    public void play(String str)
    {
	tries++;
	
	if (str.length() == 1)
	{
	    for (int i = 0; i < answer.length(); i++)
		if (answer.toLowerCase().charAt(i) == str.toLowerCase().charAt(0))
		    guess[i] = answer.charAt(i);
	}
	// try to guess whole word
	else
	{
	    if (str.equalsIgnoreCase(answer))
		guess = answer.toCharArray();
	}
    }

    public String getAnswer()
    {
        return answer;
    }

    public int getTries()
    {
        return tries;
    }

    public String getGuess()
    {
        return new String(guess);
    }
    
    public static void main(String[] args) 
    {
	Hangman game = new Hangman();
	
	try (Scanner scanner = new Scanner(System.in);)
	{	    
	    while (!game.end())
	    {	
		System.out.println(game.getGuess());
		System.out.print("Attempt " + String.valueOf(game.getTries()) + ". Please enter letter or word: ");
			
		String str = scanner.next();
		game.play(str);
	    }
	}
		
	System.out.println("Hidden word: " + game.getAnswer());
		
	if (game.isWon())
	    System.out.println("Congratulations! You won!");
	else
	    System.out.println("You lost");
    }
}
