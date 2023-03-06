import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class SimpleStatsTests {

	@Test
	void testSimpleStats()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(6);
		list.add(2);
		list.add(8);
		list.add(5);
		assertEquals(1440, SimpleStats.CalcArrayItemProduct(list));
		assertEquals(4.166666666666666667, SimpleStats.CalcAverageItemList(list));
	}

}
