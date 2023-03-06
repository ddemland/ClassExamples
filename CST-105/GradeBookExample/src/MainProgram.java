
public class MainProgram
{
	public static void main(String[] args)
	{
		Subject subject = new Subject("Professor", "Dave", "Programming I");
		Student student = new Student("John", "Doe");
		Assignment assignment = new Assignment("Assignment 1");
		assignment.SetScore(80);
		student.Assignments.add(assignment);
		assignment = new Assignment("Assignment 2");
		assignment.SetScore(82);
		student.Assignments.add(assignment);
		subject.Students.add(student);

		student = new Student("Jane", "Smith");
		assignment = new Assignment("Assignment 1");
		assignment.SetScore(97);
		student.Assignments.add(assignment);
		assignment = new Assignment("Assignment 2");
		assignment.SetScore(100);
		student.Assignments.add(assignment);
		subject.Students.add(student);

		System.out.printf("Class \"%s\" will have the instructor %s %s\n\n", subject.GetClassTitle(),
					subject.GetInstructorFirstName(), subject.GetInstructorLastName());
		
		System.out.println("Students and Grades:");
		System.out.println();
		System.out.println("    First     Last");
		System.out.println("    --------------");
		for (int cnt = 0; cnt < subject.Students.size(); cnt ++)
		{
			student = subject.Students.get(cnt);
			System.out.printf("    %s    %s:\n", student.GetFirstName(), student.GetLastName());
			System.out.println("       Assignment    Score");
			System.out.println("       -------------------");
			for (int cnt2 = 0; cnt2 < student.Assignments.size(); cnt2 ++)
			{
				Assignment stdAssignment = student.Assignments.get(cnt2);
				System.out.printf("       %s    %d\n", stdAssignment.GetName(), stdAssignment.GetScore());
			}
			
			System.out.println();
		}
	}
}
