import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTests
{

	@Test
	void testComputerWin()
	{
		RPSGame rpsGame = new RPSGame(RPSGame.Items.Scissors);
		assertEquals(RPSGame.Status.ComputerWin, rpsGame.ComputerWins(RPSGame.Items.Paper));
		assertEquals(RPSGame.Status.PlayerWin, rpsGame.ComputerWins(RPSGame.Items.Rock));
		assertEquals(RPSGame.Status.Tie, rpsGame.ComputerWins(RPSGame.Items.Scissors));

		rpsGame = new RPSGame(RPSGame.Items.Rock);
		assertEquals(RPSGame.Status.PlayerWin, rpsGame.ComputerWins(RPSGame.Items.Paper));
		assertEquals(RPSGame.Status.Tie, rpsGame.ComputerWins(RPSGame.Items.Rock));
		assertEquals(RPSGame.Status.ComputerWin, rpsGame.ComputerWins(RPSGame.Items.Scissors));

		rpsGame = new RPSGame(RPSGame.Items.Paper);
		assertEquals(RPSGame.Status.Tie, rpsGame.ComputerWins(RPSGame.Items.Paper));
		assertEquals(RPSGame.Status.ComputerWin, rpsGame.ComputerWins(RPSGame.Items.Rock));
		assertEquals(RPSGame.Status.PlayerWin, rpsGame.ComputerWins(RPSGame.Items.Scissors));
	}

}
