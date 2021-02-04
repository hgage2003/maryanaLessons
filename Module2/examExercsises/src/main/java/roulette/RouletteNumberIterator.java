package roulette;

import java.util.Iterator;
import java.util.Random;

public class RouletteNumberIterator implements Iterator<Integer>
{
    private int zeroes;
    private Random rng;
    
    public RouletteNumberIterator()
    {
	zeroes = 0;
	rng = new Random();
    }

    @Override
    public boolean hasNext()
    {
	return (zeroes < 3);
    }

    @Override
    public Integer next()
    {
	
	Integer i = rng.nextInt(37);
	if (i == 0)
	    zeroes++;
	
	return i;
    }

    public static void main(String[] args)
    {
	RouletteNumberIterator it = new RouletteNumberIterator();
        while (it.hasNext())
 	   System.out.println(it.next());
    }
}
