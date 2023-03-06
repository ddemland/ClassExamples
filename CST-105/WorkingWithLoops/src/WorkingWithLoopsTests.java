import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WorkingWithLoopsTests {

	@Test
	void testGCD()
	{
		var answer = Loops.GCD(16, 24);
		assertEquals(8, answer);
	}

	@Test
	void testTimeToDouble()
	{
		var time2Double = new TimeToDouble(10000.00f, 1.07f);
		assertEquals(11, time2Double.TotalTime());
	}

	@Test
	void testPalindrome()
	{
		assertTrue(Loops.IsPalindrome("radar"));
		assertTrue(Loops.IsPalindrome("madam"));
		assertFalse(Loops.IsPalindrome("Test"));
		assertFalse(Loops.IsPalindrome("Testing"));
		assertTrue(Loops.IsPalindrome("mom"));
		assertTrue(Loops.IsPalindrome("noon"));
	}

	@Test
	void testIsPrime()
	{
		assertTrue(Loops.IsPrime(11));
		assertTrue(Loops.IsPrime(179));
		assertFalse(Loops.IsPrime(50));
		assertFalse(Loops.IsPrime(180));
	}

	@Test
	void testFactorial()
	{
		assertEquals(120, Loops.Factorial(5));
		assertEquals(3628800, Loops.Factorial(10));
		assertEquals(39916800, Loops.Factorial(11));
	}
}
