import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FeetAndMetersTests {

	@Test
	void test()
	{
		var answer = 1 / 3.2808;
		assertEquals(0.30, answer, .01);

		answer = 2 * 3.2808;
		assertEquals(6.56, answer, .01);
	}

}
