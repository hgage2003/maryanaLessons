package exercise1;

public class Card
{
    public  enum Suit
    {
        Spades,
        Hearts,
        Diamonds,
        Clubs
    }

    public enum Rank
    {
        Ace,
        Two,
        Three,
        Four,
        Five,
        Six,
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
}
