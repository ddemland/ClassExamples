
public class Comparison
{
	public static int Compare(int num1, int num2)
	{
		if (num1 < num2)
		{
			return -1;
		}
		
		if (num1 == num2)
		{
			return 0;
		}
		
		return 1;
	}
}
