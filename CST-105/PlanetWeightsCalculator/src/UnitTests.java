import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void test()
	{
		double delta = 0.1d;
		WeightCalculator calculator = new WeightCalculator(100);
		
		assertEquals(100.0d, calculator.OnEarth(), delta);
		assertEquals(38.0d, calculator.OnMercury(), delta);
		assertEquals(91.0d, calculator.OnVenus(), delta);
		assertEquals(17.0d, calculator.OnMoon(), delta);
		assertEquals(38.0d, calculator.OnMars(), delta);
		assertEquals(254.0d, calculator.OnJupiter(), delta);
		assertEquals(108.0d, calculator.OnSaturn(), delta);
		assertEquals(91.0d, calculator.OnUranus(), delta);
		assertEquals(119.0d, calculator.OnNeptune(), delta);
		assertEquals(6.0d, calculator.OnPluto(), delta);
		assertEquals(2790.0d, calculator.OnSun(), delta);
	}

}
