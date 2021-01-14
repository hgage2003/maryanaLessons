package exercise2;

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
	ArrayList<Card> cards = new ArrayList<>();
	
	while (d.size() > 0)
	{
	    cards.add(d.drawCard());
	}
	
	cards.sort(null);
	
	for (Card c: cards)
	    System.out.println(c);
    }

}
