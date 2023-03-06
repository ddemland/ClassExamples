import java.util.ArrayList;

public class Subject
{
	private String InstructorFirstName;
	private String InstructorLastName;
	private String ClassTitle;
	ArrayList<Student> Students;

	public Subject(String firstName, String lastName, String title)
	{
		InstructorFirstName = firstName;
		InstructorLastName = lastName;
		ClassTitle = title;
		Students = new ArrayList<Student>();
	}
	
	public String GetInstructorFirstName()
	{
		return InstructorFirstName;
	}
	
	public String GetInstructorLastName()
	{
		return InstructorLastName;
	}
	
	public String GetClassTitle()
	{
		return ClassTitle;
	}
}
