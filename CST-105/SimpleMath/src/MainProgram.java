
public class MainProgram
{

	public static void main(String[] args)
	{
		//  Multiply
		int product = 3 * 5;
		System.out.printf("product: %d\n", product);

		//  Factorial
		int total = 1;
		for (int cnt = 5; cnt > 0; cnt --)
		{
			total *= cnt;
		}

		System.out.printf("total: %d\n", total);

		//  Power
		long answer = 3;  //  must start at base value
		for (int cnt = 1; cnt < 2; cnt ++)
		{
			answer *= 3;
		}

		System.out.printf("answer: %d\n", answer);
	}

}
