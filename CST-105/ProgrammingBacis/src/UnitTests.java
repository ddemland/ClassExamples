import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void test()
	{
		assertTrue(ProgrammingBacis.NumberIsEven(20));
		assertFalse(ProgrammingBacis.NumberIsEven(3));
		
		assertEquals(42.18596875, ProgrammingBacis.MilesToKilomters(26, 385));
		
		assertEquals(49, ProgrammingBacis.FeetInFathom(7));
	}

}
