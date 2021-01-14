package exercise1;

import java.util.Map;

public class Card implements Comparable<Card>
{
    public enum Suit
    {
        Spades,
        Hearts,
        Diamonds,
        Clubs
    }

    public enum Rank
    {
        Ace,
        /*Two,
        Three,
        Four,
        Five,
        Six,*/
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King
    }
    
    private Rank rank;
    private Suit suit;
    
    public Card(Rank rank, Suit suit)
    {
	this.rank = rank;
	this.suit = suit;
    }

    @Override
    public String toString()
    {
	return rank + " of " + suit;
    }

    @Override
    public int compareTo(Card o)
    {
	// Clubs > Spades > Hearts > Diamonds
	Map<Card.Suit, Integer> suitWeight = 
		Map.of(Suit.Clubs, 3, Suit.Spades, 2, Suit.Hearts, 1, Suit.Diamonds, 0);
	
	Map<Card.Rank, Integer> rankWeight = 
		Map.of(Rank.Seven, 0, Rank.Eight, 1, Rank.Nine, 2, Rank.Queen, 3,
			Rank.King, 4, Rank.Ten, 5, Rank.Ace, 6, Rank.Jack, 100);
	
	int thisWeight = suitWeight.get(getSuit()) * 10 + rankWeight.get(getRank());
	int otherWeight = suitWeight.get(o.getSuit()) * 10 + rankWeight.get(o.getRank());
	
	return otherWeight - thisWeight;
    }

    public Rank getRank()
    {
        return rank;
    }

    public Suit getSuit()
    {
        return suit;
    }
}
