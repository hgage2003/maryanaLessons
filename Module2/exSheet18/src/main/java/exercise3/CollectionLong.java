package exercise3;

import java.util.*;

public class CollectionLong
{
    public static void main(String[] args)
    {
	ArrayList<Student> students = new ArrayList<>();
	Student s = new Student("Ivan", 1);
	students.add(s);
	s = new Student("Pete", 2);
	students.add(s);
	
	Iterator<Student> iterator = students.iterator();
	while (iterator.hasNext())
	{
	    Student student = iterator.next();
	    System.out.println(student);
	}
    }
}
