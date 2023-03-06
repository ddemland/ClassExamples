import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void testXYBookExample()
	{
		IOExample ioExample = new IOExample();
		assertEquals(19, ioExample.XYBookTacoAndDrinks(2, 5));
	}

	@Test
	void testCharCount()
	{
		IOExample ioExample = new IOExample();
		assertEquals(3, ioExample.CharacterCount("abcadefaghi", 'a'));
	}
}
