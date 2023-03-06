import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoArraysTests {

	@Test
	void test()
	{
		var createArrays = new Create2Arrays();
        createArrays.CreateArraysFromString("This is a test");
        var array1 = createArrays.GetStringData();
        var array2 = createArrays.GetStringDataLengths();
        var maxItems = createArrays.GetMaxItems();
        
        assertEquals("This", array1[0]);
        assertEquals(4, array2[0]);
        assertEquals("is", array1[1]);
        assertEquals(2, array2[1]);
        assertEquals("a", array1[2]);
        assertEquals(1, array2[2]);
        assertEquals("test", array1[3]);
        assertEquals(4, array2[3]);
	}

}
