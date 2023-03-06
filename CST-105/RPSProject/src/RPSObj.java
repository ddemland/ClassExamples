import java.util.Random;

public class RPSObj
{
	static final int UserRock = 1;
	static final int UserPaper = 2;
	static final int UserScissors = 3;
	static final int ComputerRock = 4;
	static final int ComputerPaper = 5;
	static final int ComputerScissors = 6;
	
	static final int PlayerWins = 1;
	static final int ComputerWins = 2;
	static final int Tie = 3;
	
	private int ComputerSelection;
	
	RPSObj()
	{
	}

	RPSObj(int compSetting)
	{
		ComputerSelection = compSetting;
	}

	public void ComputerGuess()
	{
		Random random = new Random();
		ComputerSelection = random.nextInt() % 3 + 4;
	}
	
	public int Compare(int userSelection)
	{
		int outcome = userSelection * ComputerSelection;
		switch (outcome)
		{
			case 6, 8, 15:
				return PlayerWins;

			case 5, 12:
				return ComputerWins;

			default:
				return Tie;
		}
	}
}
