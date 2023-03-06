import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TwoArrayListsTests {

	@Test
	void test()
	{
		var list = new ArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("a");
		list.add("test.");
		
		var retList = Runner.ReverseLines(list);
		assertEquals("sihT", retList.get(0));
		assertEquals("si", retList.get(1));
		assertEquals("a", retList.get(2));
		assertEquals(".tset", retList.get(3));
	}

}
