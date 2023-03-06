import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args)
	{
		var scanner = new Scanner(System.in);
		var num = GetUserInput(scanner);
		var str = HeadsAndTails.GetHeadsAndTailsStr(num);
		OutputGrid(str);
		scanner.close();
	}
	
	private static int GetUserInput(Scanner scanner)
	{
		var num = -1;
		do
		{
			System.out.print("Enter a number between 0 and 511: ");
			num = scanner.nextInt();
			if ((num < 0) || (num > 511))
			{
				System.out.println("Please enter a number between 0 and 511.");
				continue;
			}
			
			break;
		} while (true);
		
		return num;
	}
	
	private static void OutputGrid(String str)
	{
		for (var idx = 0; idx < str.length(); idx ++)
		{
			System.out.print(str.charAt(idx) + " ");
			if (idx % 3 == 2)
			{
				System.out.println();
			}
		}
	}
}
