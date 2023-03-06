
public class Runner
{
	public int Multiply(int num1, int num2)
	{
		int product = num1 * num2;
		return product;
	}
	
	public int Factorial(int num)
	{
		int total = 1;
		for (int cnt = num; cnt > 0; cnt --)
		{
			total *= cnt;
		}
		
		return total;
	}
	
	public long Power(int base, int power)
	{
		long total = base;
		
		for (int cnt = 1; cnt < power; cnt ++)
		{
			total *= base;
		}
		
		return total;
	}
}
