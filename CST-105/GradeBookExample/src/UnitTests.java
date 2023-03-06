import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void testAssignment()
	{
		Assignment assignment = new Assignment("Assignment 1");
		assertEquals("Assignment 1", assignment.GetName());
		assertEquals(0, assignment.GetScore());
		
		assignment.SetScore(80);
		assertEquals(80, assignment.GetScore());
	}

	@Test
	void testStudent()
	{
		Student student = new Student("John", "Doe");
		assertEquals("John", student.GetFirstName());
		assertEquals("Doe", student.GetLastName());
		assertEquals(0, student.Assignments.size());
		
		Assignment assignment = new Assignment("Assignment 1");
		assignment.SetScore(80);
		student.Assignments.add(assignment);
		assertEquals(1, student.Assignments.size());

		Assignment checkAssignment = student.Assignments.get(0);
		assertEquals("Assignment 1", checkAssignment.GetName());
		assertEquals(80, checkAssignment.GetScore());
	}

	@Test
	void testSubject()
	{
		Subject subject = new Subject("Professor", "Dave", "Programming I");
		Student student = new Student("John", "Doe");
		Assignment assignment = new Assignment("Assignment 1");
		assignment.SetScore(80);
		student.Assignments.add(assignment);
		subject.Students.add(student);
		assertEquals("Professor", subject.GetInstructorFirstName());
		assertEquals("Dave", subject.GetInstructorLastName());
		assertEquals("Programming I", subject.GetClassTitle());

		Student checkStudent = subject.Students.get(0);
		assertEquals("John", checkStudent.GetFirstName());
		assertEquals("Doe", checkStudent.GetLastName());
		assertEquals(1, checkStudent.Assignments.size());
		
		Assignment checkAssignment = checkStudent.Assignments.get(0);
		assertEquals("Assignment 1", checkAssignment.GetName());
		assertEquals(80, checkAssignment.GetScore());
	}
}
