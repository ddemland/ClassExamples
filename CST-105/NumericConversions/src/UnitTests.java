import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void testNumericStrToInt()
	{
		NumericConversions convert = new NumericConversions();
		assertEquals(23, convert.NumericStrToInt("23"));
		assertEquals(156, convert.NumericStrToInt("156"));
	}

	@Test
	void testPower()
	{
		NumericConversions convert = new NumericConversions();
		assertEquals(1, convert.Power(10, 0));
		assertEquals(10, convert.Power(10, 1));
		assertEquals(100, convert.Power(10, 2));
	}

	@Test
	void testIsHexString()
	{
		NumericConversions convert = new NumericConversions();
		assertFalse(convert.IsHexString("123G"));
		assertTrue(convert.IsHexString("12AB"));
	}

	@Test
	void testHexStrToInt()
	{
		NumericConversions convert = new NumericConversions();
		assertEquals(26, convert.HexStrToInt("1A"));
		assertEquals(7487, convert.HexStrToInt("1d3f"));
	}

	@Test
	void testIsBinaryString()
	{
		NumericConversions convert = new NumericConversions();
		assertFalse(convert.IsBinaryString("123G"));
		assertTrue(convert.IsBinaryString("100110"));
	}

	@Test
	void testBinaryStrToInt()
	{
		NumericConversions convert = new NumericConversions();
		assertEquals(22, convert.BinaryStrToInt("10110"));
		assertEquals(53, convert.BinaryStrToInt("0110101"));
	}
}
