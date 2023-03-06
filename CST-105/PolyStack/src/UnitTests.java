import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void testStackBasics()
	{
        StackableObject intObj = new StackableInt(1);
        StackableObject doubleObj = new StackableDouble(5.32f);
        StackableObject stringObj = new StackableString("Testing");
        var stack = new PolyStackObj();

        stack.Push(intObj);
        stack.Push(doubleObj);
        stack.Push(stringObj);
        
        assertEquals("Testing", stack.Pop().GetData());
        assertEquals("5.32", stack.Pop().GetData());
        assertEquals("1", stack.Pop().GetData());
 	}

}
