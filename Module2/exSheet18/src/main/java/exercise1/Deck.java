package exercise1;

import java.util.ArrayList;
import java.util.Random;

public class Deck
{
    private ArrayList<Card> cards;
    
    public Deck()
    {
	cards = new ArrayList<>();
	for (Card.Suit s: Card.Suit.values())
	    for (Card.Rank r: Card.Rank.values())
		cards.add(new Card(r, s));
    }
    
    public int size()
    {
	return cards.size();
    }
    
    Card drawCard()
    {
	if (size() == 0)
	    throw new RuntimeException("No cards left!");
	
	Random gen = new Random();
	int cardNum = gen.nextInt(size());
	
	return cards.remove(cardNum);
    }

    public static void main(String[] args)
    {
	Deck d = new Deck();
	int i=0;
	
	while (d.size() > 0)
	{
	    ++i;
	    System.out.println(String.valueOf(i) + ": " + d.drawCard());
	}
    }

}
