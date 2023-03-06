import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeadsAndTailsTests {

	@Test
	void testGetHeadsAndTailsStr()
	{
		var str = HeadsAndTails.GetHeadsAndTailsStr(84);
		assertEquals("HHTHTHTHH", str);

		str = HeadsAndTails.GetHeadsAndTailsStr(7);
		assertEquals("HHHHHHTTT", str);

		str = HeadsAndTails.GetHeadsAndTailsStr(0);
		assertEquals("HHHHHHHHH", str);

		str = HeadsAndTails.GetHeadsAndTailsStr(511);
		assertEquals("TTTTTTTTT", str);
	}

}
