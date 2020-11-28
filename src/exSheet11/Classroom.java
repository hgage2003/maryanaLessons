package exSheet11;

import java.util.Arrays;

public class Classroom 
{
	private String id;
	private int capacity;
	private boolean occupied;
	private Lecture lecture;
	private Student[] students;
	private int studentsIn;
	
	public Classroom(String id, int capacity)
	{
		this.id = id;
		this.capacity = capacity;
		this.students = new Student[capacity];
		Arrays.fill(students, null);
		this.occupied = false;
		this.lecture = null;
		this.studentsIn = 0;
	}
	
	public Classroom(String id, int capacity, Lecture lecture)
	{
		this(id, capacity);
		this.lecture = lecture;
	}

	@Override
	public String toString()
	{
		String result = "Classroom [id=" + id + ", capacity=" + capacity + ", occupied=" + occupied + ", lecture=" + lecture
				+ "]";
		
		for (int i = 0; i < capacity; i++)
		{
			if (students[i] != null)
			{
				result += "\n" + students[i];
			}
		}
		
		return result;
	}

	public String getId()
	{
		return id;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public Lecture getLecture() 
	{
		return lecture;
	}
	
	public boolean occupy(Lecture lecture)
	{
		if (this.occupied)
			return false;
		
		if (lecture != null)
		{
			this.lecture = lecture;
			this.occupied = true;
			return true;
		}
		
		System.out.println("Error: lecture is null");
		return false;
	}
	
	public void free()
	{
		occupied = false;
		lecture = null;
	}
	
	public boolean enter(Student student)
	{
		if (studentsIn >= capacity)
		{
			System.out.println("Classroom " + this + " is full");
			return false;
		}
		
		for (int i = 0; i < students.length; i++)
		{
			if (students[i] != null)
				continue;
			
			students[i] = student;
			studentsIn++;
			return true;
		}
		
		// this is a good place for exception
		System.out.println("Error: studentsIn less than capacity, but no null elements in students array");
		return false;
	}
	
	public boolean leave(Student student)
	{
		for (int i = 0; i < students.length; i++)
		{
			if (students[i] == student)
			{
				students[i] = null;
				studentsIn--;
				return true;
			}
		}
		System.out.println("There is no student " + student + " in classroom " + this);
		return false;
	}
}
