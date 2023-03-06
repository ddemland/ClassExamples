
import java.util.Random;

public class RPSGame
{
	public enum Items
	{
		Rock,
        Paper,
        Scissors
	}

	public enum Status
	{
		ComputerWin,
        PlayerWin,
        Tie
	}
	
	private Items ComputerChoice;
	
    public RPSGame()
    {
    }

    public RPSGame(Items item)
    {
        ComputerChoice = item;
    }
    
    public Items GetComputerChoice()
    {
    	return ComputerChoice;
    }
	
    public void GetComputerSelection()
    {
    	Random rand = new Random();
        var item = rand.nextInt(3);
        switch(item)
        {
            case 0:
                ComputerChoice = Items.Rock;
                break;

            case 1:
                ComputerChoice = Items.Paper;
                break;

            case 2:
                ComputerChoice = Items.Scissors;
                break;
        }
    }

    public Status ComputerWins(Items item)
    {
        if ((ComputerChoice == Items.Rock) && (item == Items.Scissors))
        {
            return Status.ComputerWin;
        }

        if ((ComputerChoice == Items.Paper) && (item == Items.Rock))
        {
            return Status.ComputerWin;
        }

        if ((ComputerChoice == Items.Scissors) && (item == Items.Paper))
        {
            return Status.ComputerWin;
        }

        if (ComputerChoice == item)
        {
            return Status.Tie;
        }

        return Status.PlayerWin;
    }
}
