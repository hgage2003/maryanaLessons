package roulette;

import java.util.Iterator;

public class RouletteNumbers implements Iterable <Integer>
{
   @Override
   public Iterator <Integer> iterator()
   {
       return new RouletteNumberIterator();
   }
   
   public static void main(String[] args)
   {
       RouletteNumbers numbers = new RouletteNumbers();
       for (int n: numbers)
	   System.out.println(n);
   }
}
