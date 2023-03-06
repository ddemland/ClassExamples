
public class QueueObj
{
	private static final int QueueSize = 5;
	private int[] Queue;
	private int AddIdx;
	private int RemoveIdx;
	
	public QueueObj()
	{
		Queue = new int[QueueSize];
		AddIdx = 0;
		RemoveIdx = 0;
	}
	
	public void Add(int num)
	{
		if (AddIdx < QueueSize)
		{
			Queue[AddIdx ++] = num;
		}
	}

	public int Remove()
	{
		if (RemoveIdx < QueueSize)
		{
			return Queue[RemoveIdx ++];
		}
		
		return -1;
	}
	
	public void RestQueue()
	{
		AddIdx = 0;
		RemoveIdx = 0;
	}
}
