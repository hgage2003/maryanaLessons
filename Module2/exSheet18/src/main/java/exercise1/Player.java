package exercise1;

import java.util.ArrayList;

public class Player
{
    private String name;
    private ArrayList<Card> hand;
    
    public Player(String name)
    {
	this.hand = new ArrayList<>();
	this.name = name;
    }
    
    void take(Card card)
    {
	hand.add(card);
    }

    @Override
    public String toString()
    {
	return "Player [name=" + name + ", hand=" + hand + "]";
    }
    
    public static void main(String[] args)
    {
	Deck d = new Deck();
	Player player1 = new Player("Andrey");
	
	for (int i = 0; i < 5; i++)
	    player1.take(d.drawCard());
	
	System.out.println(player1);
    }
}
