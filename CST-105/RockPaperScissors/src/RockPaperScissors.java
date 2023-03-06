import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner( System.in );
		System.out.println("Welcome to Rock, Paper, Scissors.");
		int choice;
		String answer = "";

		do
		{
		    while (true)
		    {
		    	System.out.print("Please Select: 1 - Rock, 2 - Paper, 3 - Scissors. What is your selection? ");
		        choice = Integer.parseInt(scanner.nextLine());
		        if ((choice >= 1) && (choice <= 3))
		        {
		            break;
		        }

		        System.out.println("Please enter 1, 2, or 3.");
		    }
		    
			RPSGame.Items userChoice;
			switch (choice)
			{
				case 1:
					userChoice = RPSGame.Items.Rock;
					break;

				case 2:
					userChoice = RPSGame.Items.Paper;
					break;

				default:
					userChoice = RPSGame.Items.Scissors;
					break;
			}

		    var rpsGame = new RPSGame();
		    rpsGame.GetComputerSelection();
		    var status = rpsGame.ComputerWins(userChoice);
		    String compSelection = "";
		    String gameStatStr = "";
		    
		    switch (rpsGame.GetComputerChoice())
		    {
			    case Rock:
			    	compSelection = "Rock";
			    	break;
		    	
			    case Paper:
			    	compSelection = "Paper";
			    	break;
		    	
			    default:
			    	compSelection = "Scissors";
			    	break;
		    	
		    }

		    switch (status)
		    {
		        case ComputerWin:
		            gameStatStr = "Computer Wins";
		            break;

		        case PlayerWin:
		            gameStatStr = "Player Wins";
		            break;

		        default:
		            gameStatStr = "Tie";
		            break;
		    }
		    
		    System.out.printf("Computer Selected %s\n", compSelection);
		    System.out.printf("Game Status: %s\n", gameStatStr);

		    while (true)
		    {
		    	System.out.print("Do you want to play again? (y / n) ");
		        answer = scanner.nextLine().toLowerCase();
		        if (
		        		(answer.equals("n")) ||
		                (answer.equals("y"))
		            )
		        {
		            break;
		        }
		    }
		} while (!answer.equals("n"));
		
		scanner.close();
	}

}
