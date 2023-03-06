import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClosestPairTests {

	@Test
	void test()
	{
		double[][] points =
			{
				{-1, 3},
				{-1,-1},
				{1, 1},
				{2, 0.5F},
				{2, -1},
				{3, 3},
				{4, 2},
				{4, -0.5}
			};
		
		var retList = ClosestPair.FindClosestPair(points);
		assertEquals(1, retList[0][0]);
		assertEquals(1, retList[0][1]);
		assertEquals(2, retList[1][0]);
		assertEquals(0.5, retList[1][1]);
	}

}
