package exercise1;

public class List
{
    public static void main(String[] args)
    {
	Person people[] = new Person[100];
	
	for (int i = 0; i < people.length; i++)
	{
	    if (i % 2 == 0)
		people[i] = new Student();
	    else
		people[i] = new Professor();
	
	    System.out.println((i + 1) + " " + people[i].work());
	}	    
    }
}
