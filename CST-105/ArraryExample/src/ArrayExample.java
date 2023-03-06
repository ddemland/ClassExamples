
public class ArrayExample
{
	public int AddArray(int[] array)
	{
		int total = 0;
		for (int item: array)
		{
			total += item;
		}
		
		return total;
	}
}
