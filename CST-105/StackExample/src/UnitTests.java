import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void test()
	{
		IntStack stack = new IntStack();
		assertThrows(ArrayStoreException.class, () -> {
	    	stack.Pop();
	    });
		
		stack.Push(1);
		int checkVal = stack.Pop();
		assertEquals(1, checkVal);
		
		stack.Push(1);
		stack.Push(2);
		stack.Push(3);
		stack.Push(4);
		stack.Push(5);

		assertThrows(ArrayStoreException.class, () -> {
	    	stack.Push(6);
	    });
	}

}
