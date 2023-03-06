import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void test()
	{
		ArrayExample arrayEx = new ArrayExample();
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int answer = arrayEx.AddArray(intArray);
		assertEquals(28, answer);
	}

}
