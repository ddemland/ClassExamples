
public class IntStack
{
	private final int MaxStckSize = 5;
	private int[] stack;
	private int index;
	
	public IntStack()
	{
		stack = new int[MaxStckSize];
		index = 0;
	}

	public int Pop()
	{
		if (index <= 0)
		{
			throw new ArrayStoreException();
		}
		
		return stack[-- index];
	}
	
	public void Push(int num)
	{
		if (index >= MaxStckSize)
		{
			throw new ArrayStoreException();
		}
		
		stack[index ++] = num;
	}
}
