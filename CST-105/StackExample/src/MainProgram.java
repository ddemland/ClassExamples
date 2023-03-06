import java.util.Scanner;

public class MainProgram
{
	public static void main(String[] args)
	{
		IntStack stack = new IntStack();
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("This is a stack test program.");
		boolean done = false;
		while (!done)
		{
			System.out.println("Select one:");
			System.out.println("   1 - Pop Value");
			System.out.println("   2 - Push Value");
			System.out.println("   3 - Exit");
			System.out.println();
			System.out.print("Please enter an option: ");
			
			int option = GetMenuInput(scnr);
			switch (option)
			{
				case 1:
					try
					{
						int num = stack.Pop();
						System.out.printf("The value poped off the stack is: %d\n", num);
					}
					
					catch (ArrayStoreException ex)
					{
						System.out.println("The stack is empty, please try again.");
					}
					
					break;
					
				case 2:
					try
					{
						System.out.print("Please enter a value to push onto the stack: ");
						int num = GetInput(scnr);
						stack.Push(num);
					}
					
					catch(ArrayStoreException ex)
					{
						System.out.println("The stack is full, please remove an item before pushing another one.");
					}

					break;
				
				case 3:
					done = true;
					continue;
			}
		}
		
		System.out.println("Thank you for testing the stack.");
	}
	
	private static int GetInput(Scanner scnr)
	{
		return scnr.nextInt();
	}

	private static int GetMenuInput(Scanner scnr)
	{
		while (true)
		{
			int num = GetInput(scnr);
			if ((num < 1) || (num > 3))
			{
				System.out.println("Please enter a number between 1 and 3.");
				System.out.print("Please enter again: ");
				continue;
			}
			
			return num;
		}
		
	}
}
