package exercise4_treeset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Crossword
{
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel", "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};
    public static void main(String[] args)
    {
	TreeSet<String> t1 = new TreeSet<>(new Comparator<String>() {
	        @Override
	        public int compare(String s1, String s2) 
	        {
	            if (s1.length() == s2.length())
	        	return s1.compareTo(s2);
	            else
	        	return s1.length() - s2.length();
	        }
	    });
	
	t1.addAll(Arrays.asList(alleWoerter));
	
	for (String wort : t1)
	    System.out.println(wort);
    }
}