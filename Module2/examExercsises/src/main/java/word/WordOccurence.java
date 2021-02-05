package word;

import java.util.Collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordOccurence
{
    private TreeMap<Word, TreeSet<Position>> occurences = new TreeMap<>();
    
    WordOccurence insert(Word word, Position position)
    {
	if (this.occurences.containsKey(word))
	    this.occurences.get(word).add(position);
	else
	{
	    TreeSet<Position> positions = new TreeSet<>();
	    positions.add(position);
	    occurences.put(word, positions);
	}
	
	return this;
    }
    
    TreeSet<Position> getAll(Word word)
    {
	return occurences.get(word);
    }
    
    int numberOfOccurences(Word word)
    {
	return occurences.get(word).size();
    }
    
    Position getLastPosition(Word word)
    {
	return occurences.get(word).last();
    }
    
    public static void main(String[] args)
    {
	Word und = new Word("und");
	WordOccurence occurence = new WordOccurence();
	
	occurence.insert(und, new Position(1, 3));
	occurence.insert(und, new Position(3, 7));
	
	Position last = occurence.getLastPosition(und);
	System.out.println(last);
	
	Collection<Position> allPositions = occurence.getAll(und);
	System.out.println(allPositions);
	
	int numberOfOccurences = occurence.numberOfOccurences(und);
	System.out.println(numberOfOccurences);
    }
}
