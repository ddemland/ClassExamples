import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGradingTests {

	@Test
	void testGrading()
	{
		char[][] testScores = 
			{
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
			};
		
		char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		var status = TestGrader.GradeTests(testScores, key);
		assertEquals("Student 0's correct count is 7", status.get(0));
		assertEquals("Student 1's correct count is 6", status.get(1));
		assertEquals("Student 2's correct count is 5", status.get(2));
		assertEquals("Student 3's correct count is 4", status.get(3));
		assertEquals("Student 4's correct count is 8", status.get(4));
		assertEquals("Student 5's correct count is 7", status.get(5));
		assertEquals("Student 6's correct count is 7", status.get(6));
		assertEquals("Student 7's correct count is 7", status.get(7));
				
	}

}
