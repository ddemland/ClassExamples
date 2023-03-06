import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTester
{
	@Test
	void TestMultiply()
	{
		Runner runner = new Runner();
		int answer = runner.Multiply(2, 10);
		assertEquals(20, answer);
	}

	@Test
	void TestFactorial()
	{
		Runner runner = new Runner();
		int answer = runner.Factorial(5);
		assertEquals(120, answer);
	}

	@Test
	void TestPower()
	{
		Runner runner = new Runner();
		long answer = runner.Power(3, 2);
		assertEquals(9, answer);
	}
}
