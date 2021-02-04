package lection23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionStream
{

    public static void main(String[] args)
    {
	Consumer<String> p = (s)->
	{
	    System.out.println(s);
	};
	
	List<String> brothers = Arrays.asList("1", "2", "3");

	brothers.stream().forEach(p);
    }

}
