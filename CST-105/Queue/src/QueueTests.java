import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTests {

	@Test
	void testQueue()
	{
		var queue = new QueueObj();
		queue.Add(1);
		queue.Add(2);
		queue.Add(3);
		queue.Add(4);
		queue.Add(5);
		queue.Add(6);
		assertEquals(1, queue.Remove());
		assertEquals(2, queue.Remove());
		assertEquals(3, queue.Remove());
		assertEquals(4, queue.Remove());
		assertEquals(5, queue.Remove());
		assertEquals(-1, queue.Remove());
	}

}
