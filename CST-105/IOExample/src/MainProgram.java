import java.util.Scanner;

public class MainProgram
{

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter the number of Drinks: ");
		int numDrinks = scnr.nextInt();

		System.out.print("Enter the number of Tacos: ");
		int numTacos = scnr.nextInt();

		IOExample ioExample = new IOExample();
		int total = ioExample.XYBookTacoAndDrinks(numDrinks, numTacos);
		System.out.printf("Your total bill is: $%d.00\n", total);
		scnr.nextLine();

		System.out.print("Enter a number: ");
		String numStr = scnr.nextLine();
		boolean isNumeric = numStr.chars().allMatch(Character::isDigit);
		if (isNumeric)
		{
			System.out.println("String entered is all numeric.");
		}
		else
		{
			System.out.println("String entered is not numeric.");
		}
		
		System.out.print("Enter a string: ");
		String textStr = scnr.nextLine();
		System.out.print("Enter a character to count: ");
		try
		{
			char ch = (char) System.in.read();
			int cnt = ioExample.CharacterCount(textStr, ch);
			System.out.printf("Number of %c's found in \"%s\" is %d", ch, textStr, cnt);
		}
		
		catch (Exception ex)
		{
		}

		scnr.close();
	}

}
