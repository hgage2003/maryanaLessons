package exercise4;

import java.util.*;

public class VocabularyTrainer
{
    private HashMap<String, List<String>> english2German = new HashMap<>();
    String wordToGuess;
    
    public String getWordToGuess() 
    {
	return wordToGuess;
    }
    
    public void addToDictionary(String englishWord, List<String> german)
    {
	english2German.put(englishWord, german); 
    }
    
    public void createRandomWordToGuess()
    {
	List<String> keys = new ArrayList<>(english2German.keySet());
	int randomIndex = (int)(Math.random() * keys.size());
	wordToGuess = keys.get(randomIndex);
    }
    
    public boolean guess(String guess)
    {
	List<String> solution = english2German.get(wordToGuess);
	
	if (solution.contains(guess))
	    return true;
	
	return false;
    }
    
    public static void main(String[] args)
    {
	VocabularyTrainer guessingGame = new VocabularyTrainer();
	List<String> german = List.of("reinigen","säubern","putzen");
	guessingGame.addToDictionary("to clean", german);

	german = List.of("vergrößern","wachsen");
	guessingGame.addToDictionary("to expand", german);
	
	guessingGame.createRandomWordToGuess(); 
	try (Scanner scanner = new Scanner(System.in);)
	{
	    System.out.println("Was heißt \"" + guessingGame.getWordToGuess() + "\" auf Deutsch?"); 
	    String guess = scanner.nextLine();
	    boolean correct = guessingGame.guess(guess);
	    if (correct) 
		System.out.println("Korrekt!");
	    else 
		System.out.println("Leider falsch!");
	}
    }
}
