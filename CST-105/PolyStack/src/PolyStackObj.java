
public class PolyStackObj
{
	private final int MaxStckSize = 5;
	private StackableObject[] stack;
	private int index;
	
	public PolyStackObj()
	{
		stack = new StackableObject[MaxStckSize];
		index = 0;
	}

	public StackableObject Pop()
	{
		if (index <= 0)
		{
			throw new ArrayStoreException();
		}
		
		return stack[-- index];
	}
	
	public void Push(StackableObject item)
	{
		if (index >= MaxStckSize)
		{
			throw new ArrayStoreException();
		}
		
		stack[index ++] = item;
	}
}
