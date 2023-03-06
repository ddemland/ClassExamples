import java.util.Scanner;

public class MainProgram
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = scnr.nextInt();
		System.out.print("Enter a number: ");
		int num2 = scnr.nextInt();
		scnr.close();

		switch (Comparison.Compare(num1, num2))
		{
			case -1:
				System.out.print("First number is less than second number.");
				break;
				
			case 0:
				System.out.print("Both number are equal.");
				break;
				
			case 1:
				System.out.print("First number is greater than second number.");
				break;
		}
	}

}
