import java.util.ArrayList;

public class TestGrader
{
	public static ArrayList<String> GradeTests(char[][] testScores, char[] answerList)
	{
		var testStatus = new ArrayList<String>();

		for (var row = 0; row < testScores.length; row ++)
		{
			var correctCnt = 0;
			for (var column= 0; column < testScores[row].length; column ++)
			{
				if (testScores[row][column] == answerList[column])
				{
					correctCnt ++;
				}
			}
			
			var str = "Student " + row + "'s correct count is " + correctCnt;
			testStatus.add(str);
		}
		
		return testStatus;
	}
}
