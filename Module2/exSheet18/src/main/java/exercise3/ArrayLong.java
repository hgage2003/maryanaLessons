package exercise3;

public class ArrayLong
{

    public static void main(String[] args)
    {
	Student[] students = new Student[2];
	Student s = new Student("Ivan", 1);
	students[0] = s;
	s = new Student("Pete", 2);
	students[1] = s;
	
	int len = students.length;
	for (int i = 0; i < len; i++)
	{
	    Student student = students[i];
	    System.out.println(student);
	}
    }

}
