import java.util.ArrayList;

public class Student
{
	private String FirstName;
	private String LastName;
	ArrayList<Assignment> Assignments;
	
	public Student(String firstName, String lastName)
	{
		FirstName = firstName;
		LastName = lastName;
		Assignments = new ArrayList<Assignment>();
	}
	
	public String GetFirstName()
	{
		return FirstName;
	}
	
	public String GetLastName()
	{
		return LastName;
	}
}
