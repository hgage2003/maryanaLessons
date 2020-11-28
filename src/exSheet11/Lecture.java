package exSheet11;

public class Lecture
{
	private String name;
	private String lecturer;
	private String course;
	
	public Lecture(String name, String lecturer, String course)
	{
		this.name = name;
		this.lecturer = lecturer;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Lecture [name=" + name + ", lecturer=" + lecturer + ", course=" + course + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

}
