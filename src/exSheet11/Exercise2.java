package exSheet11;

public class Exercise2 {

	public static void main(String[] args) 
	{
		Classroom room1 = new Classroom("I.2.1", 3);
		Classroom room2 = new Classroom("I.2.15", 10);
		
		System.out.println(room1);
		System.out.println(room2);
		
		Lecture math = new Lecture("Math", "Dr. Robotnik", "INF");
		room1.occupy(math);
		System.out.println(room1);
		
		Student students[] = new Student[4];
		students[0] = new Student("Ivan", 1);
		students[1] = new Student("Pete", 2);
		students[2] = new Student("Maria", 3);
		students[3] = new Student("Sam", 4);
		
		// fill room1
		room1.enter(students[0]);
		room1.enter(students[1]);
		room1.enter(students[2]);
		
		// ERROR: this one is extra
		room1.enter(students[3]);
		
		// free space
		room1.leave(students[0]);
		
		// now he fits
		room1.enter(students[3]);
		
		// ERROR: he left already
		room1.leave(students[0]);
		
		System.out.println(room1.getLecture());
		System.out.println(room2.getLecture());
	}
}
