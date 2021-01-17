package exercise3;

import java.util.ArrayList;

public class CollectionShort
{
    public static void main (String[] args)
    {
	ArrayList<Student> students = new ArrayList<>();
	Student s = new Student("Ivan", 1);
	students.add(s);
	s = new Student("Pete", 2);
	students.add(s);
	
	for (Student student: students)
	{
	    System.out.println(student);
	}
    }
}
