import java.util.Scanner;

public class MainProgram
{
	public static void main(String[] args)
	{
		Scanner scrn = new Scanner(System.in);
		
        do
        {
            PlayGame(scrn);

            System.out.print("Would you like to play again (y/n)? ");
            String input = scrn.nextLine().toLowerCase();
            if (input.equals("n"))
            {
                break;
            }

        } while (true);
        
        scrn.close();
	}


    private static void PlayGame(Scanner scrn)
    {
        var board = new Board();
        board.InitBoard();

        do
        {
            DisplayBoard(board);
            int row = AskUserInput("Please Enter the Row Number: ", scrn);
            int column = AskUserInput("Please Enter the Column Number: ", scrn);
            var toggleList = GetToggleList(board, row, column);
            if (toggleList == null)
            {
                continue;
            }

            board.ToggleBoard(toggleList);
            if (!board.Win())
            {
                continue;
            }

            System.out.println("You Win !!!!");
            scrn.nextLine();
            
            return;

        } while (true);
    }

    private static int AskUserInput(String prompt, Scanner scrn)
    {
        do
        {
            System.out.print(prompt);
            int num = scrn.nextInt();
            if ((num >= 1) && (num <= 3))
            {
                return num;
            }

            System.out.print("Incorrect Input, Please Enter 1, 2 or 3.");
        } while (true);
    }


    private static Boolean[][] GetToggleList(Board board, int row, int column)
    {
        if (((row < 1) || (row > board.BoardSize)) ||
            (column < 1) || (column > board.BoardSize))
        {
            return null;
        }

        if ((row == 1) && (column == 1))
        {
            return board.Toggle0_0;
        }

        if ((row == 1) && (column == 2))
        {
            return board.Toggle0_1;
        }

        if ((row == 1) && (column == 3))
        {
            return board.Toggle0_2;
        }

        if ((row == 2) && (column == 1))
        {
            return board.Toggle1_0;
        }

        if ((row == 2) && (column == 2))
        {
            return board.Toggle1_1;
        }

        if ((row == 2) && (column == 3))
        {
            return board.Toggle1_2;
        }

        if ((row == 3) && (column == 1))
        {
            return board.Toggle2_0;
        }

        if ((row == 3) && (column == 2))
        {
            return board.Toggle2_1;
        }

        if ((row == 3) && (column == 3))
        {
            return board.Toggle2_2;
        }

        return null;
    }

    private static void DisplayBoard(Board board)
    {
    	System.out.println("Current Board:");

        for (int row = 0; row < board.BoardSize; row++)
        {
            if (row == 0)
            {
            	System.out.println("   1  2  3");
            	System.out.println("   -------");
            }

            for (int column = 0; column < board.BoardSize; column++)
            {
                if (column == 0)
                {
                	System.out.printf("%d| ", row + 1);
                }

                int state = board.GetCellState(row, column) ? 1 : 0;
                System.out.printf("%d  ", state);
            }

            System.out.println();
        }
    }
}
