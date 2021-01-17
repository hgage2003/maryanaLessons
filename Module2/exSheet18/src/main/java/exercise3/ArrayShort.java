package exercise3;

public class ArrayShort
{

    public static void main(String[] args)
    {
	Student[] students = new Student[2];
	Student s = new Student("Ivan", 1);
	students[0] = s;
	s = new Student("Pete", 2);
	students[1] = s;
	
	for (Student student: students)
	{
	    System.out.println(student);
	}
    }
}
