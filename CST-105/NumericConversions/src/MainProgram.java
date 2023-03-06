import java.util.Scanner;

public class MainProgram
{

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		NumericConversions convert = new NumericConversions();
		String numStr;
		while (true)
		{
			System.out.print("Enter a number: ");
			numStr = scnr.nextLine();
			if (numStr.chars().allMatch(Character::isDigit))
			{
				break;
			}
			
			System.out.println("Please enter only numers");
		}
		
		int answer = convert.NumericStrToInt(numStr);
		System.out.printf("The integer entered was: %d\n", answer);

		while (true)
		{
			System.out.print("Enter a hexadecimal number: ");
			numStr = scnr.nextLine();
			if (convert.IsHexString(numStr))
			{
				break;
			}
			
			System.out.println("Please enter only hexadecimal numers");
		}

		answer = convert.HexStrToInt(numStr);
		System.out.printf("The hexadecimal value is a decimal integer value: %d\n", answer);

		while (true)
		{
			System.out.print("Enter a binary number: ");
			numStr = scnr.nextLine();
			if (convert.IsBinaryString(numStr))
			{
				break;
			}
			
			System.out.println("Please enter only binary numers");
		}

		answer = convert.BinaryStrToInt(numStr);
		System.out.printf("The hexadecimal value is a decimal integer value: %d\n", answer);

		scnr.close();
	}

}
