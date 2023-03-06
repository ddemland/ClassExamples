import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void test()
	{
		assertEquals(-1, Comparison.Compare(1, 5));
		assertEquals(0, Comparison.Compare(3, 3));
		assertEquals(1, Comparison.Compare(5, 1));
	}

}
