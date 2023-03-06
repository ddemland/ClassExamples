import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args)
	{
		var guesser = new BirthdayGuesser();
		var input = new Scanner(System.in);
		int day = 0;

		do
		{
			var currGrid = guesser.GetCurrentDayGrid();
			for (var row = 0; row < BirthdayGuesser.GridSize; row ++)
			{
				for (var column = 0; column < BirthdayGuesser.GridSize ; column ++)
				{
					System.out.printf("%4d", currGrid[row][column]);
				}
				
				System.out.println();
			}

			System.out.println();
			System.out.print("Is your birthday in this set Set? (y/n) ");
			var answer = input.nextLine().toLowerCase();
			if (answer.equals("y"))
			{
				day += guesser.GetAddDays();
			}
			
		} while (guesser.NextGrid());
		
		System.out.println("Your birthday is " + day);
	}

}
