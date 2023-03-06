import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RPSProjectTests {

	@Test
	void testCompare()
	{
		RPSObj obj = new RPSObj(RPSObj.ComputerRock);
		assertEquals(RPSObj.Tie, obj.Compare(RPSObj.UserRock));
		assertEquals(RPSObj.PlayerWins, obj.Compare(RPSObj.UserPaper));
		assertEquals(RPSObj.ComputerWins, obj.Compare(RPSObj.UserScissors));

		obj = new RPSObj(RPSObj.ComputerPaper);
		assertEquals(RPSObj.ComputerWins, obj.Compare(RPSObj.UserRock));
		assertEquals(RPSObj.Tie, obj.Compare(RPSObj.UserPaper));
		assertEquals(RPSObj.PlayerWins, obj.Compare(RPSObj.UserScissors));

		obj = new RPSObj(RPSObj.ComputerScissors);
		assertEquals(RPSObj.PlayerWins, obj.Compare(RPSObj.UserRock));
		assertEquals(RPSObj.ComputerWins, obj.Compare(RPSObj.UserPaper));
		assertEquals(RPSObj.Tie, obj.Compare(RPSObj.UserScissors));
	}

}
